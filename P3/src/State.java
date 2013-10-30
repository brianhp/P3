import java.util.ArrayList;


/**
 * This class implements a single state in the Markov model.  Each State object
 * represent single unique word in the input text.  Furthermore, each State 
 * objectstores all Transition objects that transition from this state to other 
 * states in the model. 
 */
public class State
{
	// TODO: Create private instance variables
	
	// HINT: Each state needs a data structure that will store an arbitrary 
	//		 number of Transition objects.
	
	/**
	 * Constructor
	 */
	public State()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * @return the unique integer ID of this state
	 */
	public int getId()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * @param id the unique integer ID of this state
	 */
	public void setId(int id)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * @return the unique word in the input text associated with this state
	 */
	public String getWord()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * @param word the unique word in the input text associated with this state
	 */
	public void setWord(String word)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Add an outgoing transition from this state to some other state.
	 *
	 * @param transition the new transition
	 */
	public void addTransition(Transition transition)
	{
		// TODO: Implement this method.
	}

	/**
	 * @return the array list containing all transition objects moving from 
	 * this state
	 */
	public ArrayList<Transition> getTransitions()
	{
		// TODO: Implement this method.
	}
		
	/**
	 * Increment the count for the transition that moves from this state 
	 * to the argument state.  If this transition does not exist, this method 
	 * creates a new transition from this state to the specified state and sets 
	 * this new transitions count to 1.  Otherwise, if the transition exists, 
	 * this method finds the transition and increments the transition's count 
	 * variable by one.
	 * 
	 * @param nextState the state that the transition from this state moves to
	 * @return the transition whose count variable was incremented by this 
	 * method
	 */
	public Transition incrementTransition(State nextState)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Create a new transition from this state to a specified state.
	 * 
	 * @param nextState the state that the new transition moves to
	 * @return the newly created transition
	 */
	public Transition createTransition(State nextState)
	{
		// TODO: Implement this method.
	}
	
	/**
	 * Find and return a transition from this state to the specified state.  
	 * If this transition does not exist this method returns null.
	 * 
	 * @return the transition that moves from this state to the specified 
	 * state, if such a transition does not exist, this method returns null
	 */
	public Transition findTransition(State nextState)
	{	
		// TODO: Implement this method.
	}
}
