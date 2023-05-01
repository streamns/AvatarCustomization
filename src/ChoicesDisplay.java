import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * 
 * @author sarahvicchiollo, Nathan Stream
 * @version 4.30.2023
 * 
 * This program creates a display of the body part images that the user will be able to choose from
 */
public class ChoicesDisplay extends HBox{
	
	private static final String IMAGE_PATH_FORMAT = "%s_%s_%s.png";
	private ArrayList<ImageView> bodyImages;
	
	/**
	 * Constructor creates a display of the body part images the user may choose from
	 * @param avatar represents the user's avatar object
	 * @param bodyPart represents the body part option that will be shown on screen
	 */
	public ChoicesDisplay(Avatar avatar, String bodyPart) {
		
		//Creates an HBox to hold the body part images
		HBox bodyPartBox = new HBox(3);
		bodyPartBox.setAlignment(Pos.CENTER);
		bodyImages = new ArrayList<ImageView>();
		
		//Adds to the HBox based on the gender of the user's avatar
		if (avatar.getGender().equalsIgnoreCase("male")) { //for male
			for (int i = 0; i < 3; i++) { //male images are from indicies 0-2
				//Creates new image view with image retrieved from getImageForBodyPart
				ImageView imageView = new ImageView(getImageForBodyPart(avatar, bodyPart, i));
		        //Formats Images within HBox
				imageView.setFitWidth(100);
		        imageView.setPreserveRatio(true);
		        bodyImages.add(imageView);
		        bodyPartBox.getChildren().add(imageView);
			}
			//Adds bodyPartBox to the HBox so it will display
			this.getChildren().add(bodyPartBox);
		}
		else { //for female
			for (int i = 3; i < 6; i++) { //female images are from indicies 3-5
				//Creates new image view with image retrieved from getImageForBodyPart
				ImageView imageView = new ImageView(getImageForBodyPart(avatar, bodyPart, i));
				//Formats Images within HBox
				imageView.setFitWidth(100);
		        imageView.setPreserveRatio(true);
		        bodyImages.add(imageView);
		        bodyPartBox.getChildren().add(imageView);
			}
			//Adds bodyPartBox to the HBox so it will display
			this.getChildren().add(bodyPartBox);
		}
	}
	
	
	/**
	 * Retrieves the image format for the specific body part image based on the ImagePath format,
	 * the user's avatar information, body part, and the index of the image
	 * @param avatar represents the user's avatar object. This is used to retrieve the gender of the avatar
	 * @param bodyPart represents the body part that is to be displayed as an image
	 * @param i represents the index of the image
	 * @return the imagePath as a new Image
	 */
	private Image getImageForBodyPart(Avatar avatar, String bodyPart, int i) {
		String imagePath = String.format(IMAGE_PATH_FORMAT, avatar.getGender(), bodyPart, i);
		return new Image(imagePath);
		
	}
}