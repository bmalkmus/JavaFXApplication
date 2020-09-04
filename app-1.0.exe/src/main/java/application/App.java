package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {
    Button button;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Application");
        button = new Button("This is a new button");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene (layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    
}
