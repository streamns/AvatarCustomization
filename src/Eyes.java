
public enum Eyes {
	ONE("eye_1"),
	TWO("eye_2"),
	THREE("eye_3"),
	FOUR("eye_4"),
	FIVE("eye_5"),
	SIX("eye_6");
	
	
	private String text;
	
	Eyes(String text) {
	this.text = text;
	
	}
	
	public String getText() {
		return text;
	}
}
