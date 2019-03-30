
/**
*Subclass of petbunny that represnts 
*a house bunny.
*
*COMP 1210 - 008
*Jonathan Osborne
*Project 09
*4/6/18
*/

public class HouseBunny extends PetBunny {
   private double wearAndTear = 0.0;
   /** Constant for base cost. **/
   public static final double BASE_COST = 2.25;
   
   /**
   *@param nameIn represents name.
   *@param breedIn represents the breed.
   *@param weightIn represents the weight.
   *@param wearAndTearIn represents the wear and tear.
   */
   public HouseBunny(String nameIn, String breedIn,
      double weightIn, double wearAndTearIn) {
      super(nameIn, breedIn, weightIn);
      wearAndTear = wearAndTearIn;
   }
   
   /**
   *@return returns the wear and tear.
   */
   public double getWearAndTear() {
      return wearAndTear;
   }
   
   /**
   *@param wearAndTearIn represnts the wear and tear to be set.
   */
   public void setWearAndTear(double wearAndTearIn) {
      wearAndTear = wearAndTearIn;
   }
   
   /**
   *@return returns the monthly cost.
   */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight * (1 + wearAndTear);
   }
   
   /**
   *@return returns string with info.
   */
   public String toString() {
      return super.toString() + " (includes " + wearAndTear * 100
         + "% for wear and tear)";
   }
}