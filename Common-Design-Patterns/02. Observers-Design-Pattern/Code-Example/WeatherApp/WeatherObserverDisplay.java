package WeatherApp;

public class WeatherObserverDisplay implements IObserver, IDisplay{
    private float temperature;
    private float humidity;
    private final String name;
    private IObservable observable;

    WeatherObserverDisplay(String name){
        this.name = name;
    }

    WeatherObserverDisplay(String name, IObservable observable){
        this.observable = observable;
        this.name = name;
    }

    public void setObservable(IObservable observable){
        this.observable = observable;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display(){
        System.out.println(name + ": ");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println();
    }

    public void registerObserver(){
        this.observable.addObserver(this);
    }

    public void deRegisterObserver(){
        this.observable.removeObserver(this);
    }
}
