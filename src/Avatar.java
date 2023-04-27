
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
	
	

}
