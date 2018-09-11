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

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainView.fxml"));
        Pane pane = loader.load();

        MainController controller = loader.getController();
        controller.setWeatherService(new WeatherService());

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("S.W. App");
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/icon.png")));
        primaryStage.show();
    }
}
