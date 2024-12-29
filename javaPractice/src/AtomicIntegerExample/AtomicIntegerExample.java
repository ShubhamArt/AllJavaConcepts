package AtomicIntegerExample;
import java.util.concurrent.atomic.AtomicInteger;
public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);

        // Increment the value
        counter.incrementAndGet();  // Atomically increments by 1

        System.out.println(counter.get());  // Output: 1
    }
}
