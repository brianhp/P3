
/**
 * This class contains the program's main method.  
 * It also oversees the construction of the Markov model as well as 
 * the traversal of the constructed model.
 */
public class TextGenerator 
{
	private static final int GENERATION_LENGTH = 200;
	
	/**
	 * The main method starts the entire the program's execution. This main 
	 * method's only responsibility is to create a new GUI object.
	 */
    public static void main(String[] args) 
    {    
    	Utility.startGui();
    }
	
	/**
	 * This method is called from the GUI object when the "Generate!" button 
	 * is clicked. This method receives a String that stores the entire raw 
	 * text from the input text box in the GUI.  This method first splits this 
	 * String into an array of Strings where each String in this array is a 
	 * word from the text box.  This method then uses this sequence of words to 
	 * build a  Markov model object.  Finally, this method calls the Markov 
	 * model object's <strong>generateText</strong> to traverse the 
	 * constructed model. This method returns the final result of this 
	 * traversal.
	 * 
	 * @param rawText the entire text from the input text box in the GUI
	 * @return the final result that will be printed to the output text box
	 * in the GUI
	 */
	public static String runMarkovTextGeneration(String rawText)
	{
		// TODO: Implement this method.
		
		// HINT: You need to accomplish five main tasks in this method:
		//		 1. Split the rawText into separate words
		//		 2. Create a MarkovModel object
		//		 3. Print the Markov model to standard output
		//			(i.e. print the result of the model's toString() method)
		// 		 4. Generate the text by traversing the model
		//		 5. Return the result of this traversal
	}

}
