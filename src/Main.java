import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
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
		
		//Creates a default Avatar object
		avatar = new Avatar();
		
		//Begin code for Gender scene
		//Sets titles and labels for Gender screen
		sceneTitle = new Label("Gender");
		optionLabel = new Label("Please choose the gender of your Avatar:");
		
		//Creates buttons to choose male or female
		Button maleButton = new Button("Male");
		Button femaleButton = new Button("Female");
		
		//Sets the gender of the Avatar object to the selected Gender button
		maleButton.setOnAction((e) -> {
			avatar.setGender(Gender.MALE);
		});
		
		femaleButton.setOnAction((e) -> {
			avatar.setGender(Gender.FEMALE);
		});
		
		//Male and Female buttons will be positioned next to each other
		HBox genderButtons = new HBox(maleButton, femaleButton);
		genderButtons.setAlignment(Pos.CENTER);
		genderButtons.setPadding(new Insets(5, 5, 5, 5));
		genderButtons.setSpacing(30);
		
		//Next button to allow the user to enter the next scene (next choice)
		//button action creates a new scene that stores the Box of the next scene, 
		//then sets the stage for that scene
		nextButton = new Button("Next");
		nextButton.setOnAction((e) -> {
			currentScene = new Scene(root);
			primaryStage.setScene(currentScene);
		});
		
		//Create VBox for Gender scene and sets current scene to be the gender scene
		VBox firstScene = new VBox(sceneTitle, optionLabel, genderButtons, nextButton);
		firstScene.setAlignment(Pos.CENTER);
		firstScene.setPadding(new Insets(10, 10, 10, 10));
		firstScene.setSpacing(20);
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
