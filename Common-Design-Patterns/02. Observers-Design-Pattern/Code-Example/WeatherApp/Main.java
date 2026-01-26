package WeatherApp;

public class Main {
    public static void main(String[] args){
        // Creating Observable
        WeatherForecast weatherForecastStation = new WeatherForecast();

        // Creating Observers
        WeatherObserverDisplay display1 = new WeatherObserverDisplay("display1");
        WeatherObserverDisplay display2 = new WeatherObserverDisplay("display2", weatherForecastStation);   //Constructor level observable setting
        WeatherObserverDisplay display3 = new WeatherObserverDisplay("display3");
        WeatherObserverDisplay display4 = new WeatherObserverDisplay("display4");


        // Registering the Observable in Observers separately
        display1.setObservable(weatherForecastStation);
        display3.setObservable(weatherForecastStation);
        display4.setObservable(weatherForecastStation);

        // Registering everyone
        display1.registerObserver();
        display2.registerObserver();
        display3.registerObserver();
        display4.registerObserver();


        //Checking the work of Observable notifying
        weatherForecastStation.updateData((float)2.4,4,5);

        display4.deRegisterObserver();
        weatherForecastStation.updateData(4,3,6);
    }

}
