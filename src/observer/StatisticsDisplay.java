package observer;

import java.util.Observable;

public class StatisticsDisplay implements java.util.Observer{

    @Override
    public void update(Observable o, Object arg) {
        Data d = (Data) arg;
        System.out.println("temperature = " + d.temperature + " humidity = " + d.humidity +
                " pressure = " + d.pressure);
    }
}
