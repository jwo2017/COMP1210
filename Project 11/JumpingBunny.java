import java.text.DecimalFormat;
/**
*Subclass of Bunny that represnts 
*a jumping bunny.
*
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/

public class JumpingBunny extends Bunny {
   private double trainingCost = 0.0;
   /** Constant for the base cost. **/
   public static final double BASE_COST = 2.50;
   
   /**
   *@param nameIn represents name.
   *@param breedIn represents the breed.
   *@param weightIn represents the weight.
   *@param trainingCostIn represents the trainingCost.
   *@throws NegativeValueException if a negative number is entered.
   */
   public JumpingBunny(String nameIn, String breedIn, 
      double weightIn, double trainingCostIn) 
         throws NegativeValueException {
      super(nameIn, breedIn, weightIn);
      if (trainingCostIn < 0) {
         bunnyCount--;
         throw new NegativeValueException();
      }
      trainingCost = trainingCostIn;
   }
   
   /**
   *@return returns the training cost.
   */
   public double getTrainingCost() {
      return trainingCost;
   }
   
   /**
   *@param trainingCostIn represents the training cost
   */
   public void setTrainingCost(double trainingCostIn) {
      trainingCost = trainingCostIn;
   }
   
   /**
   *@return returns the cost / month
   */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight + trainingCost;
   }
   
   /**
   *@return returns a string with info.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#.00");
      return super.toString() + " (includes $"
         + df.format(trainingCost) + " for training)";
   }
}