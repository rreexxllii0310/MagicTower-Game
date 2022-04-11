package fp.s105502009;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button startbtn = new Button("Start game");
        Button endbtn = new Button("Exit game");
        endbtn.setOnAction(event -> primaryStage.close());
        VBox vBox1 = new VBox();
        vBox1.setSpacing(20);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(startbtn, endbtn);

        Scene start = new Scene(vBox1, 892, 650);
        BackgroundImage background1 = new BackgroundImage(new Image("file:image/UI.png", 900, 650, false, true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        vBox1.setBackground(new Background(background1));

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("map0.fxml"));
        Controller controller = new Controller();
        fxmlLoader.setController(controller);
        Parent root = fxmlLoader.load();

        // primary stage
        primaryStage.setTitle("Magic-Tower");
        primaryStage.setScene(start);
        primaryStage.show();

        // ����FXML��
        Scene scene0 = new Scene(root, 892, 650);

        startbtn.setOnAction(event -> {
            controller.setScene(scene0);
            primaryStage.setScene(scene0);
            primaryStage.show();
        });

        if (GameObject.close == true) {
            primaryStage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
