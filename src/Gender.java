

public class Gender {
	String selectedGender;
	
	public Gender() {
		selectedGender = "";
	}
	
	public void updateGender(int i, String[] genders) {
		selectedGender = genders[i];
		//update image
	}
	
	public String getGender() {
		return selectedGender;
	}
}