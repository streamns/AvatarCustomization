/**
 * This class represents the nose of the avatar.
 * Contains a string which is the selected nose.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Nose {
	
	String selectedNose;
	
	/**
	 * Constructor method for Nose.
	 * Creates a nose object with a default selected nose.
	 */
	public Nose() {
		selectedNose = "blank.png";
	}
	
	/**
	 * Updates the nose of the avatar.
	 * @param i nose chosen
	 * @param noses array of possible noses
	 */
	public void updateNose(int i, String[] noses) {
		selectedNose = noses[i];
	}
	
	/**
	 * Returns the selectedNose String.
	 * @return selectedNose
	 */
	public String getNose() {
		return selectedNose;
	}
}