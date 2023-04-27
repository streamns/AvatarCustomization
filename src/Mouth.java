
public enum Mouth {
	ONE("mouth_1"),
	TWO("mouth_2"),
	THREE("mouth_3"),
	FOUR("mouth_4"),
	FIVE("mouth_5"),
	SIX("mouth_6");
	
	
	private String text;
	
	Mouth(String text) {
	this.text = text;
	
	}
	
	public String getText() {
		return text;
	}
}
