
/**
 * This class implements a transition between two states in the Markov model: 
 * an "origin" state and a "destination" state.  That is, each Transition 
 * object represents  a transition <i>from</i> the origin state <i>to</i> the 
 * destination state. Each Transition object stores a "count" that records the 
 * number of times we observe in the original text that the word associated 
 * with the destination state follows the word associate with the origin state.
 */
public class Transition
{
	// TODO: Create private instance variables
	
	/**
	 * Get the integer ID of the state this transition moves to.
	 * 
	 * @return the destination ID
	 */
	public int getDestinationId()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Set the integer ID of the state this transition moves to.
	 * 
	 * @param destinationId the destination ID
	 */
	public void setDestinationId(int destinationId)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Get the ID of the state this transition moves from.
	 * 
	 * @return
	 */
	public int getOriginId()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Set the ID of the state this transition moves from.
	 * 
	 * @param originId the ID of the state this transition moves from
	 */
	public void setOriginId(int originId)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Increment this transition's counter.
	 * 
	 * @return the new counter after it has been incremented
	 */
	public int incrementCount()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Get the counter variable associated with this transition.
	 * 
	 * @return the count
	 */
	public int getCount()
	{
		// TODO: Implement this method.
	}

}
