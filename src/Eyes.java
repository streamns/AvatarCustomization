

public class Eyes {
	
	String selectedEyes;
	
	public Eyes() {
		selectedEyes = "blank.png";
	}
	
	public void updateEyes(int i, String[] eyes) {
		selectedEyes = eyes[i];
		//update image
	}
	
	public String getEyes() {
		return selectedEyes;
	}
}