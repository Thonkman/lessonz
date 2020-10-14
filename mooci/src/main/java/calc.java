package main.java;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stonp = false;

        while (!stonp) {
            System.out.println("enter equation:");
            String[] equation = scanner.nextLine().split(" ");
            double first = Integer.parseInt(equation[0]);
            double second = Integer.parseInt(equation[2]);
            switch (equation[1]) {
                case "*": case "x":
                    System.out.println("your result: " + (first * second));
                    break;
                case "+":
                    System.out.println("your result: " + (first + second));
                    break;
                case "-":
                    System.out.println("your result: " + (first - second));
                    break;
                case "/":
                    System.out.println("your result: " + (first / second));
                    break;
            }
            System.out.println("stonp?");
            String stop = scanner.nextLine();
            if (stop.equals("yes") || stop.equals("true")) {
                stonp = true;
            }
        }
    }
}
