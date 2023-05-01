

public class Mouth {
	String selectedMouth;
	
	public Mouth() {
		selectedMouth = "blank.png";
	}
	
	public void updateMouth(int i, String[] mouths) {
		selectedMouth = mouths[i];
		//update image
	}
	
	public String getMouth() {
		return selectedMouth;
	}
}
