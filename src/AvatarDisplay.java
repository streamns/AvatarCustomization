import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class AvatarDisplay extends StackPane {

	
public AvatarDisplay(Avatar avatar) {
		
		StackPane pane = new StackPane();
		ImageView headView = new ImageView(avatar.getHead());
		headView.setFitWidth(150);
        headView.setPreserveRatio(true);
		Image eyes = new Image(avatar.getEyes());
		ImageView eyeView = new ImageView(eyes);
		Image nose = new Image(avatar.getNose());
		ImageView noseView = new ImageView(nose);
		Image mouth = new Image(avatar.getMouth());
		ImageView mouthView = new ImageView(mouth);
		Image hair = new Image(avatar.getHair());
		ImageView hairView = new ImageView(hair);
		
		pane.getChildren().addAll(headView, eyeView, noseView, mouthView, hairView);
		this.getChildren().add(pane);
		
	}
	
}
