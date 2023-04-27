import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class AvatarBox {
	
	private static final String IMAGE_PATH_FORMAT = "%s_%s.jpg";
	private boolean reveal;
	
	public AvatarBox() {
		
		HBox bodyPartBox = new HBox(3);
		bodyPartBox.setAlignment(Pos.CENTER);
		
		ImageView imageView = new ImageView(getImageForBodyPart(card));
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        cardImages.add(imageView);
        cardBox.getChildren().add(imageView);
	}
	
	
	private Image getImageForBodyPart(Avatar avatar, String bodyPart) {
		String imagePath = reveal ? String.format(IMAGE_PATH_FORMAT, avatar.getGender(), bodyPart) : null;
		return new Image(imagePath);
		
	}
}
