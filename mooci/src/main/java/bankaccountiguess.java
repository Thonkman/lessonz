package main.java;

import java.util.Scanner;

public class bankaccountiguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double accountbalance = 100.00;
        Boolean IsCorrect = false;
        Boolean LogInScreen = true;





        while (!IsCorrect) {
            while (!LogInScreen)
                System.out.println("Enabling Automated Teller Machine...");
                System.out.println("Enabling Automated Teller Machine...");
                System.out.println("Enter Account name");
                String Accountname = scanner.nextLine();
                System.out.println("Account Detected " + Accountname);
                LogInScreen = false;
            System.out.println("Is this correct?");
            String correct = scanner.nextLine();
            if (correct.equals("yes")) {
                IsCorrect = true;
        }

        }
        System.out.println("Your account balance is: " + accountbalance);



    }
}
