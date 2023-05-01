
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


public class AvatarDisplay extends Pane {

	
public AvatarDisplay(Avatar avatar) {
		
		Pane pane = new Pane();
		ImageView headView = new ImageView(avatar.getHead());
		headView.setFitWidth(400);
        headView.setPreserveRatio(true);
        headView.setX(280);
        headView.setY(100);
		
        Image eyes = new Image(avatar.getEyes());
		ImageView eyeView = new ImageView(eyes);
		eyeView.setFitWidth(250);
        eyeView.setPreserveRatio(true);
        eyeView.setX(355);
        eyeView.setY(300);
		
		Image nose = new Image(avatar.getNose());
		ImageView noseView = new ImageView(nose);
		noseView.setFitWidth(90);
        noseView.setPreserveRatio(true);
        noseView.setX(440);
        noseView.setY(345);
		
		Image mouth = new Image(avatar.getMouth());
		ImageView mouthView = new ImageView(mouth);
		mouthView.setFitWidth(150);
        mouthView.setPreserveRatio(true);
        mouthView.setX(410);
        mouthView.setY(470);
		
		Image hair = new Image(avatar.getHair());
		ImageView hairView = new ImageView(hair);
		hairView.setFitWidth(450);
        hairView.setPreserveRatio(true);
        hairView.setX(255);
        hairView.setY(75);
       
		
		
		pane.getChildren().addAll(headView, eyeView, noseView, mouthView, hairView);
		this.getChildren().add(pane);
		
	}
	
}