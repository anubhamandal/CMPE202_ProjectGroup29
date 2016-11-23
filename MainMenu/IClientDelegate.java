package graphgame;

/**
 * Write a description of class IClientDelegate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IClientDelegate  
{
    /**
     * Server responds with move to client
     */
    public void receiveMove(String move);
}
