
import java.util.Date;

//Author: Zane James
//Program: Chap7PP_ZaneJames
//Purpose: Account manager including user enabled deposit, withdrawal, and account checking capabilities
//Date: 04/20/2025


public class Chap9_James {
   
    
   //setup main method 
    public static void main(String[] args) {
        

    }

    /**************************************
    //DEFINES THE ACCOUNT CLASS AND METHODS
    **************************************/

    public class Account {
    

        //define private data fields
        private int id = 1500;
        private double balance = 0;
        private static double annualInterestRate = 0; //this is same for all accts
        private Date dateOpened = new Date();

        //no arg constructor
        Account() {
            
        }
    
        //id and initial balance constructor
        Account(int id, int balance) {
            //set id and balance amounts from args
            this.id = id;
            this.balance = balance;
            annualInterestRate = 0;
            dateOpened = new Date();

        }

        /***************************
         ********   CLASS     ******
         ********   METHODS   ****** 
         **************************/
        
        
        //private accessors and mutators
        private void setId(int id) {
            this.id = id;
        }

        private void setBalance(int amount) {
           this.balance = amount; 
        }

        private void setAnnualInterestRate(Double percent) {
            this.annualInterestRate = percent;
        }

        private int getId() {
            return id;
        }

        private double getBalance() {
            return balance;
        }

        private double getAnnualInterestRate() {
            return annualInterestRate;
        } 
        
        private Date getDateOpened() {
            return dateOpened;
        }

        //public accessor methods
        public double getMonthlyInterestRate() {
            return (annualInterestRate / 12);
        }

        public double getMonthlyInterest() {
            return ((annualInterestRate / 12) / 100);
        }

        //user available methods
        public void withdraw(int amount) {
            balance -= amount;
        }
    
        public void deposit(int amount) {
            balance += amount;
        }

        public String PrintAccount() {
            System.out.printf("The account id is: %d.\n"
                           + "This account was opened on %s.\nBalance: $%.2f\n"
                           + "Annual Interest Rate: %.2f%%\nMonthly Interest: "
                           + "$%.2f\n" 
            
            
            ")
        }
    }
}