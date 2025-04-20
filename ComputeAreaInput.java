import java.util.Scanner;

public class ComputeAreaInput {
  public static void main(String[] args) {
    double radius; // Declare radius
    double area; // Declare area
      // Assign a radius
      try ( //instantiate scanner
              Scanner input = new Scanner(System.in)) {
          // Assign a radius
          System.out.println("Please enter the radius of the circle: ");
          radius = input.nextDouble(); // New value is radius
      }
    // Compute area
    area = radius * radius * 3.14159;

    // Display results
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  }
}
