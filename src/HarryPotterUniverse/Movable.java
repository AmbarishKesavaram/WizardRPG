package HarryPotterUniverse;

/**
 * Interface for the actions
 * @author Raghu
 */
public interface Movable {

    /**
     * Abstract method for attack functionality
     * @return - integer value
     * @throws Exception - All exceptions and errors
     */
    public int attack() throws Exception;

    /**
     * Abstract method for defend functionality
     * @throws Exception - All exceptions and errors
     */
    public void defend() throws Exception;
}
