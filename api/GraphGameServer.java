
package api ;

import java.net.*;
import java.io.*;

import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import game.*;


public class GraphGameServer extends Application {

    public static void main(String[] args) throws Exception {
    //     Component server = new Component() ;
    //     server.getServers().add(Protocol.HTTP, 8080) ;
    //     server.getDefaultHost().attach(new GraphGameServer()) ;
    //     server.start();
    // }

    // @Override
    // public Restlet createInboundRoot() {
    //     Router router = new Router(getContext()) ;
    //     router.attach("/graphgame", GraphResource.class);        
    //     return router;
    // }

            System.out.println("What the what ");

    int portNumber = 8080;

    try ( 
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        ) {
            System.out.println("Starting server with hello jon ");
             
            // Initiate conversation with client
            // KnockKnockProtocol kkp = new KnockKnockProtocol();
            // outputLine = kkp.processInput(null);

            out.println("Hello player");
 
 String inputLine = null;
            while (true) {
                if (in.ready()){
                 inputLine = in.readLine();
                 if (inputLine != null){
                    System.out.println(inputLine);
                    out.println(inputLine);
                }
                }

                
                // outputLine = kkp.processInput(inputLine);
                //if (outputLine.equals("Bye."))
                //    break;
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }


}

