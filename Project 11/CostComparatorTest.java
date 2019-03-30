import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Tests for costcomparator class.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/
public class CostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the compare method. 
   *@throws NegativeValueException if a negative number is entered.**/
   @Test public void compareTest() 
      throws NegativeValueException {
   
      //if condition
      PetBunny pb1 = new PetBunny("Flop", "Holland Loop", 12);
      PetBunny pb2 = new PetBunny("Flop", "Holland Loop", 12);
      CostComparator comp = new CostComparator();
      
      Assert.assertTrue(comp.compare(pb1, pb2) == 0);
      
      //else if condition
      pb2.setWeight(13);
      
      Assert.assertTrue(comp.compare(pb1, pb2) < 0);
      
      //else condition
      pb2.setWeight(11);
      Assert.assertTrue(comp.compare(pb1, pb2) > 0);
   }
}
