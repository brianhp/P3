import java.util.ArrayList;

/**
 * This class implements a Markov model for use as in a nonsense
 * text generator.  Each state in the model represents a single
 * word in the input document.
 */
public class MarkovModel 
{
	// TODO: Create private instance variables
	
	/**
	 * The constructor accepts an array of words representing the input 
	 * text.
	 * <br>
	 * For example, if the original text read "Sam I am, that Sam I am", 
	 * the array of words would store:
	 * <br>
	 * <br>
	 * ["Sam", "I", "am,", "that", "Sam", "I", "am"]
	 * <br>
	 * <br>
	 * The constructor then uses this array of words to build the states 
	 * and transitions that comprise the Markov model.
	 * <br>
	 * <br>
	 * <b>IMPORTANT:</b> the state associated with the last word in the 
	 * input text MUST include a transition to the state associated with 
	 * the first word in the inputtext.
	 * 
	 * @param words all of the words from the input text box in their 
	 * original order
	 */
	public MarkovModel(String[] words)
	{			
		// TODO: Implement this method.
		
		// HINT: For each word, check if you already have a State 
		//		 corresponding to that word in your state container. If not, 
		//		 create a new state and add it to your state container.
		
		// HINT: There should be AT MOST one Transition between any two 
		//		 given states.  If word A follows word B three times in the 
		//		 text, we would only create ONE transition moving from A 
		//		 to B. This Transition's counter would store the the value 
		//		 of 3 because A follows B three times.
	}
	
	/**
	 * Return the model as a String.  Each state should be separated by a 
	 * line break. The first line of each state should print the state's 
	 * word enclosed in square brackets. Each line thereafter should print 
	 * each outward transition moving from the current state. Each transitions 
	 * should be printed as follows:
	 * <br>
	 * <br>
	 * &lt;transition count> --> [&lt;destination state's word>]
	 * <br>
	 * <br>
	 * Example of printing a state whose word is "Sam":
	 * <br>
	 * 
	 * 				<br>[sam]<br>
	 *				2 --> [i]<br>
	 *				1 --> [sam]<br>
	 *				1 --> [let]<br>
	 *				1 --> [you]<br>
	 *				1 --> [if]<br><br>
	 *
	 * <b>The states must be printed in the order they were created.</b>
	 */
	@Override
	public String toString()
	{
		// TODO: Implement this method.
	}
	
	/**
	 * This method traverses the states of the Markov model and generates the 
	 * final nonsense text.  For each state visited during the traversal, this 
	 * method should append the word from the current state to a String 
	 * variable that will store the entire resultant text. This method should 
	 * then return this String.
	 * <br>
	 * <br>
	 * <b>IMPORTANT: The traversal starts at the state associated with the 
	 * first word of the input text.</b>
	 * <br>
	 * <br>
	 * <b>IMPORTANT: The output text moves to a new line after every 10 words 
	 * that are generated.
	 * <b>
	 * 
	 * @param numWords the number of words to output (i.e. the number of states 
	 * to visit)
	 *	@return a concatenation of all of the words from each state that was 
	 * visited when traversing the model.
	 */
	public String generateText(int numWords)
	{
		// TODO: Implement this method.
		
		// HINT: In order to meet the requirement of printing a new line after 
		//		 every 10 words, you must append the newline character, "\n", 
		//		 to the resulting string after appending each set of 10 words.
	}
	
	/**
	 * This method accepts a State object that represents the "current" state 
	 * while traversing the model, and outputs the ID of the "next" state.  The 
	 * next state is determined by examining all of the transitions from the 
	 * current state and randomly picking the next state based on the 
	 * probabilities of these transitions.
	 * <br>
	 * <br>
	 * For example, consider a state, <b>A</b>, with two transitions. The first 
	 * of these transitions moves from <b>A</b> to <b>B</b> with a count 
	 * variable of 3.  The second transition moves from <b>A</b> to <b>C</b> 
	 * with a count variable of 4.  Then the probability that this method 
	 * returns <b>B</b>'s ID is 3/7.  Similarly, the probability that this 
	 * method returns <b>C</b>'s ID is 4/7.
	 * 
	 * @param currState the current state
	 * @return the ID of the next state we should move to
	 */
	public int moveToNextState(State currState)
	{		
		// TODO: Implement this method.
	}
}
