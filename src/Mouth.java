/**
 * This class represents the mouth of the avatar.
 * Contains a string which is the selected mouth.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Mouth {
	String selectedMouth;
	
	/**
	 * Constructor method for Mouth.
	 * Creates a mouth object with a default selected mouth.
	 */
	public Mouth() {
		selectedMouth = "blank.png";
	}
	
	/**
	 * Updates the mouth of the avatar.
	 * @param i mouth chosen
	 * @param mouths array of possible mouths
	 */
	public void updateMouth(int i, String[] mouths) {
		selectedMouth = mouths[i];
	}
	
	/**
	 * Returns the selectedMouth String.
	 * @return selectedMouth
	 */
	public String getMouth() {
		return selectedMouth;
	}
}