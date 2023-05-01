

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
	
	public Avatar() {
		gender = new Gender();
		head = new Head();
		eyes = new Eyes();
		nose = new Nose();
		mouth = new Mouth();
		hair = new Hair();
	}
	
	public void updateGender(int i) {
		gender.updateGender(i, possibleGenders);
	}
	
	public void updateHead(int i) {
		head.updateHead(i, possibleHeads);
	}
	
	public void updateEyes(int i) {
		eyes.updateEyes(i, possibleEyes);
	}
	
	public void updateNose(int i) {
		nose.updateNose(i, possibleNoses);
	}
	
	public void updateMouth(int i) {
		mouth.updateMouth(i, possibleMouths);
	}
	
	public void updateHair(int i) {
		hair.updateHair(i, possibleHair);
	}
	
	public String getGender() {
		return gender.getGender();
	}
	
	public String getHead() {
		return head.getHead();
	}
	
	public String getEyes() {
		return eyes.getEyes();
	}
	
	public String getNose() {
		return nose.getNose();
	}
	
	public String getMouth() {
		return mouth.getMouth();
	}
	
	public String getHair() {
		return hair.getHair();
	}
}
