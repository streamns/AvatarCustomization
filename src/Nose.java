

public class Nose {
	
	String selectedNose;
	
	public Nose() {
		selectedNose = "blank.png";
	}
	
	public void updateNose(int i, String[] noses) {
		selectedNose = noses[i];
		//update image
	}
		
	public String getNose() {
		return selectedNose;
	}
}
