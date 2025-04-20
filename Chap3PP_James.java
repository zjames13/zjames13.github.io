//Author: Zane James
//Program: Chap3PP_ZaneJames
//Purpose: Performs a single round of the game "War"
//Date: 03/01/2025

public class Chap3PP_James {

    public static void main(String[] args) {

        //First initialize card ranks, suits, and values

        String rank1 = "";      //establish variable for rank of card 1
        int value1 = (int)(Math.random() * 13);  //holds value for comparison at the end

        switch (value1) {               //variable "value1" determines card rank
            case 0 -> rank1 = "Ace";
            case 1 -> rank1 = "Two";
            case 2 -> rank1 = "Three";
            case 3 -> rank1 = "Four";
            case 4 -> rank1 = "Five";
            case 5 -> rank1 = "Six";
            case 6 -> rank1 = "Seven";
            case 7 -> rank1 = "Eight";
            case 8 -> rank1 = "Nine";
            case 9 -> rank1 = "Ten";
            case 10 -> rank1 = "Jack";
            case 11 -> rank1 = "Queen";
            case 12 -> rank1 = "King";
        }
        String suit1 = "";    //Initialize string for the suit

        switch ((int)(Math.random() * 4)) {         //uses random numb from 0-3
            case 0 -> suit1 = "Hearts";             //use switch structure to assign suit
            case 1 -> suit1 = "Clubs";
            case 2 -> suit1 = "Diamonds";
            case 3 -> suit1 = "Spades";
        }

        //repeat previous steps for card 2
        String rank2 = "";
        int value2 = (int)(Math.random() * 13);
        
        while (value2 == value1) {      //This checks to make sure the cards won't
            value2 = (int)(Math.random() * 13);     //    duplicate
        }

        switch (value2) {
            case 0 -> rank2 = "Ace";
            case 1 -> rank2 = "Two";
            case 2 -> rank2 = "Three";
            case 3 -> rank2 = "Four";
            case 4 -> rank2 = "Five";
            case 5 -> rank2 = "Six";
            case 6 -> rank2 = "Seven";
            case 7 -> rank2 = "Eight";
            case 8 -> rank2 = "Nine";
            case 9 -> rank2 = "Ten";
            case 10 -> rank2 = "Jack";
            case 11 -> rank2 = "Queen";
            case 12 -> rank2 = "King";
        }
        String suit2 = "";
        switch ((int)(Math.random() * 4)) {
            case 0 -> suit2 = "Hearts";             //use switch structure to assign suit
            case 1 -> suit2 = "Clubs";
            case 2 -> suit2 = "Diamonds";
            case 3 -> suit2 = "Spades";
        } 



        System.out.println("Player 1's card is " + rank1 + " of " + suit1);  //prints 
        System.out.println("Player 2's card is " + rank2 + " of " + suit2);//card 1 and 2

        //Decision block below prints out the winner 
        
        if (value1 == 0) {
            System.out.println("Player 1 wins!");
        }
        else if (value2 == 0) {
            System.out.println("Player 2 wins!");
        } 
        else if (value1 > value2) {
            System.out.println("Player 1 wins!");
        }
        else {
            System.out.println("Player 2 wins!");
        }
    }
}
