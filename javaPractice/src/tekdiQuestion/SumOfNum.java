package tekdiQuestion;

public class SumOfNum {
    public static void main(String[] args) {
        int num = 23566; // Example number
        int sum = 0;

        // Loop until the number becomes 0
        while (num > 0) {
            // Extract the last digit
            int digit = num % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            num /= 10;
        }

        // Print the result
        System.out.println("Sum of digits: " + sum);

    }
}
