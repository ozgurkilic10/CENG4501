package observer;

import java.util.Observable;

public class XYZDisplay implements java.util.Observer{

    @Override
    public void update(Observable o, Object arg) {
        WeatherData w = (WeatherData) o;
        w.getPressure();
        Data d = (Data) arg;
        System.out.println("temperature = " + d.temperature + " humidity = " + d.humidity +
                " pressure = " + d.pressure);
    }
}
