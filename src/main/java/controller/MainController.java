package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import model.Weather;
import model.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class MainController {

    private WeatherService weatherService;

    @FXML
    private TextField textField;

    @FXML
    private ImageView imageView;

    @FXML
    private Label textLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Button button;

    @FXML
    private Label nameLabel;

    @FXML
    public void showWeather() {

        Weather weather = weatherService.getCityWeather(textField.getText());
        imageView.setVisible(true);
        if (weather.getText() == null) {
            nameLabel.setText("Nie znaleziono");
            temperatureLabel.setText("");
            imageView.setVisible(false);
            textLabel.setText("");
        } else {
            textLabel.setText(weather.getText());
            temperatureLabel.setText(weather.getTemperature_c());
            nameLabel.setText(textField.getText());
            Image image = new Image("http:" + weather.getIconURL(), true);
            imageView.setImage(image);
        }
    }

    public WeatherService getWeatherService() {
        return weatherService;
    }

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public Label getTextLabel() {
        return textLabel;
    }

    public void setTextLabel(Label textLabel) {
        this.textLabel = textLabel;
    }

    public Label getTemperaturaLabel() {
        return temperatureLabel;
    }

    public void setTemperaturaLabel(Label temperaturaLabel) {
        this.temperatureLabel = temperaturaLabel;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
