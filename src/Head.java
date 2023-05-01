

public class Head {

	String selectedHead;
	
	public Head() {
		selectedHead = "blank.png";
	}
	
	public void updateHead(int i, String[] heads) {
		selectedHead = heads[i];
		//update image
	}
	
	public String getHead() {
		return selectedHead;
	}
	
}
