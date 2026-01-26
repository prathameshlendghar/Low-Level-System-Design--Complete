package WeatherApp;

public class Main {
    public static void main(String[] args){
        WeatherObserverDisplay display1 = new WeatherObserverDisplay("display1");
        WeatherObserverDisplay display2 = new WeatherObserverDisplay("display2");
        WeatherObserverDisplay display3 = new WeatherObserverDisplay("display3");
        WeatherObserverDisplay display4 = new WeatherObserverDisplay("display4");


        WeatherForecast weatherForecastStation = new WeatherForecast();

        weatherForecastStation.addObserver(display1);
        weatherForecastStation.addObserver(display2);
        weatherForecastStation.addObserver(display3);
        weatherForecastStation.addObserver(display4);

        weatherForecastStation.notifyObserver();

        weatherForecastStation.removeObserver(display4);
        weatherForecastStation.notifyObserver();
    }

}
