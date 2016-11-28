
import game.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.json.* ;

/**
 * The test class GraphServerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GraphServerTest
{
    GraphServer gserv;
    Integer gameId = 1;

    /**
     * Default constructor for test class GraphServerTest
     */
    public GraphServerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        gserv = GraphServer.getInstance();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        gserv.resetGame(gameId);
    }

    public void createGame(){
        String actionString = "{\"action\":\"createGame\",\"numPlayers\":3,\"playerId\":\"jonny5\",\"graphNum\":2}";
        gserv.parseCommand(actionString);
    }

    @Test
    public void testCreateGame() {
        String actionString = "{\"action\":\"createGame\",\"numPlayers\":3,\"playerId\":\"jonny5\",\"graphNum\":2}";
        JSONObject metaData = new JSONObject();
        metaData.put("gameId", 1);
        metaData.put("numPlayers", 3);
        metaData.put("graphNum", 2);
        assertEquals(metaData.toString(), gserv.parseCommand(actionString).toString());
    }

    @Test
    public void testMove() {
        assertNotNull(gserv.getMoves(gameId));
        gserv.insertMove(1, "red", gameId);
        assertEquals("red", gserv.getMoves(gameId).get(1));
    }

    /*
    @Test
    public void testGetNodeColor() {
    gserv.insertMove(4, "blue");
    assertEquals("blue", gserv.getNodeColor(4));
    }

    @Test
    public void testColorMapGet() {
    String actionString = "{\"color\":\"Yellow\",\"action\":\"insertMove\",\"nodeId\":1,\"playerId\":null}";
    assertEquals("{\"1\":\"Yellow\"}", gserv.parseCommand(actionString));
    }

    @Test
    public void testColorMapGetMore() {
    String actionString = "{\"color\":\"Yellow\",\"action\":\"insertMove\",\"nodeId\":1,\"playerId\":null}";

    assertEquals("{\"1\":\"Yellow\"}", gserv.parseCommand(actionString));

    actionString = "{\"color\":\"Red\",\"action\":\"insertMove\",\"nodeId\":2,\"playerId\":null}";
    assertEquals("{\"1\":\"Yellow\",\"2\":\"Red\"}", gserv.parseCommand(actionString));
    }
     */
}
