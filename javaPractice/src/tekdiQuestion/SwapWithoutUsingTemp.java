package tekdiQuestion;

public class SwapWithoutUsingTemp {
    public static void main(String[] args) {
        int a =5 , b=6;
        //swap 2 numbers without using temp variable
        int sum= a+b;  //11
        a= sum-a;
        b=sum-b;

        System.out.println("a after swap = "+a +" and b after swap = " +b);
    }
}
