package main;

import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.WeatherService;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        System.out.println("javafx.runtime.version: " + System.getProperties().get("javafx.runtime.version"));

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainView.fxml"));
        Pane pane = loader.load();

        MainController controller = loader.getController();
        controller.setWeatherService(new WeatherService());

        final Scene scene = new Scene(pane,313,426);
        //Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setTitle("S.W. App");
//        primaryStage.setMaxHeight(450);
//        primaryStage.setMinHeight(450);
//        primaryStage.setMaxWidth(321);
//        primaryStage.setMinWidth(321);
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/icon.png")));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
