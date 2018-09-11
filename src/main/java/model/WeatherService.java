package model;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherService {

    private String URL = "http://api.apixu.com/v1/current.json";
    private String key = "eeea89e848f743fbb8d155428180709";
    private String finalURL;

    public WeatherService(){
        finalURL = URL + "?key=" + key;
    }

    public WeatherService(String url, String key) {
        finalURL = url + "?key=" + key;

    }

    public Weather getCityWeather(String city) {
        Weather weather = new Weather();

        String url = finalURL + "&q=" + city;

        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        weather.setIconURL(jsonObject.getJSONObject("current").getJSONObject("condition").get("icon").toString());
        weather.setText(jsonObject.getJSONObject("current").getJSONObject("condition").get("text").toString());
        weather.setTemperature_c(jsonObject.getJSONObject("current").get("temp_c").toString());
        return weather;

    }
}
