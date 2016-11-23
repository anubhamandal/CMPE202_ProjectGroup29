
package api ;

import java.net.*;
import java.io.*;

import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import game.*;


public class GraphGameServerThread implements Runnable {
    private Socket socket = null;

    public GraphGameServerThread(Socket socket){
        super("GraphGameServerThread");
        this.socket = socket;
    }

    public void run() {

        System.out.println("What the what ");

        try ( 
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            ) {
            System.out.println("Starting server with hello jon ");

            out.println("Hello player");

            String inputLine = null;
            while (true) {
                if (in.ready()){
                    inputLine = in.readLine();
                }
                if (inputLine != null){
                    System.out.println(inputLine);
                    out.println(inputLine);
                    if (inputLine.equals("Bye"))
                        break;
                }

            }
            socket.close();
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}

