package generalQues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractice {
    public static void main(String[] args) {
        //duplicate in array
       duplicateinArray();
       //insert element in array
        insertEleInArr();
        //smallest and largest
        smallandLarge();
        //kth highest
        secondHighest();
        //kth smallest
        secondSmallest();
        // kth smallest and highest
        kthLargeSmall();
        //reverseArray
        reverseArr();

    }

    private static void kthLargeSmall() {
        int[] arr = {60, 20, 30, 50, 40, 10};
        int n = arr.length;
        int k=2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second highest element is "+arr[n-k]);
        System.out.println("second smallest element is "+arr[k-1]);
    }
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void smallandLarge() {
        int[] arr={5,15,22,1,-15,24};
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("smallest element"+smallest);
        System.out.println("Largest element"+largest);
    }

    private static void reverseArr() {
        int[] arr ={3,5,4,2,1};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void secondSmallest() {
        int[] arr ={3,5,4,2,1};
        /*int k=2;
        Arrays.sort(arr); //1 2 3 4 5
        System.out.println(arr[k-1]);*/
        // Initialize the smallest and second smallest to maximum possible values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // Update smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = num; // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num; // Update second smallest
            }
        }

        // Check if second smallest was updated
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second Smallest Element: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element.");
        }
    }

    private static void secondHighest() {
        int[] arr ={3,5,4,2,1};
        /*int k=2;
        Arrays.sort(arr); //1 2 3 4 5
        System.out.println(arr[arr.length-k]);*/
        // Initialize the highest and second highest to minimum possible values
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            // Update highest and second highest
            if (num > highest) {
                secondHighest = highest; // Update second highest
                highest = num; // Update highest
            } else if (num > secondHighest && num != highest) {
                secondHighest = num; // Update second highest
            }
        }

        // Check if second highest was updated
        if (secondHighest != Integer.MIN_VALUE) {
            System.out.println("Second Highest Element: " + secondHighest);
        } else {
            System.out.println("There is no second highest element.");
        }
    }

    private static void insertEleInArr() {
        int[] arr={10,20,30,40,30,50,60};
        int pos=4;  //means index=3 == pos-1
        int element =45;
        for(int i=arr.length-1;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    private static void duplicateinArray() {
        int[] arr={10,20,30,40,30,50,60};
       Set<Integer> original =new HashSet<>();
       Set<Integer> duplicates=new HashSet<>();

       for(int num:arr){
           if(original.contains(num)){
               duplicates.add(num);
           }else{
               original.add(num);
           }
       }
        for (int dup : duplicates) {
            System.out.println("Duplicate Element: " + dup);
        }
    }
}
