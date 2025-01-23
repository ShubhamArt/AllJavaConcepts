import java.util.*;
import java.util.stream.Collectors;

public class Prac {
    public static void main(String[] args) {
        String[] items = {"apple", "apple", "banana","apple", "orange", "banana", "papaya"};

        System.out.println(Arrays.stream(items).filter(i->Collections.frequency(List.of(items),i)>1).distinct().collect(Collectors.toList()));


    }
}
