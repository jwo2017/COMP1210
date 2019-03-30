import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *Creates data based on radii and height.
 *Project 6
 *Jonathan Osborne COMP 1210-008
 *02/28/18
 */
public class ConicalFrustumListApp {

/**
*@param args command line arguments -- not used.
*@throws FileNotFoundException throws the exception if the file isn't found.
*/
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<ConicalFrustum> list = new ArrayList<ConicalFrustum>();
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter file name: ");
      
      String fileName = keyboard.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double r1 = Double.parseDouble(scanFile.nextLine());
         double r2 = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         
         ConicalFrustum cone = new ConicalFrustum(label, r1, r2, height);
         list.add(cone);
      }
      
      scanFile.close();
      
      ConicalFrustumList myFrustumList = 
         new ConicalFrustumList(listName, list);
      
      System.out.print("\n" + myFrustumList + "\n"
         + myFrustumList.summaryInfo() + "\n");
   
   }
}