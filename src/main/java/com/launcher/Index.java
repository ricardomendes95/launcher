package com.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class Index extends Application {

    private Parent root;

    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("JJE Launcher");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/jjeautomacao-logo-2.png")));
        root = new FXMLLoader().load(getClass().getResource("/view/index.fxml"));
        scene = new Scene(root,600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}