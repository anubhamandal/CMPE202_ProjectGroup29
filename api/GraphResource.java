package api ;

import game.*;
import org.json.* ;
import org.restlet.ext.jackson.*;
import org.restlet.ext.json.*;
import org.restlet.representation.*;
import org.restlet.resource.*;

import java.io.IOException;

public class GraphResource extends ServerResource {

    GraphServer gserv = GraphServer.getInstance() ;
    /**
    * Server returns the state of the Graph Game
    **/
    // @Get
    // public Representation get_request() {

    //     GraphJackson graphjackson = new GraphJackson();
    //     // TODO Get games - not moves

    //     graphjackson.setColorMap(gserv.getMoves());
        
    //     System.out.println("colormap is "+ gserv.getMoves());
    //     return new JacksonRepresentation<GraphJackson>(graphjackson) ;
    // }

     @Get
    public Representation get_request() throws JSONException {
       JSONObject mail = new JSONObject() ;
       mail.put( "status", "Received" ) ;
       mail.put( "subject", "RE: Message to Self" ) ;
       mail.put( "content", "Hello There!" ) ;
       return new JsonRepresentation ( mail ) ;
    }


    /**
     *
     * @param rep action:string,
     * @return
     */
    @Post
    public Representation post_request(Representation rep) throws IOException {

// TODO POST game name, # players, 
        // TODO POST join game
        

        JacksonRepresentation<GraphAction> graphAction = new JacksonRepresentation<GraphAction> (rep, GraphAction.class);
        GraphAction gaction = graphAction.getObject();

        // Check to see if player is valid

        // increment player, then mod

        String color = gaction.getColor();
        System.out.println( "color: " + color ) ;

        gserv.insertMove(gaction.getNodeId(), color);


        // return state
        GraphJackson graphjackson = new GraphJackson();
        graphjackson.setColorMap(gserv.getMoves());
        
        System.out.println("colormap is "+ graphjackson.getColorMap());
        return new JacksonRepresentation<GraphJackson>(graphjackson) ;

//        JSONObject response = new JSONObject() ;
//        String state = machine.getStateString() ;
        // response.put( "result", gj ) ;



    }
}

