//Name: <Zane James> 
//Date: <13 February 2024>
//Program: <Chapter 2 Programming Assignment>
//Program Description: <This program calculates the gravity of a planet from a user given diameter
//Inputs:  <User needs to input diameter> 
//Outputs: <This will output a floating-point number for the force of gravity.
//          Also outputs an ASCII USS Enterprise>

import java.util.Scanner;
public class Chap2PP_James {
    public static void main(String[] args) {

        //These print statements create the image of USS enterprise when stacked
        System.out.println("   *************************         **    ");
        System.out.println("    *************************    **********  ");
        System.out.println("     ***********************   **************");
        System.out.println("           " + '\\' + "\\" + "      //               ****     ");
        System.out.println("            \\\\    //         ");
        System.out.println("     ********\\" + "\\**********  ");
        System.out.println("    **************************(");
        System.out.println("   **************************");
        System.out.println("              *********");
        
        // Declare necessary constants
        double GRAVITY = 6.67E-11;

        // Declare other constants like mass
        double EARTHMASS = 5.9736E24;
        double MOONMASS = 7.346E22;
        double MARSMASS = 6.4169E23;
        
        //*********instantiate scanner to get input from user
        Scanner input = new Scanner(System.in);

        //**********declare diameter variable and assign user input to it after prompting user
        System.out.println("Please enter the diameter for Earth: ");
        int earthDiameter = input.nextInt();

        //***********calculate earth's gravity by using g=Gm/r2
        double earthGravity = GRAVITY * EARTHMASS / Math.pow( (earthDiameter / 2.0), 2 ); //diameter is 2*radius
    
        //*******repeat previous two steps for the moon and mars
        System.out.println("Please enter the diameter for the moon: ");
        int moonDiameter = input.nextInt();
        double moonGravity = GRAVITY * MOONMASS / Math.pow( (moonDiameter / 2.0), 2 );
        
        System.out.println("Please enter the diameter for Mars: ");
        int marsDiameter = input.nextInt();
        double marsGravity = GRAVITY * MARSMASS / Math.pow( (marsDiameter / 2.0), 2);

        //**********Print results
        System.out.println("--------------------------------------------------");
        System.out.println("The approximate gravity on Earth is:" + earthGravity);
        System.out.println("The approximate gravity on the moon is: " + moonGravity);
        System.out.println("The approximate gravity on Mars is: " + marsGravity);
    }
}
