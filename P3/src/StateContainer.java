import java.util.ArrayList;

/**
 * This class is used to store the state objects that comprise the Markov 
 * model.
 */
public class StateContainer 
{
	// TODO: Create private instance variables
	
	// HINT: Each object of this class needs a data structure to store an
	// 		 arbitrary number of State objects.
	
	/**
	 * Constructor.
	 */
	public StateContainer()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * @return the array list of all of the states in the model
	 */
	public ArrayList<State> getStates()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Add a state to this container.
	 * 
	 * @param newState the new state
	 */
	public void addState(State newState)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Retrieve a state from this container that represents a specified word.
	 * 
	 * @param word The word represented by the state that should be retrieved
	 * @return The state that stores the specified word.  If a state with the 
	 * specified word does not 
	 */
	public State getStateByWord(String word)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Retrieve a state with a specified unique ID from this state container.
	 * 
	 * @param id the unique integer of ID of the state to be retrieved
	 * @return
	 */
	public State getStateById(int id)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * This method returns true if this container is storing a state with the
	 * specified word.  It returns false if this container is storing no such 
	 * state.
	 * 
	 * @param word
	 * @return true if a state associated with the specified word is stored in 
	 * this state container.  False, if this state is not in the container.
	 */
	public boolean containsWord(String word)
	{
		// TODO: Implement this method.
	}
}
