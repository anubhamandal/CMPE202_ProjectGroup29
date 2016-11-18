


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
        gserv.insertMove(123.0, "red");
        assertEquals("red", gserv.getMoves().get(123.0));
    }

    @Test
    public void testGetNodeColor() {
        gserv.insertMove(456.0, "blue");
        assertEquals("blue", gserv.getNodeColor(456.0));
    }

}
