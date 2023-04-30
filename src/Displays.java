import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Displays extends HBox{
	
	private static final String IMAGE_PATH_FORMAT = "%s_%s_%s.jpg";
	private boolean reveal;
	private ArrayList<ImageView> bodyImages;
	
	public Displays(Avatar avatar, String bodyPart, Gender gender) {
		
	
		
		HBox bodyPartBox = new HBox(3);
		bodyPartBox.setAlignment(Pos.CENTER);
		bodyImages = new ArrayList<ImageView>();
		
		if (avatar.getGender() == Gender.MALE) {
			for (int i = 0; i < 3; i++) {
				ImageView imageView = new ImageView(getImageForBodyPart(avatar, bodyPart, i));
		        imageView.setFitWidth(100);
		        imageView.setPreserveRatio(true);
		        bodyImages.add(imageView);
		        bodyPartBox.getChildren().add(imageView);
			}
		}
		else {
			for (int i = 3; i < 6; i++) {
				ImageView imageView = new ImageView(getImageForBodyPart(avatar, bodyPart, i));
		        imageView.setFitWidth(100);
		        imageView.setPreserveRatio(true);
		        bodyImages.add(imageView);
		        bodyPartBox.getChildren().add(imageView);
			}
		}
	}
	
	
	private Image getImageForBodyPart(Avatar avatar, String bodyPart, int i) {
		String imagePath = reveal ? String.format(IMAGE_PATH_FORMAT, avatar.getGenderText(), bodyPart, i) : "blank.png";
		return new Image(imagePath);
		
	}
}
