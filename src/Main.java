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

public class Main extends Application {

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

	private final int SCENE_HEIGHT = 800;
	private final int SCENE_WIDTH = 1000;

	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));

		// Creates a default Avatar object.

		// Begin code for Gender scene
		// Sets titles and labels for Gender screen
		sceneTitle = new Label("Gender");
		optionLabel = new Label("Please choose the gender of your Avatar:");

		// Creates buttons to choose male or female
		Button maleButton = new Button("Male");
		Button femaleButton = new Button("Female");

		// Sets the gender of the Avatar object to the selected Gender button
		maleButton.setOnAction((a) -> {
			avatar.updateGender(0);
		});

		femaleButton.setOnAction((b) -> {
			avatar.updateGender(1);
		});

		// Male and Female buttons will be positioned next to each other
		HBox genderButtons = new HBox(maleButton, femaleButton);
		genderButtons.setAlignment(Pos.CENTER);
		genderButtons.setPadding(new Insets(5, 5, 5, 5));
		genderButtons.setSpacing(30);

		// Next button to allow the user to enter the next scene (next choice)
		// button action creates a new scene that stores the Box of the next scene,
		// then sets the stage for that scene
		nextButton = new Button("Next");
		nextButton.setOnAction((e) -> {

			// Head Scene
			sceneTitle = new Label("Head Shape");
			optionLabel = new Label("Please choose the head shape of your Avatar:");

			ChoicesDisplay headDisplay = new ChoicesDisplay(avatar, "head");
			headDisplay.setAlignment(Pos.CENTER);

			optionButtons();

			if (avatar.getGender().equalsIgnoreCase("male")) {
				group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
					if (newToggle == button1) {
						avatar.updateHead(0);
					} else if (newToggle == button2) {
						avatar.updateHead(1);
					} else {
						avatar.updateHead(2);
					}
				});
			} else {
				group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
					if (newToggle == button1) {
						avatar.updateHead(3);
					} else if (newToggle == button2) {
						avatar.updateHead(4);
					} else {
						avatar.updateHead(5);
					}
				});
			}

			nextButton = new Button("Next");
			nextButton.setOnAction((f) -> {

				// Eye Scene
				System.out.println(avatar.getHead());

				sceneTitle = new Label("Eyes");
				optionLabel = new Label("Please choose the eyes of your Avatar:");

				ChoicesDisplay eyeDisplay = new ChoicesDisplay(avatar, "eyes");
				eyeDisplay.setAlignment(Pos.CENTER);

				optionButtons();

				if (avatar.getGender().equalsIgnoreCase("male")) {
					group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
						if (newToggle == button1) {
							avatar.updateEyes(0);
						} else if (newToggle == button2) {
							avatar.updateEyes(1);
						} else {
							avatar.updateEyes(2);
						}
					});
				} else {
					group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
						if (newToggle == button1) {
							avatar.updateEyes(3);
						} else if (newToggle == button2) {
							avatar.updateEyes(4);
						} else {
							avatar.updateEyes(5);
						}
					});
				}

				nextButton = new Button("Next");
				nextButton.setOnAction((g) -> {
					System.out.print(2);

					// Nose Scene
					sceneTitle = new Label("Noses");
					optionLabel = new Label("Please choose the Nose of your Avatar:");

					ChoicesDisplay noseDisplay = new ChoicesDisplay(avatar, "nose");
					noseDisplay.setAlignment(Pos.CENTER);

					optionButtons();

					if (avatar.getGender().equalsIgnoreCase("male")) {
						group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
							if (newToggle == button1) {
								avatar.updateNose(0);
							} else if (newToggle == button2) {
								avatar.updateNose(1);
							} else {
								avatar.updateNose(2);
							}
						});
					} else {
						group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
							if (newToggle == button1) {
								avatar.updateNose(3);
							} else if (newToggle == button2) {
								avatar.updateNose(4);
							} else {
								avatar.updateNose(5);
							}
						});
					}

					nextButton = new Button("Next");
					nextButton.setOnAction((h) -> {
						System.out.print(3);

						// Mouth Scene
						sceneTitle = new Label("Mouths");
						optionLabel = new Label("Please choose the Mouth of your Avatar:");

						ChoicesDisplay mouthDisplay = new ChoicesDisplay(avatar, "mouth");
						mouthDisplay.setAlignment(Pos.CENTER);

						optionButtons();

						if (avatar.getGender().equalsIgnoreCase("male")) {
							group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
								if (newToggle == button1) {
									avatar.updateMouth(0);
								} else if (newToggle == button2) {
									avatar.updateMouth(1);
								} else {
									avatar.updateMouth(2);
								}
							});
						} else {
							group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
								if (newToggle == button1) {
									avatar.updateMouth(3);
								} else if (newToggle == button2) {
									avatar.updateMouth(4);
								} else {
									avatar.updateMouth(5);
								}
							});
						}

						nextButton = new Button("Next");
						nextButton.setOnAction((i) -> {
							System.out.print(4);

							// Hair Scene
							sceneTitle = new Label("Hair");
							optionLabel = new Label("Please choose the Hair of your Avatar:");

							ChoicesDisplay hairDisplay = new ChoicesDisplay(avatar, "hair");
							hairDisplay.setAlignment(Pos.CENTER);

							optionButtons();

							if (avatar.getGender().equalsIgnoreCase("male")) {
								group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
									if (newToggle == button1) {
										avatar.updateHair(0);
									} else if (newToggle == button2) {
										avatar.updateHair(1);
									} else {
										avatar.updateHair(2);
									}
								});
							} else {
								group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
									if (newToggle == button1) {
										avatar.updateHair(3);
									} else if (newToggle == button2) {
										avatar.updateHair(4);
									} else {
										avatar.updateHair(5);
									}
								});
							}

							nextButton = new Button("Next");
							nextButton.setOnAction((j) -> {
								System.out.print(avatar.getHair());

								sceneTitle = new Label("Final Avatar");
								optionLabel = new Label("Here is your completed Avatar!");

								AvatarDisplay finalAvatar = new AvatarDisplay(avatar);

								// Create VBox for Mouth scene and sets current scene to be the mouth scene
								VBox finalScene = new VBox(sceneTitle, optionLabel, finalAvatar);
								finalScene.setAlignment(Pos.CENTER);
								finalScene.setPadding(new Insets(10, 10, 10, 10));
								finalScene.setSpacing(20);
								currentScene = new Scene(finalScene, SCENE_WIDTH, SCENE_HEIGHT);

								primaryStage.setScene(currentScene);

							});

							// Create VBox for Hair scene and sets current scene to be the hair scene
							VBox hairScene = new VBox(sceneTitle, optionLabel, hairDisplay, pane, nextButton);
							hairScene.setAlignment(Pos.CENTER);
							hairScene.setPadding(new Insets(10, 10, 10, 10));
							hairScene.setSpacing(20);
							currentScene = new Scene(hairScene, SCENE_WIDTH, SCENE_HEIGHT);

							primaryStage.setScene(currentScene);
						});

						// Create VBox for Mouth scene and sets current scene to be the mouth scene
						VBox mouthScene = new VBox(sceneTitle, optionLabel, mouthDisplay, pane, nextButton);
						mouthScene.setAlignment(Pos.CENTER);
						mouthScene.setPadding(new Insets(10, 10, 10, 10));
						mouthScene.setSpacing(20);
						currentScene = new Scene(mouthScene, SCENE_WIDTH, SCENE_HEIGHT);

						primaryStage.setScene(currentScene);

					});

					// Create VBox for Nose scene and sets current scene to be the nose scene
					VBox noseScene = new VBox(sceneTitle, optionLabel, noseDisplay, pane, nextButton);
					noseScene.setAlignment(Pos.CENTER);
					noseScene.setPadding(new Insets(10, 10, 10, 10));
					noseScene.setSpacing(20);
					currentScene = new Scene(noseScene, SCENE_WIDTH, SCENE_HEIGHT);

					primaryStage.setScene(currentScene);

				});

				// Create VBox for Eyes scene and sets current scene to be the eye scene
				VBox eyeScene = new VBox(sceneTitle, optionLabel, eyeDisplay, pane, nextButton);
				eyeScene.setAlignment(Pos.CENTER);
				eyeScene.setPadding(new Insets(10, 10, 10, 10));
				eyeScene.setSpacing(20);
				currentScene = new Scene(eyeScene, SCENE_WIDTH, SCENE_HEIGHT);

				primaryStage.setScene(currentScene);

			});

			// Create VBox for Heads scene and sets current scene to be the head scene
			VBox headScene = new VBox(sceneTitle, optionLabel, headDisplay, pane, nextButton);
			headScene.setAlignment(Pos.CENTER);
			headScene.setPadding(new Insets(10, 10, 10, 10));
			headScene.setSpacing(20);
			currentScene = new Scene(headScene, SCENE_WIDTH, SCENE_HEIGHT);

			primaryStage.setScene(currentScene);
		});

		// Create VBox for Gender scene and sets current scene to be the gender scene
		VBox firstScene = new VBox(sceneTitle, optionLabel, genderButtons, nextButton);
		firstScene.setAlignment(Pos.CENTER);
		firstScene.setPadding(new Insets(10, 10, 10, 10));
		firstScene.setSpacing(20);
		currentScene = new Scene(firstScene, SCENE_WIDTH, SCENE_HEIGHT);

		primaryStage.setScene(currentScene);
		primaryStage.setTitle("Avatar Customizer");
		primaryStage.show();

	}

	public void optionButtons() {

		group = new ToggleGroup();
		button1 = new RadioButton();
		button1.setSelected(true);
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
	}

	public static void main(String[] args) {
		launch(args);
	}
}