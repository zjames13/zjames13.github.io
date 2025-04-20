import java.util.Scanner;

public class Chap423_James {
    public static void main(String [] args) {

        //retrieve user input w/ scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the employee's name: ");
        String name = input.nextLine();

        System.out.print("Please enter the hours worked with two decimal places: ");
        double hours = input.nextDouble();

        System.out.print("Please enter the hourly pay rate as a dollar amount: ");
        double rate = input.nextDouble();
    
        System.out.print("Enter the federal tax witholding rate as a number from 0 to 1: ");
        double fedRate = input.nextDouble();

        System.out.print("Enter the state tax witholding rate as a number from 0 to 1:");
        double stateRate = input.nextDouble();

        //calculate necessary figures
        double grossPay = hours * rate;
        double fedTax = grossPay * fedRate;
        double stateTax = grossPay * stateRate;
        //create character for % sign for ease of string creation
        char percent = '%'; 

        //output results
        System.out.println("Employees Name: " + name);
        System.out.println("Hour worked: " + hours);
        System.out.printf("Pay Rate: $%.2f\n" , rate);
        System.out.printf("Gross Pay : %.2f\n" , grossPay);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Witholding (%.2f%c): $%.2f\n" , (fedRate * 100) , percent,  fedTax);
        System.out.printf("\tState Witholding (%.2f%c): $%.2f\n" , (stateRate * 100) , percent, stateTax);
        System.out.printf("\tTotal Deduction: $%.2f\n" , stateTax + fedTax);
        System.out.printf("Net Pay: $%.2f" , grossPay - stateTax - fedTax);
    }
}

