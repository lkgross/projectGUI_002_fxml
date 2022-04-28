package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main -
 * A class for loading a .fxml file
 *
 * Starter code John Santore, jsantore@bridgew.edu
 *
 * Modified by: Laura Gross, laura.gross@bridgew.edu, 7/28/2022
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Store the location of the user interface (UI) resource.
        var loc = getClass().getResource("Main.fxml");
        // Parent is the superclass of Stage.
        Parent root = FXMLLoader.load(loc);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("A GUI designed in Scene Builder");
        primaryStage.show();
    }
}
