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
    /**
    * Server returns the state of the Graph Game
    **/
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

        // Check to see if player is valid

        // increment player, then mod

        String color = gaction.getColor();
        System.out.println( "color: " + color ) ;

        base.updateColor(Utils.getInstance().stringToColor(color));
        base.setCountryColor(gaction.nodeid);


        // return state
        GraphJackson graphjackson = new GraphJackson();
        graphjackson.setColorMap(base.getColorMap());
        
        System.out.println("colormap is "+ base.getColorMap());
        return new JacksonRepresentation<GraphJackson>(graphjackson) ;

//        JSONObject response = new JSONObject() ;
//        String state = machine.getStateString() ;
//        response.put( "result", state ) ;



    }
}

