package org.example;

import java.util.Random;
import java.util.random.RandomGenerator;

public class RollGame {
    public static void main(String[] args) {
        Random random=new Random();
        int totalSpace=20;
        int dieRolls=5;
        int currentSpace=0;
        System.out.println("enter to roll die game");
        for(int i=1;i<=dieRolls;i++){
            int die= random.nextInt(6)+1;
            currentSpace=currentSpace+die;
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i,die ));
            if(currentSpace==totalSpace){
                System.out.print("you are on space "+ currentSpace +" congrats you won ");
                //break;
            }
            else if (i==dieRolls&&currentSpace<totalSpace) {
                System.out.print("you are on space "+ currentSpace +" you loose");
                //break;
            } else if (currentSpace>totalSpace) {
                System.out.println("you are on space"+ currentSpace+ " you exceed the number so you loose");
               // break;
            }
            else{
                int spaceToGo=currentSpace-totalSpace;
                System.out.println("you are on space "+currentSpace+" have to go "+spaceToGo+" more to go");
            }
            System.out.println();
        }
    }
}
