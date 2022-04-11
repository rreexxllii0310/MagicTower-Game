package fp.s105502009;

import java.util.HashMap;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ScreenController {
	private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene scene;

    public ScreenController(Scene main) {
        this.scene = main;
    }

    protected void addScreen(String name, Pane pane){
         screenMap.put(name, pane);
    }

    protected void removeScreen(String name){
        screenMap.remove(name);
    }

    protected void activate(String name){
    	scene.setRoot(screenMap.get(name) );
    }
}
