package org.example;

import java.util.Scanner;

public class CoinGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pennies = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;
        while (true) {
            System.out.println("enter the quantities for pennies: ");
            int penniValue = scanner.nextInt();
            System.out.println("enter the quantities for nickels: ");
            int nickelsValue = scanner.nextInt();

            System.out.println("enter the quantities for dimes: ");
            int dimesValue = scanner.nextInt();

            System.out.println("enter the quantities for quarters: ");
            int quartersValue = scanner.nextInt();
            double total = penniValue * pennies + nickelsValue * nickel + dimesValue * dime + quartersValue * quarter;
            if (total < dollar) {
                double noOfLessCoins = total - dollar;
                System.out.println("you are less by " + noOfLessCoins);
            } else if (total > dollar) {
                double noOfMoreCoins = dollar - total;
                System.out.printf("you are more by" + noOfMoreCoins);
            } else {
                System.out.println("you won that's exactly 1 dollar");
            }

        }
    }
}
