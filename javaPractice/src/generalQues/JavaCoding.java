package generalQues;

import java.util.Arrays;

public class JavaCoding {

    public static void main(String[] args) {
        int n = 5, x = 2;
        String str = "Shubham";
        System.out.println(str);
        System.out.println(str.substring(2, 6));
        printNumbers(n);
        fact(n);
        fibonacii(0, 1, n);
        int output = printPower(2, n);
        System.out.println(x + " power " + n + " is " + output);

        String st = "12345";
        int result = 0;
        for (int i = 0; i < st.length(); i++) {
            result = result * 10 + st.charAt(i) - '0';
        }
        System.out.println(result);
        palindromeNumber();
        System.out.println(anagramNumber());
    }

    private static boolean anagramNumber() {
        int n1 = 123;
        int n2 = 321;
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);

        if (s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    private static void palindromeNumber() {
        int n = 121;  // The number to check
        int originalNumber = n;  // Save the original value of n
        int reversedNumber = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        // Compare the original number with the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println("Number " + originalNumber + " is Palindrome");
        } else {
            System.out.println("Number " + originalNumber + " is not Palindrome");
        }
    }

    private static int printPower(int x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (x == 1) return 1;
        if (x == -1 && n % 2 == 0) return 1;
        if (x == -1 && n % 2 != 0) return -1;
        int x_ = printPower(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    private static void fibonacii(int a, int b, int n) {
        if (n == 0)
            return;
        System.out.println(a);
        fibonacii(b, a + b, n - 1);
    }

    private static void fact(int n) {
        if (n == 0) {
            System.out.println(1);
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    private static void printNumbers(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNumbers(n - 1);
    }
}
