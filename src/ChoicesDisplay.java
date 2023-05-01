import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class ChoicesDisplay extends HBox{
	
	private static final String IMAGE_PATH_FORMAT = "%s_%s_%s.png";
	private ArrayList<ImageView> bodyImages;
	
	public ChoicesDisplay(Avatar avatar, String bodyPart) {
		
		HBox bodyPartBox = new HBox(3);
		bodyPartBox.setAlignment(Pos.CENTER);
		bodyImages = new ArrayList<ImageView>();
		
		if (avatar.getGender().equalsIgnoreCase("male")) {
			for (int i = 0; i < 3; i++) {
				ImageView imageView = new ImageView(getImageForBodyPart(avatar, bodyPart, i));
		        imageView.setFitWidth(50);
		        imageView.setPreserveRatio(true);
		        bodyImages.add(imageView);
		        bodyPartBox.getChildren().add(imageView);
			}
			this.getChildren().add(bodyPartBox);
		}
		else {
			for (int i = 3; i < 6; i++) {
				ImageView imageView = new ImageView(getImageForBodyPart(avatar, bodyPart, i));
		        imageView.setFitWidth(50);
		        imageView.setPreserveRatio(true);
		        bodyImages.add(imageView);
		        bodyPartBox.getChildren().add(imageView);
			}
			
			this.getChildren().add(bodyPartBox);
		}
	}
	
	
	
	private Image getImageForBodyPart(Avatar avatar, String bodyPart, int i) {
		String imagePath = String.format(IMAGE_PATH_FORMAT, avatar.getGender(), bodyPart, i);
		return new Image(imagePath);
		
	}
}