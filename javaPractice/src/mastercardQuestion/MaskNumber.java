package mastercardQuestion;

import java.util.Scanner;

public class MaskNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input the account number
        System.out.print("Enter the 12-digit account number: ");
        String accountNr = scanner.nextLine();

        // Validate the input length
        if (accountNr.length() == 12) {
            // Mask all digits except the last 4
            String maskedAccountNr = maskAccountNumber(accountNr);
            System.out.println("Masked Account Number: " + maskedAccountNr);
        } else {
            System.out.println("Invalid account number. Please enter exactly 12 digits.");
        }

        scanner.close();
    }

    // Method to mask all digits except the last 4
    public static String maskAccountNumber(String accountNr) {
        String maskedPart = accountNr.substring(0, 8).replaceAll("\\d", "*");  // Mask the first 8 digits
        String lastFourDigits = accountNr.substring(8);  // Get the last 4 digits
        return maskedPart + lastFourDigits;  // Combine masked part with last 4 digits
    }
}
