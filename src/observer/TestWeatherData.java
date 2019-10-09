package observer;

import java.util.Observer;

public class TestWeatherData {


    public static void main(String[] args){
        WeatherData  weatherData = new WeatherData();

        Observer display = new CurrentConditionsDisplay();
        weatherData.addObserver(display);

        display = new StatisticsDisplay();
        weatherData.addObserver(display);

         display = new ForecastDisplay();
        weatherData.addObserver(display);

        display = new XYZDisplay();
        weatherData.addObserver(display);

        weatherData.mesaurementsChanged();

    }
}
