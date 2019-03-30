import java.util.Scanner;

/**
 *Program that will display how many bills to dispense based
 *on user input.
 *Project 02
 *Jonathan Osborne COMP 1210-008
 *01/24/18
 */
 
public class ATM {
 /**
 *This will print the bills and make sure $300 is not exceeded.
 *@param args Command line arguments-not used.
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int amount, amt20, amt10, amt5, amt1;
      
      //ask the user for amount
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
      amt20 = amount / 20;
      amt10 = amount % 20 / 10;
      amt5 = amount % 20 % 10 / 5;
      amt1 = amount % 20 % 10 % 5 / 1;
      //make sure amount is less than or equal to 300
      if (amount >= 300) {
         System.out.print("Limit of $300 exceeded!");
      }
      else {
         //shows amount of bills
         System.out.println("Bills by denomination: ");
         System.out.println("\t$20: " + amt20);
         System.out.println("\t$10: " + amt10);
         System.out.println("\t$5: " + amt5);
         System.out.println("\t$1: " + amt1);
         System.out.println("$" + amount + " = " + "(" 
            + amt20 + " * $20) + (" + amt10 + " * $10) + (" 
            + amt5 + " * $5) + (" + amt1 + " * $1)");
      }
     
   }
 
}