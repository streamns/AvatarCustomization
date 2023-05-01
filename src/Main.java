import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	private Button nextButton;
	
	private Label optionLabel;
	private Label sceneTitle;
	
	private ToggleGroup group;
	private RadioButton button1;
	private RadioButton button2;
	private RadioButton button3;
	
	private GridPane pane;
	
	private Avatar avatar = new Avatar();
	
	private Scene currentScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));
		
		//Creates a default Avatar object.
		
		//Begin code for Gender scene
		//Sets titles and labels for Gender screen
		sceneTitle = new Label("Gender");
		optionLabel = new Label("Please choose the gender of your Avatar:");
		
		//Creates buttons to choose male or female
		Button maleButton = new Button("Male");
		Button femaleButton = new Button("Female");
		
		//Sets the gender of the Avatar object to the selected Gender button
		maleButton.setOnAction((a) -> {
			avatar.updateGender(0);
		});
		
		femaleButton.setOnAction((b) -> {
			avatar.updateGender(1);
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
			
			//Head Scene
			sceneTitle = new Label("Head Shape");
			optionLabel = new Label("Please choose the head shape of your Avatar:");

			Displays headDisplay = new Displays(avatar, "head");
			headDisplay.setAlignment(Pos.CENTER);
			
			group = new ToggleGroup();
			button1 = new RadioButton();
			button2 = new RadioButton();
			button3 = new RadioButton();
			button1.setToggleGroup(group);
			button2.setToggleGroup(group);
			button3.setToggleGroup(group);

			
			pane = new GridPane();
			pane.setAlignment(Pos.CENTER);
			pane.setPadding(new Insets(20, 20, 20, 20));
			pane.setHgap(30);
			pane.add(button1, 0, 0);
			pane.add(button2, 1, 0);
			pane.add(button3, 2, 0);
			
			if(avatar.getGender().equalsIgnoreCase("male")) {
				if(button1.isSelected()) { avatar.updateHead(0); }
				if(button2.isSelected()) { avatar.updateHead(1); }
				if(button3.isSelected()) { avatar.updateHead(2); }
			} else {
				if(button1.isSelected()) { avatar.updateHead(3); }
				if(button2.isSelected()) { avatar.updateHead(4); }
				if(button3.isSelected()) { avatar.updateHead(5); }
			}
			
			nextButton = new Button("Next");
			nextButton.setOnAction((f) -> {
				
				//Eye Scene
				System.out.println();
				
				sceneTitle = new Label("Eyes");
				optionLabel = new Label("Please choose the eyes of your Avatar:");
				
				Displays eyeDisplay = new Displays(avatar, "eyes");
				eyeDisplay.setAlignment(Pos.CENTER);
				
				group = new ToggleGroup();
				button1 = new RadioButton();
				button2 = new RadioButton();
				button3 = new RadioButton();
				button1.setToggleGroup(group);
				button2.setToggleGroup(group);
				button3.setToggleGroup(group);
				
				
				
				pane = new GridPane();
				pane.setAlignment(Pos.CENTER);
				pane.setPadding(new Insets(20, 20, 20, 20));
				pane.setHgap(20);
				
				pane.add(button1, 0, 0);
				pane.add(button2, 1, 0);
				pane.add(button3, 2, 0);
				
				if(avatar.getGender().equalsIgnoreCase("male")) {
					if(button1.isSelected()) { avatar.updateEyes(0); }
					if(button2.isSelected()) { avatar.updateEyes(1); }
					if(button3.isSelected()) { avatar.updateEyes(2); }
				} else {
					if(button1.isSelected()) { avatar.updateEyes(3); }
					if(button2.isSelected()) { avatar.updateEyes(4); }
					if(button3.isSelected()) { avatar.updateEyes(5); }
				}
				
				nextButton = new Button("Next");
				nextButton.setOnAction((g) -> {
					System.out.print(2);
					
					//Nose Scene
					sceneTitle = new Label("Noses");
					optionLabel = new Label("Please choose the Nose of your Avatar:");
					
					Displays noseDisplay = new Displays(avatar, "nose");
					noseDisplay.setAlignment(Pos.CENTER);
					
					group = new ToggleGroup();
					button1 = new RadioButton();
					button2 = new RadioButton();
					button3 = new RadioButton();
					button1.setToggleGroup(group);
					button2.setToggleGroup(group);
					button3.setToggleGroup(group);
					
					pane = new GridPane();
					pane.setAlignment(Pos.CENTER);
					pane.setPadding(new Insets(20, 20, 20, 20));
					pane.setHgap(20);
					pane.add(button1, 0, 0);
					pane.add(button2, 1, 0);
					pane.add(button3, 2, 0);
					
					if(avatar.getGender().equalsIgnoreCase("male")) {
						if(button1.isSelected()) { avatar.updateNose(0); }
						if(button2.isSelected()) { avatar.updateNose(1); }
						if(button3.isSelected()) { avatar.updateNose(2); }
					} else {
						if(button1.isSelected()) { avatar.updateNose(3); }
						if(button2.isSelected()) { avatar.updateNose(4); }
						if(button3.isSelected()) { avatar.updateNose(5); }
					}
					
					nextButton = new Button("Next");
					nextButton.setOnAction((h) -> {
						System.out.print(3);
						
						
						//Mouth Scene
						sceneTitle = new Label("Mouths");
						optionLabel = new Label("Please choose the Mouth of your Avatar:");
						
						Displays mouthDisplay = new Displays(avatar, "mouth");
						mouthDisplay.setAlignment(Pos.CENTER);
						
						group = new ToggleGroup();
						button1 = new RadioButton();
						button2 = new RadioButton();
						button3 = new RadioButton();
						button1.setToggleGroup(group);
						button2.setToggleGroup(group);
						button3.setToggleGroup(group);
						
						pane = new GridPane();
						pane.setAlignment(Pos.CENTER);
						pane.setPadding(new Insets(20, 20, 20, 20));
						pane.setHgap(20);
						pane.add(button1, 0, 0);
						pane.add(button2, 1, 0);
						pane.add(button3, 2, 0);
						
						if(avatar.getGender().equalsIgnoreCase("male")) {
							if(button1.isSelected()) { avatar.updateMouth(0); }
							if(button2.isSelected()) { avatar.updateMouth(1); }
							if(button3.isSelected()) { avatar.updateMouth(2); }
						} else {
							if(button1.isSelected()) { avatar.updateMouth(3); }
							if(button2.isSelected()) { avatar.updateMouth(4); }
							if(button3.isSelected()) { avatar.updateMouth(5); }
						}
						
						nextButton = new Button("Next");
						nextButton.setOnAction((i) -> {
							System.out.print(4);
							
							//Hair Scene
							sceneTitle = new Label("Hair");
							optionLabel = new Label("Please choose the Hair of your Avatar:");
							
							Displays hairDisplay = new Displays(avatar, "hair");
							hairDisplay.setAlignment(Pos.CENTER);
							
							group = new ToggleGroup();
							button1 = new RadioButton();
							button2 = new RadioButton();
							button3 = new RadioButton();
							button1.setToggleGroup(group);
							button2.setToggleGroup(group);
							button3.setToggleGroup(group);
							
							pane = new GridPane();
							pane.setAlignment(Pos.CENTER);
							pane.setPadding(new Insets(20, 20, 20, 20));
							pane.setHgap(20);
							pane.add(button1, 0, 0);
							pane.add(button2, 1, 0);
							pane.add(button3, 2, 0);
							
							if(avatar.getGender().equalsIgnoreCase("male")) {
								if(button1.isSelected()) { avatar.updateMouth(0); }
								if(button2.isSelected()) { avatar.updateMouth(1); }
								if(button3.isSelected()) { avatar.updateMouth(2); }
							} else {
								if(button1.isSelected()) { avatar.updateMouth(3); }
								if(button2.isSelected()) { avatar.updateMouth(4); }
								if(button3.isSelected()) { avatar.updateMouth(5); }
							}
							
							nextButton = new Button("Next");
							nextButton.setOnAction((j) -> {
								System.out.print(5);
								
								sceneTitle = new Label("Final Avatar");
								optionLabel = new Label("Here is your completed Avatar!");
								
								//Create VBox for Mouth scene and sets current scene to be the mouth scene
								VBox finalScene = new VBox(sceneTitle, optionLabel);
								finalScene.setAlignment(Pos.CENTER);
								finalScene.setPadding(new Insets(10, 10, 10, 10));
								finalScene.setSpacing(20);
								currentScene = new Scene(finalScene);
								
								primaryStage.setScene(currentScene);
								
							});
							
							//Create VBox for Hair scene and sets current scene to be the hair scene
							VBox hairScene = new VBox(sceneTitle, optionLabel, hairDisplay, pane, nextButton);
							hairScene.setAlignment(Pos.CENTER);
							hairScene.setPadding(new Insets(10, 10, 10, 10));
							hairScene.setSpacing(20);
							currentScene = new Scene(hairScene);
							
							primaryStage.setScene(currentScene);
						});
						
						//Create VBox for Mouth scene and sets current scene to be the mouth scene
						VBox mouthScene = new VBox(sceneTitle, optionLabel, mouthDisplay, pane, nextButton);
						mouthScene.setAlignment(Pos.CENTER);
						mouthScene.setPadding(new Insets(10, 10, 10, 10));
						mouthScene.setSpacing(20);
						currentScene = new Scene(mouthScene);
						
						primaryStage.setScene(currentScene);
					
					});
					
					//Create VBox for Nose scene and sets current scene to be the nose scene
					VBox noseScene = new VBox(sceneTitle, optionLabel, noseDisplay, pane, nextButton);
					noseScene.setAlignment(Pos.CENTER);
					noseScene.setPadding(new Insets(10, 10, 10, 10));
					noseScene.setSpacing(20);
					currentScene = new Scene(noseScene);
					
					primaryStage.setScene(currentScene);
					
				});
				
				//Create VBox for Eyes scene and sets current scene to be the eye scene
				VBox eyeScene = new VBox(sceneTitle, optionLabel, eyeDisplay, pane, nextButton);
				eyeScene.setAlignment(Pos.CENTER);
				eyeScene.setPadding(new Insets(10, 10, 10, 10));
				eyeScene.setSpacing(20);
				currentScene = new Scene(eyeScene);
				
				primaryStage.setScene(currentScene);
				
			});
			
			//Create VBox for Heads scene and sets current scene to be the head scene
			VBox headScene = new VBox(sceneTitle, optionLabel, headDisplay,  pane, nextButton);
			headScene.setAlignment(Pos.CENTER);
			headScene.setPadding(new Insets(10, 10, 10, 10));
			headScene.setSpacing(20);
			currentScene = new Scene(headScene);
			
			primaryStage.setScene(currentScene);
		});
		
		//Create VBox for Gender scene and sets current scene to be the gender scene
		VBox firstScene = new VBox(sceneTitle, optionLabel, genderButtons, nextButton);
		firstScene.setAlignment(Pos.CENTER);
		firstScene.setPadding(new Insets(10, 10, 10, 10));
		firstScene.setSpacing(20);
		currentScene = new Scene(firstScene);
		
		primaryStage.setScene(currentScene);
		primaryStage.setTitle("Avatar Customizer");
		primaryStage.show();	
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
