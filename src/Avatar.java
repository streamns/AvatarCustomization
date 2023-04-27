
public class Avatar {
	
	private Gender gender;
	private Head head;
	private Eyes eyes;
	private Nose nose;
	private Mouth mouth;
	private Hair hair;
	
	
	public Avatar() {
		gender = null;
		head = null;
		eyes = null;
		nose = null;
		mouth = null;
		hair = null;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender.getText();
	}
	
	public void setHead(Head head) {
		this.head = head;
	}
	
	public String getHead() {
		return head.getText();
	}
	
	public void setEyes(Eyes eyes) {
		this.eyes = eyes;
	}
	
	public String getEyes() {
		return eyes.getText();
	}
	
	public void setNose(Nose nose) {
		this.nose = nose;
	}
	
	public String getNose() {
		return nose.getText();
	}
	
	public void setMouth(Mouth mouth) {
		this.mouth = mouth;
	}
	
	public String getMouth() {
		return mouth.getText();
	}
	
	public void setHair(Hair hair) {
		this.hair = hair;
	}
	
	public String getHair() {
		return hair.getText();
	}
	

}
