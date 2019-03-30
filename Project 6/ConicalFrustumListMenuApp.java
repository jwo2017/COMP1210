import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 *Presents a menu to the user that enables them to choose
 *between a list of options to do with a conical frustum.
 *Project 6
 *Jonathan Osborne COMP 1210-008
 *02/28/18
 */

public class ConicalFrustumListMenuApp {

/**
*Main method that presents the menu.
*@param args Command line arguments not used.
*@throws FileNotFoundException is thrown if invalid file is input.
*/

   public static void main(String[] args) throws FileNotFoundException {
      Scanner userInput = new Scanner(System.in);
      String fileName = "";
      String input = "";
      String listName = "";
      String label = "";
      double r1, r2, height;
      int ind = 0;
      
      ArrayList<ConicalFrustum> myList = new ArrayList<ConicalFrustum>();
      
      
      ConicalFrustumList myCList = new ConicalFrustumList(listName, myList);
      
      
      System.out.println("ConicalFrustum List System Menu"
         + "\nR - Read File and Create ConicalFrustum List"
         + "\nP - Print ConicalFrustum List"
         + "\nS - Print Summary"
         + "\nA - Add ConicalFrustum"
         + "\nD - Delete ConicalFrustum"
         + "\nF - Find ConicalFrustum"
         + "\nE - Edit ConicalFrustum"
         + "\nQ - Quit");
         
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = userInput.nextLine();
         if (input.length() == 0) {
            continue;
         }
         input = input.toUpperCase();
         char code = input.charAt(0);
         switch(code) {
            case 'R': System.out.print("\tFile name: ");
               fileName = userInput.nextLine();
               
               myCList = myCList.readFile(fileName);
               
               System.out.println("\tFile read in and ConicalFrustum List"
                  + " created\n");
                  
               break;
                  
            case 'P':
               System.out.print("\n" + myCList);
               break;
            case 'S':
               System.out.println("\n" + myCList.summaryInfo() + "\n");
               break;
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius1: ");
               r1 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius2: ");
               r2 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
            
               myCList.addConicalFrustum(label, r1, r2, height);
               System.out.println("\t*** ConicalFrustum added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               if (myCList.findConicalFrustum(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  label = myCList.findConicalFrustum(label).getLabel();
                  myCList.deleteConicalFrustum(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (myCList.findConicalFrustum(label) != null) {
                  System.out.println(myCList.findConicalFrustum(label) + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius1: ");
               r1 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius2: ");
               r2 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               
               if (myCList.findConicalFrustum(label) != null) {
                  myCList.editConicalFrustum(label, r1, r2, height);
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }     
      } while (!input.equalsIgnoreCase("Q"));
   }
}