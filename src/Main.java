import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	private Button nextButton;
	
	private Label optionLabel;
	private Label sceneTitle;
	
	private String option1;
	private String option2;
	private String option3;
	
	private Avatar avatar;
	
	private Scene currentScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));
		
		avatar = new Avatar();
		
		sceneTitle = new Label("Gender");
		optionLabel = new Label("Please choose the gender of your Avatar:");
		
		Button maleButton = new Button("Male");
		Button femaleButton = new Button("Female");
		
		maleButton.setOnAction((e) -> {
			avatar.setGender(Gender.MALE);
		});
		
		femaleButton.setOnAction((e) -> {
			avatar.setGender(Gender.FEMALE);
		});
		nextButton = new Button("Next");
		nextButton.setOnAction((e) -> {
			currentScene = new Scene(root);
			primaryStage.setScene(currentScene);
		});
		
		VBox firstScene = new VBox(sceneTitle, optionLabel, maleButton, femaleButton, nextButton);
		firstScene.setAlignment(Pos.CENTER);
		firstScene.setPadding(new Insets(10, 10, 10, 10));
		currentScene = new Scene(firstScene);
		
		primaryStage.setScene(currentScene);
		primaryStage.show();
		
//		
//		ToggleGroup group = new ToggleGroup();
//		RadioButton button1 = new RadioButton(option1);
//		RadioButton button2 = new RadioButton(option2);
//		RadioButton button3 = new RadioButton(option3);
//		button1.setToggleGroup(group);
//		button2.setToggleGroup(group);
//		button3.setToggleGroup(group);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
