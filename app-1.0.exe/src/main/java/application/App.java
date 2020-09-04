package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    Stage window;
    Scene scene1;
    Scene scene2;

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Label label1 = new Label("Welcome to page one");
        Button button1 = new Button ("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        Label label2 = new Label ("Welcome to page two");

        Button button2 = new Button ("Go to scene 1");
        button2.setOnAction(e->window.setScene(scene1));


        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);

        scene1= new Scene (layout1, 200, 200);

        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);

        scene2=new Scene (layout2, 200, 200);

        window.setScene(scene1);
        window.setTitle("Window scene switch");
        window.show();
        // primaryStage.setTitle("Test Application");
        // button = new Button("Click for the Magic Password");
        // button.setOnAction(e -> System.out.println("Magic Password: **********"));

        // StackPane layout = new StackPane();
        // layout.getChildren().add(button);

        // Scene scene = new Scene (layout, 300, 300);
        // primaryStage.setScene(scene);
        // primaryStage.show();


    }

    
    
}
