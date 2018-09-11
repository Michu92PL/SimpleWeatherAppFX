package model;

public class Weather {

    String iconURL;
    String text;
    String temperature_c;

    public Weather() {
    }

    public Weather(String iconURL, String text, String temperature_c) {
        this.iconURL = iconURL;
        this.text = text;
        this.temperature_c = temperature_c;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTemperature_c() {
        return temperature_c;
    }

    public void setTemperature_c(String temperature_c) {
        this.temperature_c = temperature_c;
    }
}
