package HashingQuestion;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //there is one more approach moore's voting algorithm
    public static void findMajorityElement(int[] arr) {
        int n = arr.length;
        int freq = n / 3;
        Map<Integer, Integer> map = new HashMap<>();   //num,freq pair
        for (int i = 0; i < n; i++) {
            //if key exists
            if (map.containsKey(arr[i])) {
                //update its frequency
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                //if key not exists create new entry
                map.put(arr[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > freq) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        //given an integer array find all elements that appear more than n/3 times
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        //int[] arr={1,2};
        findMajorityElement(arr);
    }
}
