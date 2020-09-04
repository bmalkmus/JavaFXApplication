package application;

import javafx.application.Application;
// import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    Stage window;

    //------Variables for Scene
    // Scene scene1;
    // Scene scene2;

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //------Embedding Layouts

        window = primaryStage;
        window.setTitle("Embedding Tutorial");

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");

        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox sideMenu = new VBox();
        Button buttonD = new Button("Search");
        Button buttonE = new Button("Record");
        Button buttonF = new Button("Play");

        sideMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(topMenu);
        borderPane.setLeft(sideMenu);

        Scene scene = new Scene (borderPane, 400, 400);

        window.setScene(scene);
        window.show();


        //----Double Scene switch with Alert Box tutorial

        // window = primaryStage;
        // Label label1 = new Label("Welcome to page one");
        // Button button1 = new Button ("Go to scene 2");
        // button1.setOnAction(e -> window.setScene(scene2));

        // Button alertButton = new Button ("Click for alert");
        // alertButton.setOnAction(e -> AlertBox.display("ALERT!!!!!", "SCARED YOU HUH??"));

        // Label label2 = new Label ("Welcome to page two");

        // Button button2 = new Button ("Go to scene 1");
        // button2.setOnAction(e->window.setScene(scene1));


        // VBox layout1 = new VBox(20);
        // layout1.getChildren().addAll(label1, button1, alertButton);
        // layout1.setAlignment(Pos.CENTER);


        // scene1= new Scene (layout1, 200, 200);

        // VBox layout2 = new VBox(20);
        // layout2.getChildren().addAll(label2, button2);
        // layout2.setAlignment(Pos.CENTER);



        // scene2=new Scene (layout2, 200, 200);

        // window.setScene(scene1);
        // window.setTitle("Window scene switch");
        // window.show();

        //--------OnAction Tutorial

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
