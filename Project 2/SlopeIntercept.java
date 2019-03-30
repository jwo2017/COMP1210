import java.util.Scanner;
/**
 *Takes x and y coordinates and calculates slope.
 *Project 02
 *Jonathan Osborne COMP 1210-008
 *01/24/18
 */

public class SlopeIntercept {
/**
*Calculates slope as defined by two user-entered points.
*@param args Command line arguments-not used
*/

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x1, x2, y1, y2, slope, yint, xint;
      
      //asks for user input for x & y coordinates of starting
      //and ending points
      System.out.print("Enter the X and Y coordinates of starting point: "
         + "\n\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
      System.out.print("Enter the X and Y coordinates of ending point: "
         + "\n\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
      //does mathy stuff; checks that slope is defined
      if (x1 == x2) {
         System.out.println("Slope: \"undefined\"");
      }
      else {
         slope = (y2 - y1) / (x2 - x1);
         System.out.println("Slope: " + slope);
         yint = y1 - slope * x1;
         System.out.println("Y intercept: " + yint);
         if (slope == 0) {
            System.out.println("X intercept: \"undefined\"");
         }
         else {
            xint = -1 * (yint / slope);
            System.out.println("X intercept: " + xint);
         }
      }
   }
}