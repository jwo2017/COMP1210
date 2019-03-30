import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
*Exception for negative values.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/


public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void negativeValueExceptionTest() { 
      boolean thrown = false;
      try {
         HouseBunny hb = new HouseBunny("Spot", "Mixed", -0.08, -.07); }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   
   }
}