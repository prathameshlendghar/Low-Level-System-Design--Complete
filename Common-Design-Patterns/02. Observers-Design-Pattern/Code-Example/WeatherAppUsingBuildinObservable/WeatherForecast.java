package WeatherAppUsingBuildinObservable;

import java.util.Observable;

public class WeatherForecast extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void updateData(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;

        setChanged();
        notifyObservers();
    }

    public float getTemperature(){
        return this.temperature;
    }
    public float getHumidity(){
        return this.humidity;
    }
    public float getPressure(){
        return this.pressure;
    }
}
