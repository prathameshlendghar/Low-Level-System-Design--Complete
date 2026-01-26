package WeatherAppUsingBuildinObservable;

public class Main {
    public static void main(String[] args){
        WeatherForecast weatherForecast = new WeatherForecast();
        WeatherObserverDisplay display1 = new WeatherObserverDisplay("display1", weatherForecast);
        WeatherObserverDisplay display2 = new WeatherObserverDisplay("display2", weatherForecast);
        WeatherObserverDisplay display3 = new WeatherObserverDisplay("display3", weatherForecast);

        weatherForecast.updateData(10, 5, 8);
    }
}
