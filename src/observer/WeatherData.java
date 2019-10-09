package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WeatherData extends java.util.Observable{

   Set<Observer> observers = new HashSet<>();

    public WeatherData() {

    }

    public double getTemperature() {
        return 30;
    }

    public double getHumidity() {
        return 74;
    }

    public double getPressure() {
        return 975;
    }

    public void mesaurementsChanged() {
        setChanged();
       notifyObservers(new Data(getTemperature(),getHumidity(),getPressure()));
    }

}