import java.util.Arrays;
import java.util.Objects;

public class Prac {
    public static void main(String[] args) {
        int[] arr ={3,-4,5,4,-1,7,-8};
        int maxSum=Integer.MIN_VALUE;
        int currSum=0,start=0,end=0,tempStart=0;
        for(int i=0;i<arr.length;i++){
            currSum =currSum+arr[i];
            if(currSum>maxSum){
                start=tempStart;
                end=i;
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
                tempStart=i+1;
            }

        }
        System.out.println("maximum sum "+maxSum);
        for(int i=start;i<end;i++){
            System.out.println(i+"--->"+arr[i]);
        }
    }
}
