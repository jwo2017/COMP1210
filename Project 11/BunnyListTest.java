import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*Tests for BunnyList class.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/
public class BunnyListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the read file method.
   Also tests the toString method. 
      @throws FileNotFoundException if file isn't found.
      *@throws NegativeValueException if a negative number is entered.**/
   @Test public void readBunnyFileTest() 
      throws FileNotFoundException, NegativeValueException {
      BunnyList bl = new BunnyList();
      bl.readBunnyFile("bunnies1.txt");
      Assert.assertEquals("\nFloppy (PetBunny)   Breed: "
         + "Holland Lop   Weight: 3.5"
         + "\nEstimated Monthly Cost: $6.48\n"
         + "\nSpot (HouseBunny)   Breed: Really Mixed   Weight: 5.8"
         + "\nEstimated Monthly Cost: $15.01 "
         + "(includes 15.0% for wear and tear)\n"
         + "\nSpeedy (JumpingBunny)   Breed: English   Weight: 6.3"
         + "\nEstimated Monthly Cost: $40.75 (includes "
         + "$25.00 for training)\n"
         + "\nBigun (ShowBunny)   Breed: Flemish Giant   Weight: 14.6"
         + "\nEstimated Monthly Cost: $62.15 (includes "
         + "$22.00 for grooming)\n", bl.toString());
   }
   
   /**
   *getListName test.
   */
   @Test public void getListNameTest() {
      BunnyList bl = new BunnyList();
      bl.setListName("HEY WHAT UP");
      
      Assert.assertEquals("HEY WHAT UP", bl.getListName());
   }
   
   /**
   *getBunnyList test.
   @throws FileNotFoundException if file isn't found.
   */
   @Test public void getBunnyListTest() 
      throws FileNotFoundException {
      BunnyList bl = new BunnyList();
      Bunny[] list = bl.getBunnyList();
      Assert.assertArrayEquals(list, bl.getBunnyList());
   }
   
   /**
   *getExcludedRecords test.
   @throws FileNotFoundException if file isn't found.
   */
   @Test public void getExcludedRecordsListTest() 
      throws FileNotFoundException {
      BunnyList bl = new BunnyList();
      bl.addExcludedRecord("this is not a bunny");
      String[] er = bl.getExcludedRecords();
      Assert.assertEquals("this is not a bunny", er[0]);
   }
   
   /**
   *addBunny test.
   @throws FileNotFoundException if file isn't found.
   *@throws NegativeValueException if a negative number is entered.
   */
   @Test public void addBunnyTest() 
      throws FileNotFoundException, NegativeValueException {
      BunnyList bl = new BunnyList();
      bl.readBunnyFile("bunnies1.txt");
      bl.addBunny(new PetBunny("Cool", "Brown", 12));
      Assert.assertEquals(146.58, bl.totalEstimatedMonthlyCost(), 0.01);
   }
   
   /**
   *listByName test.
   @throws FileNotFoundException if file isn't found.
   *@throws NegativeValueException if a negative number is entered.
   */
   @Test public void listByNameTest() 
      throws FileNotFoundException, NegativeValueException {
      BunnyList bl = new BunnyList();
      bl.readBunnyFile("bunnies1.txt");
   
      Assert.assertEquals("------------------------------"
         + "\nBunnies by Name"
         + "\n------------------------------\n"
         + "\nBigun (ShowBunny)   Breed: Flemish Giant   Weight: 14.6"
         + "\nEstimated Monthly Cost: $62.15 (includes $22.00 for grooming)\n"
         + "\nFloppy (PetBunny)   Breed: Holland Lop   Weight: 3.5"
         + "\nEstimated Monthly Cost: $6.48\n"
         + "\nSpeedy (JumpingBunny)   Breed: English   Weight: 6.3"
         + "\nEstimated Monthly Cost: $40.75 (includes $25.00 for "
         + "training)\n"
         + "\nSpot (HouseBunny)   Breed: Really Mixed   Weight: 5.8"
         + "\nEstimated Monthly Cost: $15.01 (includes 15.0% for wear "
         + "and tear)\n"
            + "\n", bl.listByName());
   }
   
   /**
   *listByCost test.
   @throws FileNotFoundException if file isn't found.
   *@throws NegativeValueException if a negative number is entered.
   */
   @Test public void listByCostTest() 
      throws FileNotFoundException, NegativeValueException {
      BunnyList bl = new BunnyList();
      bl.readBunnyFile("bunnies1.txt");
      
      Assert.assertEquals("------------------------------"
         + "\nBunnies by Cost"
         + "\n------------------------------\n"
         + "\nFloppy (PetBunny)   Breed: Holland Lop   Weight: 3.5"
         + "\nEstimated Monthly Cost: $6.48\n"
         
         
         + "\nSpot (HouseBunny)   Breed: Really Mixed   Weight: 5.8"
         + "\nEstimated Monthly Cost: $15.01 (includes 15.0% for wear "
         + "and tear)\n"
         + "\nSpeedy (JumpingBunny)   Breed: English   Weight: 6.3"
         + "\nEstimated Monthly Cost: $40.75 (includes $25.00 for training)\n"
         + "\nBigun (ShowBunny)   Breed: Flemish Giant   Weight: 14.6"
         + "\nEstimated Monthly Cost: $62.15 (includes $22.00 for grooming)"
         + "\n\n", bl.listByCost());
   }
}
