import java.io.FileNotFoundException;

/**
*Exception for negative values.
*COMP 1210 - 008
*Jonathan Osborne
*Project 11
*4/10/18
*/


public class BunniesPart3 {

/**
*@param args command line arguments
*@throws NegativeValueException if the value is negative.
*/

   public static void main(String[] args) 
      throws NegativeValueException {
      if (args.length == 0) {
         System.out.println("*** File name not provided by command"
            + " line argument. \nProgram ending.");
         return;
      }
      String fileName = args[0];
      
      BunnyList myList = new BunnyList();
      try {
         myList.readBunnyFile(fileName);
      } catch (FileNotFoundException issue) {
         System.out.println("*** File not found.\nProgram Ending.");
         return;
      }
      System.out.print(myList.summary());
      
      System.out.print(myList.listByName());
      
      System.out.print(myList.listByCost());
      
      System.out.print(myList.excludedRecordsList());
   }
}