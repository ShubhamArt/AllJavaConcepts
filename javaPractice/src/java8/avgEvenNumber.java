package java8;

import java.util.Arrays;

public class avgEvenNumber {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        double avg = Arrays.stream(numbers).filter(n -> n % 2 == 0).average().orElse(0.0);
        System.out.println(avg);
    }
}
