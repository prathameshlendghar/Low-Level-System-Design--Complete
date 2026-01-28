package Youtube;

public interface IObserver {

    IObservable getObservable();

    default public void registerObserver(){
        IObservable observable = getObservable();
        observable.addObserver(this);
    }

    default public void deregisterObserver(){
        IObservable observable = getObservable();
        observable.removeObserver(this);
    }

    public void update(IObservable observable);
}
