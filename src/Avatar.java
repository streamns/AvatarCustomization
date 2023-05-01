/**
 * This is class creates the avatar with its respective body parts.
 * Contains arrays of all possible body parts.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Avatar {
	
	private Gender gender;
	private Head head;
	private Eyes eyes;
	private Nose nose;
	private Mouth mouth;
	private Hair hair;

	private String[] possibleGenders = {"male", "female"};
	
	private String[] possibleHeads = {"male_head_0.png", "male_head_1.png", "male_head_2.png", 
			"female_head_3.png", "female_head_4.png", "female_head_5.png"};
	
	private String[] possibleEyes = {"male_eyes_0.png", "male_eyes_1.png", "male_eyes_2.png", 
			"female_eyes_3.png", "female_eyes_4.png", "female_eyes_5.png"};
	
	private String[] possibleNoses = {"male_nose_0.png", "male_nose_1.png", "male_nose_2.png", 
			"female_nose_3.png", "female_nose_4.png", "female_nose_5.png"};
	
	private String[] possibleMouths = {"male_mouth_0.png", "male_mouth_1.png", "male_mouth_2.png", 
			"female_mouth_3.png", "female_mouth_4.png", "female_mouth_5.png"};
	
	private String[] possibleHair = {"male_hair_0.png", "male_hair_1.png", "male_hair_2.png", 
			"female_hair_3.png", "female_hair_4.png", "female_hair_5.png"};
	
	/**
	 * Constructor method for Avatar. 
	 * Creates Avatar object with default body parts.
	 */
	public Avatar() {
		gender = new Gender();
		head = new Head();
		eyes = new Eyes();
		nose = new Nose();
		mouth = new Mouth();
		hair = new Hair();
	}
	
	//SETTERS
	
	/**
	 * Updates the gender of the avatar
	 * @param i gender chosen
	 */
	public void updateGender(int i) {
		gender.updateGender(i, possibleGenders);
	}
	
	/**
	 * Updates the head of the avatar
	 * @param i head chosen
	 */
	public void updateHead(int i) {
		head.updateHead(i, possibleHeads);
	}
	
	/**
	 * Updates the eyes of the avatar
	 * @param i eyes chosen
	 */
	public void updateEyes(int i) {
		eyes.updateEyes(i, possibleEyes);
	}
	
	/**
	 * Updates the nose of the avatar
	 * @param i nose chosen
	 */
	public void updateNose(int i) {
		nose.updateNose(i, possibleNoses);
	}
	
	/**
	 * Updates the mouth of the avatar
	 * @param i mouth chosen
	 */
	public void updateMouth(int i) {
		mouth.updateMouth(i, possibleMouths);
	}
	
	/**
	 * Updates the hair of the avatar
	 * @param i hair chosen
	 */
	public void updateHair(int i) {
		hair.updateHair(i, possibleHair);
	}
	
	//GETTERS
	
	/**
	 * Calls the class getter method.
	 * Returns the gender string of the avatar.
	 * @return gender string
	 */
	public String getGender() {
		return gender.getGender();
	}
	
	/**
	 * Calls the class getter method.
	 * Returns the head string of the avatar.
	 * @return head string
	 */
	public String getHead() {
		return head.getHead();
	}
	
	/**
	 * Calls the class getter method.
	 * Returns the eyes string of the avatar.
	 * @return eyes string
	 */
	public String getEyes() {
		return eyes.getEyes();
	}
	
	/**
	 * Calls the class getter method.
	 * Returns the nose string of the avatar.
	 * @return nose string
	 */
	public String getNose() {
		return nose.getNose();
	}
	
	/**
	 * Calls the class getter method.
	 * Returns the mouth string of the avatar.
	 * @return mouth string
	 */
	public String getMouth() {
		return mouth.getMouth();
	}
	
	/**
	 * Calls the class getter method.
	 * Returns the hair string of the avatar.
	 * @return hair string
	 */
	public String getHair() {
		return hair.getHair();
	}
}