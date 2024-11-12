package generalQues;

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
        if (n == 0)
            return;
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
