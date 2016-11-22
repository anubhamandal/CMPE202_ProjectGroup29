import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Write a description of class GraphClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphClient  
{
    private volatile static GraphClient uniqueInstance;
    private static String hostName = "localhost";
    private static int portNumber = 8080;
    private Socket kkSocket;
    private PrintWriter out;
    private BufferedReader in;

    private ArrayList<String> actions = new ArrayList<String>();

    public class ThreadRunnable implements Runnable{
        public void run(){
            try {
                while (actions.size() == 0){
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ie) {
                System.out.println("Child thread interrupted! " + ie);
            }
        }
    }

    public class SocketRunnable implements Runnable {
        public void run() {
            System.out.println("runnable run");
            try  {

                while (true) {

                    String fromServer = null;
                    if (in.ready()){
                        fromServer = in.readLine();
                    }
                    if (fromServer != null){
                        System.out.println("Server: " + fromServer);
                        if (fromServer.equals("Bye."))
                            break;
                    }

                    // else if fromServer has colorMap
                    // populate the colorMap
                    //else
                    //{
                    //   Thread w = new Thread(new ThreadRunnable());
                    //   w.start();
                    //}

                    if (actions.size() > 0) {
                        System.out.println("Client: " + actions.get(0));
                        out.println(actions.get(0));
                        actions.remove(0);
                    }

                }
            } catch (UnknownHostException e) {
                System.err.println("Don't know about host " + hostName);
                System.exit(1);
            } catch (IOException e) {
                System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
                System.exit(1);
            } catch (Exception e) {
                System.err.println("Exception caused" + e);
                System.exit(1);
            } finally{
                try{
                    kkSocket.close();
                } catch (Exception e) {
                    System.err.println("exception thrown on socket close" + e);
                }

            }
            System.out.println("exiting socket thread");
        }
    }
    /**
     * Constructor for objects of class GraphClient
     */
    public GraphClient()
    {
        init();
    }

    private void init(){
        try  {

            kkSocket = new Socket(hostName, portNumber);
            out = new PrintWriter(kkSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(kkSocket.getInputStream()));

            Thread t = new Thread(new SocketRunnable());
            t.start();
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        } 
    }

    public void send(String payload){
        System.out.println("queue payload" + payload);
        actions.add(payload);

    }

    public static GraphClient getInstance() {
        if (uniqueInstance == null) {
            synchronized(GraphClient.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new GraphClient();
                }
            }
        }
        return uniqueInstance;
    }

}
