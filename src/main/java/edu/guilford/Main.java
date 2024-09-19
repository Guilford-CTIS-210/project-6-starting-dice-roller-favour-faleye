package edu.guilford;
//Favour Faleye
//9/19/2024
//Project 6: Starting Dice Roller

//this imports the functions that allow user-input and randomization 
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //this declares a Random object called rand
        Random rand = new Random();

        //This declares the Scanning object
        Scanner scan=new Scanner(System.in);

        //this tells reader that they are rolling dice, allows them to type it in
        System.out.println("Hi! You're going to be rolling dice. This program will show the total. \nHow many sides does it have?");
    

        //this creates an integer sides. it is an integer determined by user input
        int sides=scan.nextInt();
        
        //this reads the user input and saves it as an integer
        System.out.println("How many dice do you want to roll? ");
        int number=scan.nextInt();

        //this is the integer sum.it is the sum of the sides of the dice
        int sum=0;
        
        // default for loop, prints loop variable as it counts up
        //int i =0 this sets the value for the first iteration of i
        // i<10 sets this for loop for all values where i <10
        // i++ adds 1 to i
        for (int i = 0; i < number; i++) {
            int diceRoll=rand.nextInt(1,sides);  //diceRoll makes the roll random--numbers will not be the same
            sum += diceRoll;
           // System.out.println("sum of " + i + 'd' + sides + "=" + sum);
        }
        //this prints the result of the dice roll as well as its sum
        System.out.println("Rolling " + number + "d" + sides + "=" + sum);
    }


}