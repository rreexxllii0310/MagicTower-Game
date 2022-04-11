package fp.s105502009;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

public class Controller extends GameObject {
	@FXML
	protected ImageView buttonImage;
	@FXML
	protected ImageView stage1;
	@FXML
	protected ImageView gameover, map1talk;
	@FXML
	protected Label HP;
	@FXML
	protected Label attack;
	@FXML
	protected Label defend;
	@FXML
	protected Label money;
	@FXML
	protected Label exp;
	@FXML
	protected Label level;
	@FXML
	protected Label ykey;
	@FXML
	protected Label bkey;
	@FXML
	protected Label rkey;
	@FXML
	protected Label l1, l2, l3;
	@FXML
	protected ImageView shop;
	@FXML
	protected Button shophp;
	@FXML
	protected Button shopat;
	@FXML
	protected Button shopdef;
	@FXML
	protected Button exitshop;
	@FXML
	protected ImageView oshop;
	@FXML
	protected Button LevelUp;
	@FXML
	protected Button AttackUp;
	@FXML
	protected Button DefenseUp;
	@FXML
	protected Button ExitLevelShop;
	@FXML
	protected ImageView gshop;
	@FXML
	protected Button gshopYkey;
	@FXML
	protected Button gshopBkey;
	@FXML
	protected Button gshopRkey;
	@FXML
	protected Button exitgshop;
	@FXML
	protected ImageView readerUI;

	static boolean open = true;

	// private final Stage thisStage;
	//
	// public Controller() {
	// // Create the new stage
	// thisStage = new Stage();
	// // Load the FXML file
	// try {
	// FXMLLoader loader = new FXMLLoader(getClass().getResource("map1.fxml"));
	//
	// // Set this class as the controller
	// loader.setController(this);
	//
	// // Load the scene
	// thisStage.setScene(new Scene(loader.load()));
	//
	// // Setup the window/stage
	// thisStage.setTitle("Passing Controllers Example - map1");
	//
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }

	// private void openLayout2() {
	//
	// // Create the second controller, which loads its own FXML file. We pass a
	// reference to this controller
	// // using the keyword [this]; that allows the second controller to access the
	// methods contained in here.
	// Controller2 controller2 = new Controller2(this);
	//
	// // Show the new stage/window
	// controller2.showStage();
	//
	// }

	@FXML
	private void initialize() {
		initial();
	}

	public void setScene(Scene scene0) {
		scene0.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.UP) {
					if (!isTalk()) {
						buttonImage.setImage(new Image("file:image/up1.png"));
						if (obstacleup()) {
							buttonImage.setTranslateY(buttonImage.getTranslateY() - 50);
						}
					}
				}
				if (event.getCode() == KeyCode.DOWN) {
					if (!isTalk()) {
						buttonImage.setImage(new Image("file:image/down1.png"));
						if (obstacledown()) {
							buttonImage.setTranslateY(buttonImage.getTranslateY() + 50);
						}
					}
				}
				if (event.getCode() == KeyCode.LEFT) {
					if (!isTalk()) {
						buttonImage.setImage(new Image("file:image/left1.png"));
						if (obstacleleft()) {
							buttonImage.setTranslateX(buttonImage.getTranslateX() - 50);
						}
					}
				}
				if (event.getCode() == KeyCode.RIGHT) {
					if (!isTalk()) {
						buttonImage.setImage(new Image("file:image/right1.png"));
						if (obstacleright()) {
							buttonImage.setTranslateX(buttonImage.getTranslateX() + 50);
						}
					}
				}
				if (event.getCode() == KeyCode.L) {
					if (!isTalking()) {
						if (open == true && hasReader()) {
							talk = true;
							// monsterinfo.monreaderopen(player, CurrentMonsterList, CurrentMap); //�Ǫ���U
							open = false;
						} else if (open == false) {
							talk = false;
							// monsterinfo.monreaderclose();
							open = true;
						}
					}
				}
				if (event.getCode() == KeyCode.SPACE) {
					if (isTalk()) { // ���b���
						if (up == true) {
							obstacleup();
						} else if (down == true) {
							obstacledown();
						} else if (left == true) {
							obstacleleft();
						} else if (right == true) {
							obstacleright();
						}
					}
				}
			}
		});
	}
}
