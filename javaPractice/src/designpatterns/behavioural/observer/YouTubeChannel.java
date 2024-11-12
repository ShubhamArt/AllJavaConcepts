package designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;
    private String latestVideo;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        System.out.println("New video uploaded on " + channelName + ": " + videoTitle);
        notifySubscribers(); // Notify all subscribers of new video
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has subscribed to " + channelName);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has unsubscribed from " + channelName);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestVideo);
        }
    }
}
