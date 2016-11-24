
package api ;

import java.net.*;
import java.io.*;

import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import game.*;


public class GraphGameServerThread extends Thread {
    private Socket socket = null;

    BufferedReader in;
    PrintWriter out;
    IGraphGameServerDelegate delegate;

    public GraphGameServerThread(Socket socket){
        super("GraphGameServerThread");
        this.socket = socket;
        System.out.println("Starting Thread server ");
        try 
        {
          out = new PrintWriter(socket.getOutputStream(), true);
          in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      } catch (IOException e){
        System.err.println(e);
    }

}

public void setDelegate(IGraphGameServerDelegate d){
    delegate = d;
}

public void notifyPlayer(String colorMap){
    out.println(colorMap);
    out.flush();
}

public void run() {

    try {
        System.out.println("Starting thread");


        String inputLine = null;
        while (true) {
            if (in.ready()){
                inputLine = in.readLine();
                if (inputLine != null){
                    System.out.println(inputLine);
                    if (inputLine.equals("Bye"))
                        break;
                        // register input line to game instance
                    String colorMap = GraphServer.getInstance().parseCommand(inputLine);
                    delegate.notifyPlayers(colorMap);
                    // out.println(colorMap);
                    // out.flush();


                }
            }


        }
        socket.close();
    } catch (IOException e) {

        System.err.println(e);
    }
}
}

