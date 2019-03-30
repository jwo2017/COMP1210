import java.text.DecimalFormat;
/**
*Abstract class for the subclasses of "Bunny".
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/

public abstract class Bunny implements Comparable<Bunny> {
   protected String name = "";
   protected String breed = "";
   protected double weight = 0.0;
   protected static int bunnyCount = 0;
   
   /**
   *Constructor for bunny class.
   *@param nameIn represents name to be set.
   *@param breedIn represents breed to be set.
   *@param weightIn represents the weight to be set.
   */
   public Bunny(String nameIn, String breedIn, 
      double weightIn) {
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
      bunnyCount++;
   }
   
   
   /**
   *@return returns the name.
   */
   public String getName() {
      return name;
   }
   
   /**
   *@param nameIn is the name to be set.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   *@return returns breed.
   */
   public String getBreed() {
      return breed;
   }
   
   /**
   *@param breedIn is the breed to be set.
   */
   public void setBreed(String breedIn) {
      breed = breedIn;
   }
   
   /**
   *@return returns the weight.
   */
   public double getWeight() {
      return weight;
   }
   
   /**
   *@param weightIn is the weight to be set.
   */
   public void setWeight(double weightIn) {
      weight = weightIn;
   }
   
   /**
   *@return returns the total number of bunnys.
   */
   public static int getBunnyCount() {
      return bunnyCount;
   }
   
   /**
   *void method for resetting bunny count.
   */
   public static void resetBunnyCount() {
      bunnyCount = 0;
   }
   
   /**
   *abstract method for the monthly cost.
   *@return will return a double when not abstract.
   */
   public abstract double estimatedMonthlyCost();
   
   /**
   *@return returns a string with info of bunny
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#.00");
      return name + " (" + this.getClass().getName()
         + ")   Breed: " + breed + "   Weight: " + weight
         + "\nEstimated Monthly Cost: $" + df.format(estimatedMonthlyCost());
   }
   
   /**
   *@return returns a boolean.
   *@param obj represents an object.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Bunny)) {
         return false;
      }
      else {
         Bunny b = (Bunny) obj;
         return (name.equalsIgnoreCase(b.getName())
            && breed.equalsIgnoreCase(b.getBreed())
            && Math.abs(weight - b.getWeight()) < .000001);
      }
   }
   
   /**
   *@return is zero.
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   *@return returns an int based on the objects compared.
   *@param obj is a bunny obj to be tested.
   */
   public int compareTo(Bunny obj) {
      
      if (this.getName().equals(obj.getName())) {
         return 0;
      }
      else if (this.getName().toUpperCase().charAt(0) 
         > obj.getName().toUpperCase().charAt(0)) {
         return 1;
      }
      else {
         return -1;
      }
      
   
   }
}
