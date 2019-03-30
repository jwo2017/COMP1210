//import java.io.File;
import java.io.FileNotFoundException;

/**
*Creates instances of the bunnylist class.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/


public class BunniesPart2 {

/**
*@param args Command Line arguments.
*@throws FileNotFoundException if file isn't found.
*/
   public static void main(String[] args) 
      throws FileNotFoundException {
      String fileName = args[0];
      
      BunnyList myList = new BunnyList();
      myList.readBunnyFile(fileName);
      
      System.out.print(myList.summary());
      
      System.out.print(myList.listByName());
      
      System.out.print(myList.listByCost());
      
      System.out.print(myList.excludedRecordsList());
   }
}