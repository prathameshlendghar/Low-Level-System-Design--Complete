package WeatherApp;

public class WeatherObserverDisplay implements IObserver, IDisplay{
    private float temperature;
    private float humidity;
    private final String name;

    WeatherObserverDisplay(String name){
        this.name = name;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }

    public void display(){
        System.out.println(name + ": ");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println();
    }
}
