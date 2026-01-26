package WeatherApp;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast implements IObservable{
    private float temperature;
    private float humidity;
    private float pressure;

    List<IObserver> observers;

    WeatherForecast(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
        System.out.println("Observer Added Successfully");
    }

    @Override
    public void removeObserver(IObserver o) {
        boolean result = observers.remove(o);
        if(result){
            System.out.println("Observer Removed Successfully");
        }else{
            System.out.println("Not a observer already");
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i<observers.size(); i++){
            IObserver observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }


    public void updateData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }
}
