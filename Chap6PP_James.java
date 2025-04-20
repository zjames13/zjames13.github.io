//Author: Zane James
//Program: Chap6PP_ZaneJames
//Purpose: Receives user-entered password and determines if it's valid
//Date: 04/12/2025

import java.util.Scanner;

public class Chap6PP_James {
   
    public static void main(String[] args) {

        //first get the password from the user
        String password = getPassword();

        //check the user's password
        boolean validity = checkPassword(password);

        //output correct if password is valid
        if (validity) {
            System.out.println("Valid Password");
            System.out.println("The password's length is " + password.length() + " characters long.");
            return;
        }

        //return incorrect 
        while (!(validity)) {
            System.out.println("Please enter a new password: ");
            password = getPassword();
            validity = checkPassword(password);
        }
    }
    
        

    //checks password for validity
    public static boolean checkPassword(String password) {

        //declare check variables
        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        int digitCount = 0;
        boolean result = false;
        //checks length
        if (length < 12) return false;

        //for loop to count number of digits, check upper, and check lower
        for (int i = 0; i < length; ) {
           
            char value = password.charAt(i);
            if (Character.isDigit(value)){
                digitCount++; //simple single line to increase count if character is digit
            } 

            else if (Character.isUpperCase(value)) {    //checks for uppercase letter
                hasUpper = true;
            }
            
            else if (Character.isLowerCase(value)) {    //checks for lowercase
                hasLower = true;
            }
            else {   //if the value is neither a letter or digit, it's not usable
                System.out.println("The password can only contain letters and digits.");
            }
        }
       
        if ((digitCount >= 3) &&        //if all three conditions are met, true will be returned
            (hasUpper) &&
            (hasLower)) {
            result = true;
        }

        if (digitCount < 3) {
            System.out.println("The password does not have three digits.");
        }

        if (!(hasUpper)) {
            System.out.println("The password needs an uppercase letter.");
        }

        if (!(hasLower)) {
            System.out.println("The password needs a lowercase letter.");
        }
        
       
        
        return result;
    }
           
        




    //retrieves potential password from user and returns the string as value
    public static String getPassword() {

        Scanner input = new Scanner(System.in); //instantiate Scanner for input
        String password = input.next();     //input.next gives us the next string

        //Output text block
        System.out.println("Please enter a valid password.");
        System.out.println("Only letters and digits may be used.");
        System.out.println("Passwords must be 12 characters,");
        System.out.println("must include at least 3 digits,");
        System.out.println("and there must be at least 1 upper and lowercase letter.");

        return password;
    }
}