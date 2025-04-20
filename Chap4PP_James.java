
import java.util.Scanner;

//Author: Zane James
//Program: Chap4PP_ZaneJames
//Purpose: converts int 1-15 to hex and binary; display random lowercase and in uppercase
//Date: 03/05/2025
public class Chap4PP_James {
    public static void main(String[] args) {
        // get integer from user
        System.out.print("Please enter a number from 1 to 15: ");
        Scanner input = new Scanner(System.in);  //instantiate Scanner to get user input
        int number = input.nextInt();       //the number the user wants to convert
        
        //check input for accuracy
        while (number < 1 || number > 15) {
            System.out.print("Entry is out of range, please enter a number from 1 to 15: ");
            number = input.nextInt();
        }
        String hex = "0";          //hex is set to 00 before being assigned proper value
        int binary = 0000;          //binary is also set to 0000
    
        if (number < 10) {
            hex = "" + number;      //since 0-9 are the same in hex, hex becomes number
        }
        else {
            switch (number) {       //everything else is assigned alphabetically
                case 10 -> hex = "A";
                case 11 -> hex = "B";
                case 12 -> hex = "C";
                case 13 -> hex = "D";
                case 14 -> hex = "E";
                case 15 -> hex = "F";
            }
        }

        //convert binary
        int loopNumber = number;
        for (int n = 0 ; loopNumber > 0 ; n++) {
            if (loopNumber % 2 == 1) {
                binary += Math.pow(10 , n);
            }
            loopNumber = loopNumber / 2;
        }
        
        System.out.println(number + " in hexadecimal is " + hex + "."); //print hex
        System.out.printf("%d in binary is %04d. \n" , number , binary); //print binary
        
        char randomLetter = (char) (97 + (Math.random() * 26));  //generate random letter
        char capitalLetter = Character.toUpperCase(randomLetter); //easy to uppercase
    
        System.out.println("The random letter generated is " + randomLetter + " and its uppercase is " + capitalLetter + ".");  //output both letter

        if ((randomLetter == 'a') || (randomLetter == 'e') || (randomLetter == 'i') || (randomLetter == 'o') || (randomLetter == 'u')) {
            System.out.println(capitalLetter + " is a vowel.");  //Vowel determination
        }
        else {
            System.out.println(capitalLetter + " is a consanant.");
        }
        
    }
}

