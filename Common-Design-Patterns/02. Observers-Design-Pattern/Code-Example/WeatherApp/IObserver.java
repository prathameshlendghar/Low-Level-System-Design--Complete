package WeatherApp;

public interface IObserver {
    public void update(float temp, float humidity, float pressure);
    // Now see here we are hard-coding the params to the display function,
    // So if we want to add or alter the params for the update method in different subclasses, we will either need to Overload the update()
    // Or Alter this method signature each time.
}
