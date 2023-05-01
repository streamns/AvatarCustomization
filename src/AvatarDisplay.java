import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class AvatarDisplay extends StackPane {

	private final int BODY_PART_SIZE = 300;
	
	public AvatarDisplay(Avatar avatar) {
		
<<<<<<< HEAD
		Image head = new Image(avatar.getHead());
		ImageView headView = new ImageView(head);
		headView.setFitWidth(BODY_PART_SIZE);
        headView.setPreserveRatio(true);
        headView.relocate(0,0);
        
		Image eyes = new Image(avatar.getEyes());
		ImageView eyeView = new ImageView(eyes);
		eyeView.setFitWidth(BODY_PART_SIZE*.7);
        eyeView.setPreserveRatio(true);
       
        
		Image nose = new Image(avatar.getNose());
		ImageView noseView = new ImageView(nose);
		noseView.setFitWidth(BODY_PART_SIZE*0.3);
        noseView.setPreserveRatio(true);
        
		Image mouth = new Image(avatar.getMouth());
		ImageView mouthView = new ImageView(mouth);
		mouthView.setFitWidth(BODY_PART_SIZE);
        mouthView.setPreserveRatio(true);
       
        
		Image hair = new Image(avatar.getHair());
		ImageView hairView = new ImageView(hair);
		hairView.setFitWidth(BODY_PART_SIZE);
        hairView.setPreserveRatio(true);
        hairView.relocate(2,-20);
        
        Group group = new Group();
		group.getChildren().addAll(headView, eyeView, noseView, mouthView, hairView);
		this.getChildren().add(group);
=======
		StackPane pane = new StackPane();
		String headS = avatar.getHead();
		Image head = new Image(headS);
		ImageView headView = new ImageView(head);
		headView.setFitWidth(50);
        headView.setPreserveRatio(true);
//		Image eyes = new Image(avatar.getEyes());
//		ImageView eyeView = new ImageView(eyes);
//		Image nose = new Image(avatar.getNose());
//		ImageView noseView = new ImageView(nose);
//		Image mouth = new Image(avatar.getMouth());
//		ImageView mouthView = new ImageView(mouth);
//		Image hair = new Image(avatar.getHair());
//		ImageView hairView = new ImageView(hair);
		
		pane.getChildren().addAll(headView);
		this.getChildren().add(pane);
>>>>>>> parent of 47111fd (WW)
		
	}
	
}
