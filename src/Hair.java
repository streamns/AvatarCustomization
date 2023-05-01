/**
 * This class represents the hair of the avatar.
 * Contains a string which is the selected hair.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Hair {
	String selectedHair;
	
	/**
	 * Constructor method for Hair.
	 * Creates a hair object with a default selected hair.
	 */
	public Hair() {
		selectedHair = "blank.png";
	}
	
	/**
	 * Updates the hair of the avatar.
	 * @param i hair chosen
	 * @param hair array of possible hair
	 */
	public void updateHair(int i, String[] hair) {
		selectedHair = hair[i];
	}
	
	/**
	 * Returns the selectedHair String.
	 * @return selectedHair
	 */
	public String getHair() {
		return selectedHair;
	}
	
}