package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudyHubApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/view/Login.fxml")
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("StudyHub");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}