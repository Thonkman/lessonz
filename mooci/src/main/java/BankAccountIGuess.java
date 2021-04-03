package main.java;

import java.util.Scanner;

public class BankAccountIGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double accountBalance = 100.00;
        boolean isCorrect = false;
        boolean logInScreen = true;

        while (!isCorrect) {
            while (logInScreen) {
                System.out.println("Enabling Automated Teller Machine...");
                System.out.println("Enabling Automated Teller Machine...");
                System.out.println("Enter Account name");
                String accountName = scanner.nextLine();
                System.out.println("Account Detected " + accountName);
                logInScreen = false;
            }
            System.out.println("Is this correct?");
            String correct = scanner.nextLine();
            if (correct.equals("yes")) {
                isCorrect = true;
            }
        }

        System.out.println("Your account balance is: " + accountBalance);
    }
}
