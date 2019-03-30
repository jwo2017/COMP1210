import java.util.Scanner;

/**
 *Obtains data and displays it.
 *Project 04
 *Jonathan Osborne COMP 1210-008
 *02/09/18
 */
 
public class ConicalFrustumApp {
 /**
 *Displays info to user.
 *@param args command line args
 */
 
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String label, r1, r2, height;
      
      System.out.print("Enter label, radius1, radius2, and "
         + "height for a conical frustum.\n\tlabel: ");
      label = keyboard.nextLine();
      System.out.print("\tradius1: ");
      r1 = keyboard.nextLine();
      if (Double.parseDouble(r1) < 0) {
         System.out.print("Error: radius1 must be non-negative.");
         return;
      }
      System.out.print("\tradius2: ");
      r2 = keyboard.nextLine();
      if (Double.parseDouble(r2) < 0) {
         System.out.print("Error: radius2 must be non-negative.");
         return;
      }
      System.out.print("\theight: ");
      height = keyboard.nextLine();
      if (Double.parseDouble(height) < 0) {
         System.out.print("Error: height must be non-negative.");
         return;
      }
      
      ConicalFrustum result = new ConicalFrustum(label, Double.parseDouble(r1), 
         Double.parseDouble(r2), Double.parseDouble(height));
      
      System.out.print(result);
   }
}