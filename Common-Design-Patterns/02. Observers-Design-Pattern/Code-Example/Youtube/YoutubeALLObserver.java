package Youtube;

public class YoutubeALLObserver implements IObserver{
    private String title;
    private String duration;
    private IObservable observable;

    YoutubeALLObserver(IObservable observable){
        this.observable = observable;
        registerObserver();
    }

    @Override
    public IObservable getObservable() {
        return observable;
    }

    @Override
    public void update(IObservable observable) {
        if(observable instanceof YoutubeChannelObservable){
            YoutubeChannelObservable channel = (YoutubeChannelObservable) observable;
            title = channel.getNewContentTitle();
            duration = channel.getNewContentDuration();
            System.out.println("New Content has Published: ");
            System.out.println("Title: " + title + ", Duration: " + duration);
        }
    }

    public void setObservable(IObservable o){
        this.deregisterObserver();
        this.observable = o;
        this.registerObserver();
    }

}
