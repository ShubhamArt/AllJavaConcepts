package designpatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        // Create a stock price (subject)
        StockPrice stockPrice = new StockPrice();

        // Create some users (observers)
        User user1 = new User("John");
        User user2 = new User("Alice");

        // Register the users as observers of the stock price
        stockPrice.registerObserver(user1);
        stockPrice.registerObserver(user2);

        // Change the stock price, this should notify both users
        stockPrice.setPrice(150.75); // Both users should be notified

        // Unregister one user
        stockPrice.removeObserver(user1);

        // Change the stock price again, only Alice should be notified
        stockPrice.setPrice(160.00);
    }
}
