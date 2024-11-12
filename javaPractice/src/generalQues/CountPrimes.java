package generalQues;

import java.util.ArrayList;

public class CountPrimes {
    public static void main(String[] args) {
        int n=10;
        System.out.println(countPrime(n));
    }

    private static int countPrime(int n) {
        ArrayList<Boolean> isPrime =new ArrayList<>(n+1);
        // Initialize the list with 'true' values
        for (int i = 0; i <= n; i++) {
            isPrime.add(true);
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime.get(i)){
                count++;
                for(int j=i*2;j<n;j=j+i){
                    isPrime.set(j,false);
                }
            }
        }
        return count;
    }
}
