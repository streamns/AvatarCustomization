/**
 * This class represents the eyes of the avatar.
 * Contains a string which is the selected eyes.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Eyes {
	
	String selectedEyes;
	
	/**
	 * Constructor method for Eyes.
	 * Creates an eyes object with a default selected eyes.
	 */
	public Eyes() {
		selectedEyes = "blank.png";
	}
	
	/**
	 * Updates the eyes of the avatar.
	 * @param i eyes chosen
	 * @param eyes array of possible eyes
	 */
	public void updateEyes(int i, String[] eyes) {
		selectedEyes = eyes[i];
	}
	
	/**
	 * Returns the selectedEyes String.
	 * @return selectedEyes
	 */
	public String getEyes() {
		return selectedEyes;
	}
}