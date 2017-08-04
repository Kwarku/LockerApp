package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
        primaryStage.setTitle("Hello User");
        /*primaryStage.setFullScreen(true);*/
        Scene scene = new Scene(root, 400, 600);
        File f = new File("style.css");
        scene.getStylesheets().add("file:"+ f);

        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
