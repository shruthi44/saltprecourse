package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the season of a year ");

        String season = scanner.next();
        System.out.println("Enter a whole number");
        int number= scanner.nextInt();
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        System.out.println("On a " + season +" "+ adjective +" day, I drink a minimum of "+ number + "cups of coffee" );
    }
}