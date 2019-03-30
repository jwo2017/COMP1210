import org.junit.Assert;
import org.junit.Test;


/**
*Tests the conical frustum class.
*/

public class ConicalFrustumTest {


   /** A test that always fails. **/
   @Test public void getLabelTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals("", "Small", con.getLabel());
   }
   /**
*Tests the set label class.
*/

   @Test public void setLabelTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertTrue("", con.setLabel("Large"));
      Assert.assertFalse("", con.setLabel(null)); 
   }
   
   /**
*Tests the getRadius1 class.
*/

   @Test public void getRadius1Test() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals("", 3, con.getRadius1(), 0.000001);
   }
      
      /**
*Tests the getRadius2 class.
*/

   @Test public void getRadius2Test() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 4, con.getRadius2(), 0.000001);
   }
      
      /**
*Tests the getHeight class.
*/

   @Test public void getHeightTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 5, con.getHeight(), 0.000001);
   }
   
   /**
*tests the setRadius1 class.
*/

   @Test public void setRadius1Test() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertTrue(" ", con.setRadius1(1));
      Assert.assertFalse(" ", con.setRadius1(0));
   }

/**
*Tests the setRadius2 class.
*/

   @Test public void setRadius2Test() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertTrue(" ", con.setRadius2(38));
      Assert.assertFalse(" ", con.setRadius2(0));
   }
   
   /**
*Tests the setHeight class.
*/

   @Test public void setHeightTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertTrue(" ", con.setHeight(42));
      Assert.assertFalse(" ", con.setHeight(0));
   }
   
   /**
*Tests the volume class.
*/

   @Test public void volumeTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 193.7315469713706, con.volume(), 0.0000001);
   }

/**
*Tests the slantHeight class.
*/

   @Test public void slantHeightTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 5.0990195135927845, 
         con.slantHeight(), 0.0000001);
   }
   
   /**
*tests the lateralSurfaceArea class.
*/

   @Test public void lateralSurfaceAreaTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 112.13329571089865, 
         con.lateralSurfaceArea(), 0.0000001);
   }
   
   /**
*Tests the totalSurfaceArea class.
*/

   @Test public void totalSurfaceAreaTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 190.67311205064345, 
         con.totalSurfaceArea(), 0.0000001);
   }
   
   /**
*Tests the toString class.
*/

   @Test public void toStringTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", "ConicalFrustum \"Small\" with radius1 = 3.0, "
         + "radius2 = 4.0, and height = 5.0 has:"
         + "\n\tvolume = 193.732 cubic units"
         + "\n\tslant height = 5.099 units"
         + "\n\tlateral surface area = 112.133 units"
         + "\n\ttotal surface area = 190.673 square units", con.toString());
   }
   
   /**
*Tests the getCount class.
*/

   @Test public void getCountTest() {
      ConicalFrustum.resetCount();
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 1, ConicalFrustum.getCount());
   }
   
   /**
*Tests the resetCount class.
*/

   @Test public void resetCountTest() {
      ConicalFrustum.resetCount();
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      ConicalFrustum.resetCount();
      Assert.assertEquals(" ", 0, ConicalFrustum.getCount());
   }
   
   /**
*Tests the equals class.
*/

   @Test public void equalsTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      ConicalFrustum test = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertTrue(" ", test.equals(con));
      ConicalFrustum conLabel = new ConicalFrustum("Large", 3, 4, 5);
      Assert.assertFalse(" ", test.equals(conLabel));
      ConicalFrustum conRadius1 = new ConicalFrustum("Small", 4, 4, 5);
      Assert.assertFalse(test.equals(conRadius1));
      ConicalFrustum conRadius2 = new ConicalFrustum("Small", 3, 5, 5);
      Assert.assertFalse(test.equals(conRadius2));
      ConicalFrustum conHeight = new ConicalFrustum("Small", 3, 4, 6);
      Assert.assertFalse(test.equals(conHeight));
      Object conObj = new Object();
      Assert.assertFalse(test.equals(conObj));
   }

/**
*tests the hashCode class.
*/

   @Test public void hashCodeTest() {
      ConicalFrustum con = new ConicalFrustum("Small", 3, 4, 5);
      Assert.assertEquals(" ", 0, con.hashCode());
   }
}
