import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Tests house bunny class.**/
public class HouseBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() 
   {
   }


   /** Tests the getWearAndTear method.
   *@throws NegativeValueException if a negative number is entered. **/
   @Test public void getWearAndTearTest() 
      throws NegativeValueException {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      hb1.setWearAndTear(13);
      Assert.assertEquals(13, hb1.getWearAndTear(), .001);
   }
   
   /**Tests the estimatedMonthlyCost method.
   *@throws NegativeValueException if a negative number is entered.**/
   @Test public void estimatedMonthlyCostTest() 
      throws NegativeValueException {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals(15.01, hb1.estimatedMonthlyCost(), .01);
   }
   
   /**Tests the toString method.
   *@throws NegativeValueException if a negative number is entered.**/
   @Test public void toStringTest() 
      throws NegativeValueException {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("Spot (HouseBunny)   Breed: Really Mixed   "
         + "Weight: 5.8"
         + "\nEstimated Monthly Cost: $15.01"
         + " (includes 15.0% for wear and tear)",
         hb1.toString());
   }
   
   /**
   *Tests the negative value exception.
   */
   @Test public void exceptionTest() {
      boolean thrown = false;
      
      try {
         HouseBunny pb = new HouseBunny("John", "Wade", 0.1, -0.1);
      } catch (NegativeValueException issue) {
         thrown = true;
      }
      
      Assert.assertTrue(thrown);
   }
}
