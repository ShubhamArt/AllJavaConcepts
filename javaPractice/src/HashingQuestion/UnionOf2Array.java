package HashingQuestion;

import java.util.HashSet;

public class UnionOf2Array {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        unionOfTwoArray(arr1, arr2);  // union 6 {2,3,4,6,7,9}
    }

    private static void unionOfTwoArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }
        System.out.println("Union or intersection of two array = " + count);
    }
}
