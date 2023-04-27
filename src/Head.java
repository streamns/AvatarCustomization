

public enum Head {

	OVAL("oval"),
	CIRCLE("circle"),
	RECTANGLE("rectangle"),
	TRIANGLE("triangle"),
	DIAMOND("diamond"),
	HEART("heart");
	
	
	private String text;
	
	Head(String text) {
	this.text = text;
	
	}
	
	public String getText() {
		return text;
	}
}
