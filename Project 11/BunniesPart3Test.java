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
public class BunniesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**Tests the main method. 
      @throws FileNotFoundException if file isn't found.
      @throws NegativeValueException if a negative number is passed.**/
   @Test public void mainTest() throws FileNotFoundException, 
      NegativeValueException {
      BunniesPart3 bPart2Obj = new BunniesPart3(); // test constructor 
      Bunny.resetBunnyCount();
      String[] args = {"bunnies1.txt"}; 
      BunniesPart3.main(args); 
      Assert.assertEquals(4, Bunny.getBunnyCount());
   
   }
   
   /**Tests the main method. 
      @throws FileNotFoundException if file isn't found.
      @throws NegativeValueException if a negative number is passed.**/
   @Test public void mainTest2() throws FileNotFoundException, 
      NegativeValueException {
      BunniesPart3 bPart2Obj = new BunniesPart3(); // test constructor 
      Bunny.resetBunnyCount();
      String[] args = {"bunny1.txt"}; 
      BunniesPart3.main(args); 
      Assert.assertEquals(0, Bunny.getBunnyCount());
   
   }
   
   /**Tests the main method. 
      @throws FileNotFoundException if file isn't found.
      @throws NegativeValueException if a negative number is passed.**/
   @Test public void mainTest3() throws FileNotFoundException, 
      NegativeValueException {
      BunniesPart3 bPart2Obj = new BunniesPart3(); // test constructor 
      Bunny.resetBunnyCount();
      String[] args = {};
      BunniesPart3.main(args); 
      Assert.assertEquals(0, Bunny.getBunnyCount());
   
   }
}
