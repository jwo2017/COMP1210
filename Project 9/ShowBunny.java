import java.text.DecimalFormat;
/**
*Subclass of Bunny that represnts 
*a show bunny.
*
*COMP 1210 - 008
*Jonathan Osborne
*Project 09
*4/6/18
*/

public class ShowBunny extends Bunny {
   private double groomingCost = 0.0;
   /** Constant representing the cost of a bunny. **/
   public static final double BASE_COST = 2.75;
   
   /**
   *@param nameIn represents name.
   *@param breedIn represents the breed.
   *@param weightIn represents the weight.
   *@param groomingCostIn represents the groomingCost.
   */
   public ShowBunny(String nameIn, String breedIn,
      double weightIn, double groomingCostIn) {
      super(nameIn, breedIn, weightIn);
      groomingCost = groomingCostIn;
   }
   
   /**
   *@return returns groomingcost
   */
   public double getGroomingCost() {
      return groomingCost;
   }
   
   /**
   *@param groomingCostIn represents the grooming cost.
   */
   public void setGroomingCost(double groomingCostIn) {
      groomingCost = groomingCostIn;
   }
   
   /**
   *@return returns the cost / month
   */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight + groomingCost;
   }
   
   /**
   *@return returns a string with info.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#.00");
      return super.toString() + " (includes $" + df.format(groomingCost)
         + " for grooming)";
   }
}