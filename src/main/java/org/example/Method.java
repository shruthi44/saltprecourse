package org.example;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();
        GreetUser(name);
    }
    public static void GreetUser(String name){
        System.out.println("Hello ! Welcome "+ name);
    }
}
