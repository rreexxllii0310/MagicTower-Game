package fp.s105502009;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class stage2 extends Application {
	Stage stage = new Stage();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// FXMLLoader fxmlLoader = FXMLLoader.load(getClass().getResource("map2.fxml"));
		// Parent root;
		//
		// try {
		// root = fxmlLoader.load();
		// } catch (IOException ioe) {
		// System.out.println(ioe);
		// // log exception
		// return;
		// }
		// Controller controller = new Controller ();
		// fxmlLoader.setController(controller);
		// primaryStage.setTitle("�]��-��");
		// primaryStage.setScene(new Scene(root, 892, 650));
		// primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void showWindow(ImageView buttonImage, FXMLLoader fxmlLoader) throws Exception {
		Parent root;
		try {
			root = fxmlLoader.load();
			buttonImage.getScene().setRoot(root);
		} catch (IOException ioe) {
			System.out.println(ioe);
			// log exception
			return;
		}
		// Controller controller = new Controller ();
		// fxmlLoader.setController(controller);
	}

}
