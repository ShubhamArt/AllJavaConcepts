package designpatterns.behavioural.observer;

public interface Subscriber {
    void update(String videoTitle);
    String getName();
}
