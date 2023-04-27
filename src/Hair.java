
public enum Hair {
	ONE("hair_1"),
	TWO("hair_2"),
	THREE("hair_3"),
	FOUR("hair_4"),
	FIVE("hair_5"),
	SIX("hair_6");
	
	
	private String text;
	
	Hair(String text) {
	this.text = text;
	
	}
	
	public String getText() {
		return text;
	}
}
