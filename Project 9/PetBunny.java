/**
*Subclass of bunny that represnts 
*a pet bunny.
*
*COMP 1210 - 008
*Jonathan Osborne
*Project 09
*4/6/18
*/

public class PetBunny extends Bunny {
/** Constant for base cost. **/
   public static final double BASE_COST = 1.85;
   
   /**
   *@param nameIn represents name.
   *@param breedIn represents the breed.
   *@param weightIn represents the weight.
   */
   public PetBunny(String nameIn, String breedIn, double weightIn) {
      super(nameIn, breedIn, weightIn);
   }
   
   /**
   *@return returns the cost / month.
   */
   public double estimatedMonthlyCost() {
      return BASE_COST * weight;
   }
  
   /**
   *@return returns a string with info.
   */
   public String toString() {
      return super.toString();
   }
}