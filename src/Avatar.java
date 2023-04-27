

public class Avatar {
	
	private Gender gender;
	private Head head;
	private Eyes eyes;
	private Nose nose;
	private Mouth mouth;
	private Hair hair;

	private String[] possibleHeads = {"male_oval.png", "male_rectangle.png", "male_circle.png", 
			"female_diamond.png", "female_heart.png", "female_triangle.png"};
	
	public Avatar() {
		gender = null;
		head = new Head();
		eyes = null;
		nose = null;
		mouth = null;
		hair = null;
	}
	
	public void updateHead(int i) {
		head.updateHead(i, possibleHeads);
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender.getText();
	}
	
	
	

}
