//Name: <Zane James>

//Date: 02/20/2025

//Program: Week5JgraspDebug

public class Week5JgraspDebug {
   public static void main(String[] args) {
      double radius; // Declare radius
      double area; // Declare area
         
      // Debug Compile Error
      int x = 5 / 20.0; // Compile Error 
      
      // Assign a radius
      radius = 20; // New value is radius
   
      // Compute area
      area = radius * radius * 3.14159;
   
      // Display results
      System.out.println("The area for the circle of radius " +
         radius + " is " + area);
   }
}
