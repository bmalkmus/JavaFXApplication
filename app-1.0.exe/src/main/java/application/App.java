package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
// import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    Stage window;
    // ListView<String> listView;

    //------Variables for Scene
    // Scene scene1;
    // Scene scene2;

    
    public static void main(String[] args) {
        launch(args);
    }

    // checkbox formulas
    // private void handleOptions (CheckBox box1, CheckBox box2, CheckBox box3) {
    //     String message = "Weapon Chosen: \n";

    //     if (box1.isSelected()){
    //         message += "Rock\n";
            
    //     }
    //     if (box2.isSelected()){
    //         message += "Paper\n";

    //     }
    //     if (box3.isSelected()){
    //         message += "Scissors\n";

    //     }
    //     System.out.println(message);
    // }

    // private void getChoice(ChoiceBox<String> dropdown) {
    //     String favorite = dropdown.getValue();
    //     System.out.println("Your favorite fruit is: " + favorite);
    // }

    // ---------ListView button show---------
    // private void buttonClicked() {
    //     String message = "";
    //     ObservableList<String> movies;
    //     movies=listView.getSelectionModel().getSelectedItems();

    //     for (String m:movies){
    //         message += m + "\n";

    //     }
    //     System.out.println(message);
    // }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //---------List View-----------
        
        // window = primaryStage;
        // window.setTitle("ListView");
        // Button button = new Button ("Click me for list view");

        // listView = new ListView<>();
        // listView.getItems().addAll("Choice A", "Choice B", "Choice C", "Choice D");
        // listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // button.setOnAction(e-> buttonClicked());;

        // VBox layout = new VBox(10);
        // layout.setPadding(new Insets(20, 20, 20, 20));
        // layout.getChildren().addAll(listView, button);

        // Scene scene = new Scene (layout, 300, 250);
        // window.setScene(scene);
        // window.show();

    
        

        //DropDown

        // window = primaryStage;
        // window.setTitle("Dropdown menus");
        // Button button = new Button ("Drop me Down!!");

        // ChoiceBox <String> dropdown = new ChoiceBox<>();

        // dropdown.getItems().addAll("Apples", "Bananas", "Pears", "Peaches", "Mangos", "Strawberries", "Kiwis");

        // dropdown.setValue("Kiwis");

        // VBox layout = new VBox(10);
        // layout.setPadding(new Insets(10,10,10, 10));
        // layout.getChildren().addAll(dropdown, button);

        // button.setOnAction(e-> {
        //     getChoice(dropdown);
        // });

        // Scene scene = new Scene(layout, 300, 400);
        // window.setScene(scene);
        // window.show();

        



        //CheckBox tutorial

        // window = primaryStage;
        // window.setTitle("Rock, Paper, Scissors");

        // CheckBox box1 = new CheckBox("Rock");
        // CheckBox box2 = new CheckBox("Paper");
        // CheckBox box3 = new CheckBox("Scissors");

        // Button button = new Button("1, 2, 3 Shoot!");

        // button.setOnAction(e -> {
        //     handleOptions(box1,box2, box3);
        // });

        // VBox layout = new VBox(10);
        // layout.setPadding(new Insets(10,10,10, 10));
        // layout.getChildren().addAll(box1, box2, box3, button);

        // Scene scene = new Scene(layout, 300, 400);
        // window.setScene(scene);
        // window.show();
        







        //------GridPane and User Response

        // window= primaryStage;
        // window.setTitle("This is my creative title");

        // GridPane grid = new GridPane();
        // grid.setPadding(new Insets(10, 10, 10, 10));
        // grid.setVgap(8);
        // grid.setHgap(10);

        // Label nameLabel = new Label ("Username");
        // GridPane.setConstraints(nameLabel, 0, 0);

        // TextField nameInput = new TextField();
        // nameInput.setPromptText("UserName33");

        // GridPane.setConstraints(nameInput, 1, 0);

        // Label passLabel = new Label ("Password");
        // GridPane.setConstraints(passLabel, 0, 1);

        // TextField passInput = new TextField();
        // passInput.setPromptText("Password123");

        // GridPane.setConstraints(passInput, 1, 1);

        // Button login = new Button ("Log In");
        // login.setOnAction(e-> {
        //     System.out.println("Welcome back, " + nameInput.getText());
        // });

        // GridPane.setConstraints(login, 1, 2);

        // grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, login);

        // Scene scene = new Scene(grid, 400, 400);

        // window.setScene(scene);
        // window.show();



        //------Embedding Layouts

        // window = primaryStage;
        // window.setTitle("Embedding Tutorial");

        // HBox topMenu = new HBox();
        // Button buttonA = new Button("File");
        // Button buttonB = new Button("Edit");
        // Button buttonC = new Button("View");

        // topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        // VBox sideMenu = new VBox();
        // Button buttonD = new Button("Search");
        // Button buttonE = new Button("Record");
        // Button buttonF = new Button("Play");

        // sideMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        // BorderPane borderPane = new BorderPane();

        // borderPane.setTop(topMenu);
        // borderPane.setLeft(sideMenu);

        // Scene scene = new Scene (borderPane, 400, 400);

        // window.setScene(scene);
        // window.show();


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
