

import game.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GraphServerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GraphServerTest
{
    GraphServer gserv;

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
        gserv.resetGame();
    }

    @Test
    public void testMove() {
        assertNotNull(gserv.getMoves());
        gserv.insertMove(1, "red");
        assertEquals("red", gserv.getMoves().get(1));
    }

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

}
