package observer;

import observer.observers.CurrentConditionsDisplay;
import observer.observers.HeatIndexDisplay;
import observer.subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // Our Subject
        WeatherData weatherData = new WeatherData();

        /*
            Our Observers.
            In this implementation we need to pass a Subject to instantiate an Observer.
            Therefore, it is guaranteed that every Observer will be registered in the Subject.
        */
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay =
                new HeatIndexDisplay(weatherData);

        /*
            Every time the 'setMeasurements' method of 'weatherData' is called,
            the data of the Observers that are registered will be changed automatically.
        */
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
