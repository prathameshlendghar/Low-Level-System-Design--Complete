package Youtube;

public class Main {
    public static void main(String[] args) {
        YoutubeChannelObservable observable = new YoutubeChannelObservable();

        //Names are not given to the observer and observable and hence the output is a bit cluttered

        IObserver observer1 = new YoutubeALLObserver(observable);
        IObserver observer2 = new YoutubeALLObserver(observable);
        IObserver observer3 = new YoutubeALLObserver(observable);
        IObserver observer4 = new YoutubeALLObserver(observable);
        IObserver observer5 = new YoutubeALLObserver(observable);

        observable.addContent("Vlog1","This is new vlog", "10:00");
    }
}
