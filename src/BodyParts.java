import java.util.ArrayList;



public class BodyParts {

	private ArrayList<Head> heads;
	private ArrayList<Eyes> eyes;
	private ArrayList<Nose> nose;
	private ArrayList<Mouth> mouths;
	private ArrayList<Hair> hair;
	
	
	public BodyParts() {
		heads = new ArrayList<Head>();
		eyes = new ArrayList<Eyes>();
		nose = new ArrayList<Nose>();
		mouths = new ArrayList<Mouth>();
		hair = new ArrayList<Hair>();
	}
	
	public ArrayList<Eyes> getEyes() {
		return eyes;
	}
}
