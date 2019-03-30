import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests the JumpingBunny class. **/
public class JumpingBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getTrainingCost method. **/
   @Test public void getTrainingCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      jb1.setTrainingCost(12);
      Assert.assertEquals(12.0, jb1.getTrainingCost(), 0.01);
   }
   
   /**Tests the monthly cost method. **/
   @Test public void estimatedMonthlyCostTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals(40.75, jb1.estimatedMonthlyCost(), 0.01);
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals("Speedy (JumpingBunny)   Breed: English   "
         + "Weight: 6.3"
         + "\nEstimated Monthly Cost: $40.75"
         + " (includes $25.00 for training)",
         jb1.toString());
   
   }
   
   
}
