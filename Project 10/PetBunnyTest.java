import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Tests the PetBunny Class. **/
public class PetBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**Tests the estimated monthly cost method. **/
   @Test public void estimatedMonthlyCostTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals(6.475, pb1.estimatedMonthlyCost(), 0.0001);
   }
   
   /**Tests the toString method.**/
   @Test public void toStringTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("Floppy (PetBunny)   Breed: Holland Lop   "
         + "Weight: 3.5"
         + "\nEstimated Monthly Cost: $6.48", pb1.toString());
   }
   
   /**Tests the getName method.**/
   @Test public void getNameTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setName("Willie");
      Assert.assertEquals("Willie", pb1.getName());
   }
   
   /**Tests the getBreed method.**/
   @Test public void getBreedTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setBreed("Cottontail");
      Assert.assertEquals("Cottontail", pb1.getBreed());
   }
   
   /**Tests the getWeight method.**/
   @Test public void getWeightTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setWeight(23.0);
      Assert.assertEquals(23.0, pb1.getWeight(), 0.0001);
   }
   
   /**Tests the getBunnyCount method.**/
   @Test public void getBunnyCountTest() {
      Bunny.resetBunnyCount();
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals(1, Bunny.getBunnyCount());
   }
   
   /**Tests the compareTo method.**/
   @Test public void compareToTest() {
   
      //if condition
      PetBunny pb1 = new PetBunny("Flop", "Holland Loop", 12);
      PetBunny pb2 = new PetBunny("Flop", "Holland Loop", 12);
      
      
      Assert.assertTrue(pb1.compareTo(pb2) == 0);
      
      //else if condition
      pb2.setName("Peter");
      
      Assert.assertTrue(pb1.compareTo(pb2) < 0);
      
      //else condition
      pb2.setName("Cottontail");
      Assert.assertTrue(pb1.compareTo(pb2) > 0);
   }
   
   /**Tests the equals method.**/
   @Test public void equalsTest() {
      PetBunny pb = new PetBunny("Small", "Brown", 4);
      PetBunny test = new PetBunny("Small", "Brown", 4);
      Assert.assertTrue(test.equals(pb));
      PetBunny pbName = new PetBunny("Large", "Brown", 4);
      Assert.assertFalse(test.equals(pbName));
      PetBunny pbBreed = new PetBunny("Small", "Green", 4);
      Assert.assertFalse(test.equals(pbBreed));
      PetBunny pbWeight = new PetBunny("Small", "Brown", 5);
      Assert.assertFalse(test.equals(pbWeight));
      Object pbObj = new Object();
      Assert.assertFalse(test.equals(pbObj));
   }
   /** Tests the hashCode method. **/
   @Test public void hashCodeTest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals(0, pb1.hashCode());
   }
}
