package api ;

import greenfoot.*;
import MainMenu.*;
import org.restlet.ext.jackson.*;
import org.restlet.ext.json.*;
import org.restlet.representation.*;
import org.restlet.resource.*;

import java.io.IOException;

public class GraphResource extends ServerResource {

    Menu menu = Menu.getInstance() ;
    BaseGraph base = menu.getActiveGraph();
    @Get
    public Representation get_request() {

        GraphJackson graphjackson = new GraphJackson();
        graphjackson.setColorMap(base.getColorMap());
        
        System.out.println("colormap is "+ base.getColorMap());
        return new JacksonRepresentation<GraphJackson>(graphjackson) ;
    }


    /**
     *
     * @param rep action:string,
     * @return
     */
    @Post
    public void post_request(Representation rep) throws IOException {

        JacksonRepresentation<GraphJackson> graphAction = new JacksonRepresentation<GraphJackson> (rep, GraphAction.class);
        GraphAction gaction = graphAction.getObject();

        String action = gaction.getAction();
        System.out.println( "action: " + action ) ;
        
//***************
// Take hash map, then set it inside BaseGraph usind update method

        if ( action.equals( "insert-quarter") ){
           // machine.insertQuarter() ;
            //System.out.println( "numQuarters: " + machine.quarters ) ;
        }


        if ( action.equals( "turn-crank") ){
           // machine.turnCrank();
            //System.out.println( "-numQuarters: " + machine.quarters ) ;

        }



        System.out.println("machine " + machine.toString());
//        JSONObject response = new JSONObject() ;
//        String state = machine.getStateString() ;
//        response.put( "result", state ) ;



    }
}

