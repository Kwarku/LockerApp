package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import sample.media.OpenFiles;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{
        // important files
    private final String TEXT_FILE = "PrivateCode.txt";         // text file with code
        // sounds
    private final String WIN_SOUND =  "sounds/win.wav";
    private final String LOSE_SOUND =  "sounds/lose.wav";
    private final String CLICK_SOUND = "sounds/click.wav";
    private final String ERROR_SOUND = "sounds/error.wav";

    private int codeLength;             //length of code from text file
    private int textFromUserLength;
    private String textFromUser = "";   // code entered from application

    @FXML private VBox Contener;
    @FXML private PasswordField PassField;
    @FXML private Button Button1;
    @FXML private Button Button2;
    @FXML private Button Button3;
    @FXML private Button Button4;
    @FXML private Button Button5;
    @FXML private Button Button6;
    @FXML private Button Button7;
    @FXML private Button Button8;
    @FXML private Button Button9;
    @FXML private Button ButtonClear;
    @FXML private Button Button0;
    @FXML private Button ButtonEnter;

                    // helpfull objects
OpenFiles openFiles = new OpenFiles();
File win = new File(WIN_SOUND);
File lose = new File(LOSE_SOUND);
File click = new File(CLICK_SOUND);
File error = new File(ERROR_SOUND);


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    openFiles.openTextFile(new File(TEXT_FILE));
    codeLength = openFiles.getCode().length();


    clickButton1();
    clickButton2();
    clickButton3();
    clickButton4();
    clickButton5();
    clickButton6();
    clickButton7();
    clickButton8();
    clickButton9();
    clickButton0();
    clickButtonClear();
    clickButtonEnter();
    }

        // this 10 method is almost the same only add other number
    private String clickButton1(){
        Button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength  <   codeLength){
                    textFromUserLength++;
                    textFromUser += "1";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton2(){
        Button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="2";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton3(){
        Button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="3";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton4(){
        Button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="4";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton5(){
        Button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="5";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton6(){
        Button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="6";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton7(){
        Button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="7";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton8(){
        Button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="8";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton9(){
        Button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="9";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }
    private String clickButton0(){
        Button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textFromUserLength<codeLength){
                    textFromUserLength++;
                    textFromUser+="0";
                    PassField.setText(textFromUser);
                    System.out.println(textFromUser);
                    openFiles.openMp3File(click);

                }else {
                    openFiles.openMp3File(error);
                }
            }
        });
        return textFromUser;
    }

    private String clickButtonClear(){
        ButtonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                openFiles.openMp3File(click);
                textFromUser = "";
                textFromUserLength = 0;
                PassField.setText(textFromUser);
            }
        });
        return textFromUser;
    }

    private void clickButtonEnter(){
     ButtonEnter.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
             if (openFiles.getCode().equals(textFromUser)){
                 openFiles.openMp3File(win);
                winScene();
             }else {
                 openFiles.openMp3File(lose);
             }
         }
     });
}


        // this method open new stage and open movie file on path "file:/WinMovie.mp4"
        // C:/WinMovie.mp4
    private void winScene(){

            //create new stage with anchoPane and mediaViewer
        Stage window = new Stage();
        AnchorPane anchorPane = new AnchorPane();
        MediaView mediaView = new MediaView();
        anchorPane.getChildren().add(mediaView);
        Scene scene = new Scene(anchorPane,400,400);
        window.setFullScreen(true);
        window.setScene(scene);
        window.show();

            //some styles
        mediaView.setY(150);
        anchorPane.setStyle("-fx-background-color: black;");

            //open movie file
        Media winMovie = new Media("file:/WinMovie.mp4");
        MediaPlayer player = new MediaPlayer(winMovie);
        mediaView.setMediaPlayer(player);
        mediaView.setFitHeight(1000);
        mediaView.setFitWidth(1920);
        player.setAutoPlay(true);

         player.play();

    }


}
