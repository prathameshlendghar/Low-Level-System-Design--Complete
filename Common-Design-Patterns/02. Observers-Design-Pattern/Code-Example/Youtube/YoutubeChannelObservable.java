package Youtube;

import java.time.Duration;
import java.util.*;

public class YoutubeChannelObservable implements IObservable{
    private Set<IObserver> observers;
    private Set<String> videos;
    private String newContentTitle;
    private String newContentDescription;
    private String newContentDuration;

    YoutubeChannelObservable(){
        observers = new HashSet<>();
        videos = new HashSet<>();
    }

    @Override
    public void addObserver(IObserver o) {
        if(observers.add(o)) System.out.println("Subscribed Successfully");
    }

    @Override
    public void removeObserver(IObserver o) {
        if(observers.remove(o)) System.out.println("Removed From Subscriber");
    }

    @Override
    public void notifyObserver() {
        for(IObserver o : observers){
            o.update(this);
        }
    }

    public void addContent(String title, String description, String duration){
        if(videos.add(title)) {
            newContentTitle = title;
            newContentDescription = description;
            newContentDuration = duration;
            notifyObserver();
        }
    }

    public String getNewContentTitle() {
        return newContentTitle;
    }

    public String getNewContentDescription() {
        return newContentDescription;
    }

    public String getNewContentDuration() {
        return newContentDuration;
    }
}
