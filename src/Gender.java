

public class Gender {
	String selectedGender;
	
	public Gender() {
		selectedGender = "blank.png";
	}
	
	public void updateGender(int i, String[] genders) {
		selectedGender = genders[i];
		//update image
	}
}
