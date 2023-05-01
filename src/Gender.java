/**
 * This class represents the gender of the avatar.
 * Contains a string which is the selected gender.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Gender {
	String selectedGender;
	
	/**
	 * Constructor method for Gender.
	 * Creates a gender object with a default selected gender.
	 */
	public Gender() {
		selectedGender = "";
	}
	
	/**
	 * Updates the gender of the avatar.
	 * @param i gender chosen
	 * @param genders array of possible genders
	 */
	public void updateGender(int i, String[] genders) {
		selectedGender = genders[i];
	}
	
	/**
	 * Returns the selectedGender String.
	 * @return selectedGender
	 */
	public String getGender() {
		return selectedGender;
	}
}