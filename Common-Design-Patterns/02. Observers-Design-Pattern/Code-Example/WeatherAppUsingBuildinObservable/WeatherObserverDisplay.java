package WeatherAppUsingBuildinObservable;

import WeatherApp.IDisplay;

import java.util.Observable;
import java.util.Observer;

public class WeatherObserverDisplay implements Observer, IDisplay {
    private String name;

    private float temperature;
    private float humidity;
    private Observable weatherObservable;

    WeatherObserverDisplay(String name){
        this.name = name;
    }
    WeatherObserverDisplay(String name, Observable observable){
        this.name = name;
        weatherObservable = observable;
        weatherObservable.addObserver(this);
    }

    public void addObservable(Observable observable){
        this.weatherObservable = observable;
        weatherObservable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object obj){
        if(observable instanceof WeatherForecast){
            WeatherForecast weatherForecast = (WeatherForecast) observable;
            this.temperature = weatherForecast.getTemperature();
            this.humidity = weatherForecast.getHumidity();
            display();
        }
    }

    @Override
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("temperature: " + temperature);
        System.out.println("humidity: " + humidity);
        System.out.println();
    }
}
