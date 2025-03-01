package capgeminiL2Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddInOneLine {
    public static void main(String[] args) {
       /* [2,1,8,4,6,2,9]
        even*3
        odd+1*/
        int[] arr={2,1,8,4,6,2,9,10,11};
        List<Integer> list = Arrays.stream(arr).map(x -> x % 2 == 0 ? x * 3 : x + 1).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
