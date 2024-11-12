package java8;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,-3,4,5,6,-7,8,9,10};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
