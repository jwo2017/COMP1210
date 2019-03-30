import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Tests house bunny class.**/
public class HouseBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getWearAndTear method. **/
   @Test public void getWearAndTearTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      hb1.setWearAndTear(13);
      Assert.assertEquals(13, hb1.getWearAndTear(), .001);
   }
   
   /**Tests the estimatedMonthlyCost method.**/
   @Test public void estimatedMonthlyCostTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals(15.01, hb1.estimatedMonthlyCost(), .01);
   }
   
   /**Tests the toString method.**/
   @Test public void toStringTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("Spot (HouseBunny)   Breed: Really Mixed   "
         + "Weight: 5.8"
         + "\nEstimated Monthly Cost: $15.01"
         + " (includes 15.0% for wear and tear)",
         hb1.toString());
   }
}
