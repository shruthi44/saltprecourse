package org.example;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println("please enter your grade: ");
        Scanner scanner=new Scanner(System.in);
        String grade=scanner.next();
        String message;
        switch (grade){
            case "A":
               message = "you have done excellent";
              break;
            case "B":
                message="you are good";
                break;
            case "F":
                    message="you need to work hard";
                    break;
            default:message="Invalid Entry";
            break;
        }
        System.out.println(message);
    }
}
