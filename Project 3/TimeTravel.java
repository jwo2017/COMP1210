import java.util.Scanner;
import java.text.DecimalFormat;
 
 /**
 *Will show the price and other relevant information based on user 
 *entered ticket info.
 *Project 03
 *Jonathan Osborne COMP 1210-008
 *01/31/18
 */
 
public class TimeTravel {
 
 /**
*Shows the information about ticket.
*@param  args Command line arguments-not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String code, hour, min, month, day, year, price;
      double cost, newprice;
      char cat, student, employee;
      DecimalFormat money = new DecimalFormat("$#,##0.00");
      DecimalFormat prize = new DecimalFormat("0000");
      
      student = 's';
      employee = 'e';
      
      
   
      //asks for user code
      System.out.print("Enter ticket code: ");
      code = userInput.nextLine();
      code = code.trim();
      
      
      
      if (code.length() < 26) {
         System.out.print("\n*** Invalid ticket code ***"
            + "\nTicket code must have at least 26 characters.");
      }
      else {
      //hour and min
         hour = code.substring(0, 2);
         min = code.substring(2, 4);
         
         //date
         month = code.substring(4, 6);
         day = code.substring(6, 8);
         year = code.substring(8, 12);
         
         //category 
         cat = code.charAt(12);
         
         //prices
         price = code.substring(13, 20) + "." + code.substring(20, 22);
         newprice = Double.parseDouble(price);
         
         //if-else for the category discount
         if (cat == student) {
            cost = newprice / 2;
         }
         else if (cat == employee) {
            cost = newprice - (newprice * 0.25);
         }
         
         else {
            cost = newprice;
         }
         
         //the information is fianlly printed all at once
         System.out.print("\nTime: " + hour + ":" + min);
         System.out.print("   Date: " + month + "/" + day + "/" + year);
         System.out.print("   Seat: " + code.substring(22, 25));
         System.out.print("\nItinerary: " + code.substring(25));
         System.out.print("\nPrice: " + money.format(newprice));
         System.out.print("   Cost: " + money.format(cost));
         System.out.print("   Category: " + cat);
         System.out.print("\nPrize Number: " + prize.format(Math.random() 
            * 10000));
      }
      
   }
}