/**
 * This class represents the head of the avatar.
 * Contains a string which is the selected head.
 * 
 * @author Nathan Stream, Sarah Vicchiollo
 */
public class Head {

	String selectedHead;
	
	/**
	 * Constructor method for Head.
	 * Creates a head object with a default selected head.
	 */
	public Head() {
		selectedHead = "blank.png";
	}
	
	/**
	 * Updates the head of the avatar.
	 * @param i head chosen
	 * @param heads array of possible head
	 */
	public void updateHead(int i, String[] heads) {
		selectedHead = heads[i];
	}
	
	/**
	 * Returns the selectedHead String.
	 * @return selectedHead
	 */
	public String getHead() {
		return selectedHead;
	}
	
}