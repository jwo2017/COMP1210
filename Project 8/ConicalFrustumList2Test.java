import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import java.io.File;
import java.io.FileNotFoundException;
/**
 *Test methods for the ConicalFrustumList2 class.
 *Project 8
 *Jonathan Osborne COMP 1210-008
 *03/30/18
 */

public class ConicalFrustumList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**Tests the getName method.
   *@throws FileNotFoundException if file isn't found.
   **/
   @Test public void getNameTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals("Conical Frustum Test List", myList.getName());
   }
   
   /**Tests the numberOfConicalFrustums method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void numberOfConicalFrustumsTest() 
      throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals(3, myList.numberOfConicalFrustums());
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(0, myList2.numberOfConicalFrustums());
   }
     
     /**Tests the totalSurfaceArea method.
     *@throws FileNotFoundException if file isn't found.
**/
   @Test public void totalSurfaceAreaTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals(407734.0264357, myList.totalSurfaceArea(), .0001);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(0, myList2.totalSurfaceArea(), 0.000);
   }
   
   /**Tests the totalVolume method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void totalVolumeTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals(1.8023600645082E7, myList.totalVolume(), .0001);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(0, myList2.totalVolume(), 0.0001);
   }
   
   /**Tests the averageSurfaceArea method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void averageSurfaceAreaTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals(135911.34214, myList.averageSurfaceArea(), .0001);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(0, myList2.averageSurfaceArea(), 0.0001);
   }
   
   /**Tests the averageVolume method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void averageVolumeTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals(6007866.88169194, myList.averageVolume(), .0001);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list2, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(0, myList2.averageVolume(), 0.0001);
   }
   
   /**Tests the toString method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void toStringTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals("Conical Frustum Test List\n\nConicalFrustum "
         + "\"Small\" with radius1 = 0.5, "
         + "radius2 = 0.75, and height = 0.25 has:"
         + "\n\tvolume = 0.311 cubic units"
         + "\n\tslant height = 0.354 units"
         + "\n\tlateral surface area = 1.388 units"
         + "\n\ttotal surface area = 3.941 square units"
         
         + "\n\nConicalFrustum \"Medium\" with radius1 = 5.1, "
         + "radius2 = 10.2, and height = 15.9 has:"
         + "\n\tvolume = 3,031.546 cubic units"
         + "\n\tslant height = 16.698 units"
         + "\n\tlateral surface area = 802.608 units"
         + "\n\ttotal surface area = 1,211.172 square units"
         
         + "\n\nConicalFrustum \"Large\" with radius1 = 98.32, "
         + "radius2 = 199.0, and height = 250.0 has:"
         + "\n\tvolume = 18,020,568.788 cubic units"
         + "\n\tslant height = 269.512 units"
         + "\n\tlateral surface area = 251,739.485 units"
         + "\n\ttotal surface area = 406,518.914 square units\n\n", 
            myList.toString());
   }
   
   /**Tests the summaryInfo method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void summaryInfoTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertEquals("----- Summary for Conical Frustum Test List -----"
         + "\nNumber of ConicalFrustum Objects: 3"
         + "\nTotal Surface Area: 407,734.026"
         + "\nTotal Volume: 18,023,600.645"
         + "\nAverage Surface Area: 135,911.342"
         + "\nAverage Volume: 6,007,866.882", myList.summaryInfo());
   }
   
   /**Tests the getList method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void getListTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      list[0] = new ConicalFrustum("Small", 3, 4, 5);
      list[1] = new ConicalFrustum("Medium", 10, 15, 20);
      list[2] = new ConicalFrustum("Large", 25, 30, 45);
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      //myList = myList.readFile("conical_frustum_data_1.txt");
      
      Assert.assertArrayEquals(list, myList.getList());
   
   }
   
   /**Tests the addConicalFrustum method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void addConicalFrustumTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      list[0] = new ConicalFrustum("Small", 3, 4, 5);
      list[1] = new ConicalFrustum("Medium", 10, 15, 20);
      list[2] = new ConicalFrustum("Large", 25, 30, 45);
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      myList.addConicalFrustum("NEW", 12, 21, 32);
      ConicalFrustum[] newList = myList.getList();
      Assert.assertEquals(newList[3], myList.findConicalFrustum("new"));
   }
   
   /**
   *Tests the findConicalFrustum method.
   *@throws FileNotFoundException if file input isn't found.
   */
   @Test public void findConicalFrustumTest() throws FileNotFoundException {
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list2, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(null, myList2.findConicalFrustum("INDEX"));
   }
   
   /**Tests the deleteConicalFrustum method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void deleteConicalFrustumTest() throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      ConicalFrustum[] newList = myList.getList();
      Assert.assertEquals(null, myList.deleteConicalFrustum("yes"));
      Assert.assertEquals(newList[0], myList.deleteConicalFrustum("Small"));

      myList.deleteConicalFrustum("Medium");
      Assert.assertEquals(null, myList.findConicalFrustum("Medium"));
      myList.deleteConicalFrustum("Small");
      Assert.assertEquals(null, myList.findConicalFrustum("Small"));
   }
   
   /**Tests the editConicalFrustum method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void editConicalFrustumTest() 
      throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      Assert.assertFalse(myList.editConicalFrustum("DNE", 21, 2, 3));
      Assert.assertTrue(myList.editConicalFrustum("Small", 0.5, 0.75, 0.25));
   }
   
   /**Tests the findConicalFrustumWithLeastHeight method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void findConicalFrustumWithLeastHeightTest() 
      throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      ConicalFrustum gh = myList.findConicalFrustumWithLeastHeight();
      Assert.assertEquals(myList.getList()[0], gh);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(null, myList2.findConicalFrustumWithLeastHeight());
   }

   /**Tests the findConicalFrustumWithGreatestHeight method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void findConicalFrustumWithGreatestHeightTest() 
      throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      ConicalFrustum gh = myList.findConicalFrustumWithGreatestHeight();
      Assert.assertEquals(myList.getList()[2], gh);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(null, myList2.findConicalFrustumWithGreatestHeight());
      ConicalFrustum[] list3 = new ConicalFrustum[100];
      list3[0] = new ConicalFrustum("Zero", 0, 0, 0);
      ConicalFrustumList2 myList3 = new ConicalFrustumList2("", list3, 1);
      Assert.assertEquals(list3[0], 
         myList3.findConicalFrustumWithGreatestHeight());
   }
   
   /**Tests the findConicalFrustumWithLeastVolume method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void findConicalFrustumWithLeastVolumeTest() 
      throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      ConicalFrustum gh = myList.findConicalFrustumWithLeastVolume();
      Assert.assertEquals(myList.getList()[0], gh);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(null, myList2.findConicalFrustumWithLeastVolume());
   }

   /**Tests the findConicalFrustumWithGreatestVolume method.
   *@throws FileNotFoundException if file isn't found.
**/
   @Test public void findConicalFrustumWithGreatestVolumeTest() 
      throws FileNotFoundException {
      ConicalFrustum[] list = new ConicalFrustum[100];
      ConicalFrustumList2 myList = new ConicalFrustumList2("", list, 0);
      myList = myList.readFile("conical_frustum_data_1.txt");
      ConicalFrustum gh = myList.findConicalFrustumWithGreatestVolume();
      Assert.assertEquals(myList.getList()[2], gh);
      ConicalFrustum[] list2 = new ConicalFrustum[100];
      ConicalFrustumList2 myList2 = new ConicalFrustumList2("", list, 0);
      myList2 = myList2.readFile("conical_frustum_data_0.txt");
      Assert.assertEquals(null, myList2.findConicalFrustumWithGreatestVolume());
      ConicalFrustum[] list3 = new ConicalFrustum[100];
      list3[0] = new ConicalFrustum("Zero", 0, 0, 0);
      ConicalFrustumList2 myList3 = new ConicalFrustumList2("", list3, 1);
      Assert.assertEquals(list3[0], 
         myList3.findConicalFrustumWithGreatestVolume());
      
   }

   
   
   
}
