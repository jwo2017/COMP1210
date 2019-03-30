import java.util.Comparator;

/**
*.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/

public class CostComparator implements Comparator<Bunny> {

/**
*@param b1 is bunny 1.
*@param b2 is bunny 2.
*@return returns 0, 1, or -1.
*/
   public int compare(Bunny b1, Bunny b2) {
      if (Math.abs(b1.estimatedMonthlyCost() 
         - b2.estimatedMonthlyCost()) < 0.001) {
         return 0;
      }
      
      else if (b1.estimatedMonthlyCost() > b2.estimatedMonthlyCost()) {
         return 1;
      }
      else {
         return -1;
      }
   }
}