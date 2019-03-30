import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests BunniesPart1. **/
public class BunniesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the main method. **/
   @Test public void mainTest() {
      BunniesPart1 vp1 = new BunniesPart1(); 
      Bunny.resetBunnyCount();
      BunniesPart1.main(null); 
      Assert.assertEquals("Bunny.BunnyCount should be 4. ",
         4, Bunny.getBunnyCount());
   }
}
