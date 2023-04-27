

public enum Nose {
	ONE("nose_1"),
	TWO("nose_2"),
	THREE("nose_3"),
	FOUR("nose_4"),
	FIVE("nose_5"),
	SIX("nose_6");
	
	
	private String text;
	
	Nose(String text) {
	this.text = text;
	
	}
	
	public String getText() {
		return text;
	}
}
