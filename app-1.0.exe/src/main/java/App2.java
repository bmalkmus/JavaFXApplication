import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App2 extends Application {
    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Menu Creation");

        // file menu
        Menu fileMenu = new Menu("File");

        // items for menu
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Creating a new window...."));
        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit"));

        //Edit Menu

        Menu editMenu = new Menu ("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));
        editMenu.getItems().add(new MenuItem("Crop"));
        editMenu.getItems().add(new MenuItem("Paste"));
        MenuItem rotate = new MenuItem("Rotate");
        rotate.setOnAction(e->System.out.println("Rotating due to the spins"));
        rotate.setDisable(true);
        editMenu.getItems().add(rotate);

        //Help Menu
        Menu optMenu = new Menu("Options");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            if(showLines.isSelected()){
                System.out.println("Program will now display line numbers");
            }
            else{
                System.out.println("Lines are now gone");
            }

        });
        CheckMenuItem autoSave = new CheckMenuItem("Auto Save");
        autoSave.setSelected(true);
        autoSave.setOnAction(e->{
            if(autoSave.isSelected()){
                System.out.println("Auto Save is enabled");
            }
            else{
                System.out.println("Manual Save enabled");
            }
        });
        optMenu.getItems().addAll(showLines, autoSave);

        //Radio Menu
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyTog = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("easy");
        RadioMenuItem medium = new RadioMenuItem("medium");
        RadioMenuItem hard = new RadioMenuItem("hard");
        easy.setToggleGroup(difficultyTog);
        medium.setToggleGroup(difficultyTog);
        hard.setToggleGroup(difficultyTog);

        difficultyMenu.getItems().addAll(easy,medium,hard);


        //main menu-bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, optMenu, difficultyMenu);


        layout = new BorderPane();  
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
    
}
