
package api ;

import java.net.*;
import java.io.*;

import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import game.*;


public class GraphGameServerThread extends Thread {
    private Socket socket = null;

    public GraphGameServerThread(Socket socket){
        super("GraphGameServerThread");
        this.socket = socket;
        System.out.println("Starting Thread server ");

    }

    public void run() {

        try ( 
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            ) {
            System.out.println("Starting thread");

            String inputLine = null;
            while (true) {
                if (in.ready()){
                    inputLine = in.readLine();
                    if (inputLine != null){
                        System.out.println(inputLine);
                        out.println(inputLine);
                        if (inputLine.equals("Bye"))
                            break;

                    }
                }
                

            }
            socket.close();
        } catch (IOException e) {

            System.err.println(e);
        }
    }
}

