//Author: Zane James
//Program: CS1060_Miderterm_James.java
//Purpose: Simulates multiple rounds of craps based on user input for continuance
//Date: 03/23/2025

import java.util.Scanner;


public class CS1060_Midterm_James {

    //WHILE I REALLY WANTED TO USE CONSTANTS, I COULD NOT FIND A GOOD USE CASE
    /* 
     * ********* DECLARE MAIN VARIABLES
     */
    static int roll;            //declare variables for the roll 
   
    static int dice1;           //declare variables for each dice to track 
    static int dice2;
 
    static boolean keepGoing = true;      //boolean variable for continuation of game  
  
    static Scanner input = new Scanner(System.in);      //build a scanner

    static int wins = 0;        //keeps track of wins and losses
    static int bigWins = 0;
    static int losses = 0;
    public static void main(String[] args) {


        String name;    //set variable for the name
        name = getName();    //get the name

        printDice();    //print dice picture
        

//setup playloop for repeat games
//will continue as long as player continues entering y in askGo method
        while (keepGoing) {
            rollDice();  //roll the dice first in the loop
                                        
            if (checkCrapsWin(roll)) {    //check if it's a natural win, craps, or point
                askGo();                  //check to continue
            }
            else {
            int point = roll;                   //hold the first roll to compare next rolls
            System.out.println("Let's keep going!\nYour number to match is " + point);   //let player know the game keeps going
            checkBigWin(point);                 //check for the next win
            askGo();                            //ask to continue here
            }
        }

//output results
        printResults(name);
    }    

    //method for rolling individual die 
    public static int roll() {
        int number = (int)(1 + (Math.random() * 6)); //random integer 1 to 6
        return number;  //returns number to assign to dice
    }

    //method for a complete dice roll; sets class variables for each die and the total roll
    public static void rollDice() {
        dice1 = roll();
        dice2 = roll();        
        System.out.println("Dice one is " + dice1 + " and Dice two is " + dice2 + "."); //prints each dice
        roll = dice1 + dice2;
        System.out.println("The roll is " + roll + ".");  //prints the total roll.
    }
    
    //gets name from user with Scanner object
    public static String getName() {
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        return name;   //returns user entered name as method's results
    }

    //checks for the initial win condition
    public static boolean checkCrapsWin(int roll) {   //takes the roll from the method
        if ((roll == 7) || (roll == 11)) {              //checks for natural win first
            System.out.println("Natural! You won!");
            wins++;   //increments wins
            return true;                //sets to true for main method (the checkcraps method is valid)
        }
        else if ((roll == 2) ||         //losing conditions, any of them
                 (roll == 3) ||
                 (roll == 12)) {
            System.out.println("Craps! You lose!");
            losses++;  //increments losses
            return true;  //still true despite loss because this method applies to the roll
        }
        else {
            return false;  //if none of these conditions are met, more rolls need to be performed
        } 
    }

    //checks for further wins after initial check
    public static void checkBigWin(int point) {    //takes the saved "point" value from the roll prior
        do { 
            rollDice();  //performs new roll after saving base roll for comparison
            if (roll == 7) {
                System.out.println("Aww too bad! Better luck next time!");   // lose condition
                losses++;   //adds to loss tally
                break;
           }
           else if (roll == point) {  //win conditions
                System.out.println("Congratulations! You won this round!");
                if (dice1 == dice2) {  //checks for doubles during a win
                    System.out.println("Even better, you rolled doubles; winner winner chicken dinner!!!");
                    bigWins++;  //maintains big win increment
                }
                else {
                   wins++;  //maintains win increment
                }
           }
        } while (roll != point);        //continues rolling until a win or loss occurs; roll always changes at beginning
         
    }

    public static void printDice() {
        System.out.println("");
        System.out.println("\t\tWelcome to Craps!");
        System.out.println("===============      ===============");
        System.out.println("|             |      |          *  |");
        System.out.println("|   *         |      |             |");
        System.out.println("|             |      |      *      |");
        System.out.println("|         *   |      |             |");
        System.out.println("|             |      |  *          |");
        System.out.println("===============      ===============");
    }

    public static void askGo() {
        System.out.println("Would you like to play another round? Enter 'y' for yes and 'n' for no.");
        String answer = (input.next());
        if (answer.equals("n")) {
             keepGoing = false;
        }
    }
//simple print script to report wins/losses
    public static void printResults(String name) {
        System.out.println("Player: " + name);
        System.out.println("Number of wins: " + wins);
        System.out.println("Number of big wins: " + bigWins);
        System.out.println("Number of losses: " + losses);
        System.out.println("");
        System.out.println("Thanks for playing!");
    }
}
