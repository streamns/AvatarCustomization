

public class Hair {
	String selectedHair;
	
	public Hair() {
		selectedHair = "blank.png";
	}
	
	public void updateHair(int i, String[] hair) {
		selectedHair = hair[i];
		//update image
	}
	
	public String getHair() {
		return selectedHair;
	}
}
