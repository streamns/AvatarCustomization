import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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
	
	private ToggleGroup group;
	private RadioButton button1;
	private RadioButton button2;
	private RadioButton button3;
	
	private Image image1;
	private Image image2;
	private Image image3;
	
	private ImageView img1;
	private ImageView img2;
	private ImageView img3;
	
	private GridPane pane;
	
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
			
			//Head Scene
			sceneTitle = new Label("Head Shape");
			optionLabel = new Label("Please choose the head shape of your Avatar:");
			if(avatar.getGender().equalsIgnoreCase("male")) {
				image1 = new Image("male_oval.png");
				image2 = new Image("male_rectangle.png");
				image3 = new Image("male_circle.png");
			} else {
				option1 = "Diamond";
				option2 = "Heart";
				option3 = "Triangle";
			}
			
			group = new ToggleGroup();
			button1 = new RadioButton();
			button2 = new RadioButton();
			button3 = new RadioButton();
			button1.setToggleGroup(group);
			button2.setToggleGroup(group);
			button3.setToggleGroup(group);
			
			img1 = new ImageView(image1);
			img1.setPreserveRatio(true);
			img1.setFitHeight(50);
			
			img2 = new ImageView(image2);
			img2.setPreserveRatio(true);
			img2.setFitHeight(50);
			
			img3 = new ImageView(image3);
			img3.setPreserveRatio(true);
			img3.setFitHeight(50);
			
			pane = new GridPane();
			pane.setAlignment(Pos.CENTER);
			pane.setPadding(new Insets(20, 20, 20, 20));
			pane.setHgap(30);
			pane.setVgap(5);
			pane.add(img1, 0, 0);
			pane.add(button1, 0, 1);
			pane.add(img2, 1, 0);
			pane.add(button2, 1, 1);
			pane.add(img3, 2, 0);
			pane.add(button3, 2, 1);
			
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
				System.out.print(1);
				
				sceneTitle = new Label("Eyes");
				optionLabel = new Label("Please choose the eyes of your Avatar:");
				if(avatar.getGender().equalsIgnoreCase("male")) {
					option1 = "Regular";
					option2 = "Lazy";
					option3 = "Wink";
				} else {
					option1 = "Happy Closed";
					option2 = "Normal";
					option3 = "Slight Squint";
				}
				
				group = new ToggleGroup();
				button1 = new RadioButton(option1);
				button2 = new RadioButton(option2);
				button3 = new RadioButton(option3);
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
					if(avatar.getGender().equalsIgnoreCase("male")) {
						option1 = "Wide";
						option2 = "Small";
						option3 = "Long";
					} else {
						option1 = "Smooth";
						option2 = "Small";
						option3 = "Pointed";
					}
					
					group = new ToggleGroup();
					button1 = new RadioButton(option1);
					button2 = new RadioButton(option2);
					button3 = new RadioButton(option3);
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
						if(avatar.getGender().equalsIgnoreCase("male")) {
							option1 = "Normal";
							option2 = "Smirk";
							option3 = "Smile";
						} else {
							option1 = "Normal";
							option2 = "Scowl";
							option3 = "Smile";
						}
						
						group = new ToggleGroup();
						button1 = new RadioButton(option1);
						button2 = new RadioButton(option2);
						button3 = new RadioButton(option3);
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
							if(avatar.getGender().equalsIgnoreCase("Male")) {
								option1 = "Front Swoop";
								option2 = "Balding";
								option3 = "Spiked";
							} else {
								option1 = "Short Bob";
								option2 = "Straight Long";
								option3 = "Wavy Long";
							}
							
							group = new ToggleGroup();
							button1 = new RadioButton(option1);
							button2 = new RadioButton(option2);
							button3 = new RadioButton(option3);
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
							VBox hairScene = new VBox(sceneTitle, optionLabel, pane, nextButton);
							hairScene.setAlignment(Pos.CENTER);
							hairScene.setPadding(new Insets(10, 10, 10, 10));
							hairScene.setSpacing(20);
							currentScene = new Scene(hairScene);
							
							primaryStage.setScene(currentScene);
						});
						
						//Create VBox for Mouth scene and sets current scene to be the mouth scene
						VBox mouthScene = new VBox(sceneTitle, optionLabel, pane, nextButton);
						mouthScene.setAlignment(Pos.CENTER);
						mouthScene.setPadding(new Insets(10, 10, 10, 10));
						mouthScene.setSpacing(20);
						currentScene = new Scene(mouthScene);
						
						primaryStage.setScene(currentScene);
					
					});
					
					//Create VBox for Mouth scene and sets current scene to be the mouth scene
					VBox noseScene = new VBox(sceneTitle, optionLabel, pane, nextButton);
					noseScene.setAlignment(Pos.CENTER);
					noseScene.setPadding(new Insets(10, 10, 10, 10));
					noseScene.setSpacing(20);
					currentScene = new Scene(noseScene);
					
					primaryStage.setScene(currentScene);
					
				});
				
				//Create VBox for Eyes scene and sets current scene to be the eye scene
				VBox eyeScene = new VBox(sceneTitle, optionLabel, pane, nextButton);
				eyeScene.setAlignment(Pos.CENTER);
				eyeScene.setPadding(new Insets(10, 10, 10, 10));
				eyeScene.setSpacing(20);
				currentScene = new Scene(eyeScene);
				
				primaryStage.setScene(currentScene);
				
			});
			
			//Create VBox for Heads scene and sets current scene to be the head scene
			VBox headScene = new VBox(sceneTitle, optionLabel, pane, nextButton);
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
		primaryStage.show();
		
//		
//		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
