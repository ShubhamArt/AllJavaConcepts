package designpatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        // Create YouTube channel
        YouTubeChannel techChannel = new YouTubeChannel("TechExplained");

        // Create subscribers
        Subscriber alice = new YouTubeSubscriber("Alice");
        Subscriber bob = new YouTubeSubscriber("Bob");

        // Subscribe to the channel
        techChannel.subscribe(alice);
        techChannel.subscribe(bob);

        // Upload a new video
        techChannel.uploadVideo("Observer Pattern in Java");

        // Unsubscribe a user
        techChannel.unsubscribe(bob);

        // Upload another video
        techChannel.uploadVideo("Adapter Pattern in Java");
    }
}
