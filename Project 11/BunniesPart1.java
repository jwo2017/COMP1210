
/**
*Class for main method for Bunny and subclasses.
*
*COMP 1210 - 008
*Jonathan Osborne
*Project 09
*4/6/18
*/

public class BunniesPart1 {
   
   /**
   *Main method for bunny classes.
   *@param args Command line arguments
   */
   public static void main(String[] args) {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      System.out.println(pb1);
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      System.out.println(hb1);
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      System.out.println(jb1);
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      System.out.println(sb1);
   }
}