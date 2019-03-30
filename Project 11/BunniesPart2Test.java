import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*BunniesPart2 class test.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/
public class BunniesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**Tests the main method. 
      @throws FileNotFoundException if file isn't found.**/
   @Test public void mainTest() throws FileNotFoundException {
      BunniesPart2 bPart2Obj = new BunniesPart2(); // test constructor 
      Bunny.resetBunnyCount();
      String[] args = {"bunnies1.txt"}; 
      BunniesPart2.main(args); 
      Assert.assertEquals(4, Bunny.getBunnyCount());
   
   }
}
