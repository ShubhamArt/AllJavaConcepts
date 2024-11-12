package designpatterns.behavioural.observer;

public class YouTubeSubscriber implements Subscriber{
    private String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println(name + ", there's a new video uploaded: " + videoTitle);
    }

    @Override
    public String getName() {
        return name;
    }
}
