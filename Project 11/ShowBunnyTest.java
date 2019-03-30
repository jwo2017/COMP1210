import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests the ShowBunny class. **/
public class ShowBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getGroomingCost method.
   *@throws NegativeValueException if a negative number is entered. **/
   @Test public void getGroomingCostTest() 
      throws NegativeValueException {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      sb1.setGroomingCost(12);
      Assert.assertEquals(12.0, sb1.getGroomingCost(), 0.01);
   }
   
   /**Tests the estimatedMonthlyCost method.
   *@throws NegativeValueException if a negative number is entered. **/
   @Test public void estimatedMonthlyCostTest() 
      throws NegativeValueException {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals(62.15, sb1.estimatedMonthlyCost(), 0.01);
   }
   
   /** Tests the toString method.
   *@throws NegativeValueException if a negative number is entered. **/
   @Test public void toStringTest() 
      throws NegativeValueException {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals("Bigun (ShowBunny)   Breed: Flemish Giant   "
         + "Weight: 14.6"
         + "\nEstimated Monthly Cost: $62.15"
         + " (includes $22.00 for grooming)",
         sb1.toString());
   }
   
   /**
   *Tests the negative value exception.
   */
   @Test public void exceptionTest() {
      boolean thrown = false;
      
      try {
         ShowBunny pb = new ShowBunny("John", "Wade", 0.1, -0.1);
      } catch (NegativeValueException issue) {
         thrown = true;
      }
      
      Assert.assertTrue(thrown);
   }

}
