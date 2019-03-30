import java.text.DecimalFormat;
 
 /**
 *Creates data based on radii and height.
 *Project 6
 *Jonathan Osborne COMP 1210-008
 *02/28/18
 */
 
public class ConicalFrustum {
   //instance variables
   private String label = "";
   private double radius1 = 0;
   private double radius2 = 0;
   private double height = 0;
   private static int count = 0;
   
   //constructor
   /**
   *Constructs a conic object.
   *@param labelIn accepts a label.
   *@param radius1In accepts a top radius.
   *@param radius2In accepts a bottom radius.
   *@param heightIn accepts a height.
   */
   public ConicalFrustum(String labelIn, double radius1In, 
      double radius2In, double heightIn) {
      setLabel(labelIn);
      setRadius1(radius1In);
      setRadius2(radius2In);
      setHeight(heightIn);
      count++;
   }
   
   
   //methods
   
   /**
   *@return returns label
   */
   
   public String getLabel() {
      return label;
   }
   /**
   *@return returns true or false
   *@param labelIn is the entered label being set.
   */
   
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   *@return returns radius1.
   */
   
   public double getRadius1() {
      return radius1;
   }
   
   /**
   *@return returns true or false.
   *@param radius1In is for radius1In to be set.
   */
   public boolean setRadius1(double radius1In) {
      if (radius1In > 0) {
         radius1 = radius1In;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   *@return returns radius2.
   */
    
   public double getRadius2() {
      return radius2;
   }
   /**
   *@return returns true or false.
   *@param radius2In for radius2 to be set.
   */
   
   public boolean setRadius2(double radius2In) {
      if (radius2In > 0) {
         radius2 = radius2In;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   *@return returns height.
   */
   
   public double getHeight() {
      return height;
   }
   
   /**
   *@return returns true or false.
   *@param heightIn is for height to be set.
   */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   *@return returns the volume.
   */
   public double volume() {
      return (((Math.PI * height) / 3.0) * (Math.pow(radius1, 2)
         + Math.pow(radius2, 2) + (radius1 * radius2)));
   }
   
   /**
   *@return returns the slant height.
   */
   public double slantHeight() {
      return (Math.sqrt(Math.pow((radius1 - radius2), 2) 
         + Math.pow(height, 2)));
   }
   
   /**
   *@return returns lat surface area.
   */
   public double lateralSurfaceArea() {
      return (Math.PI * (radius1 + radius2)
         * slantHeight());
   }
   
   /**
   *@return returns total surface area.
   */
   public double totalSurfaceArea() {
      return (Math.PI * (Math.pow(radius1, 2) 
         + Math.pow(radius2, 2) + (radius1 + radius2) * slantHeight()));
   }
   
   /**
   *@return returns the output as a string.
   */
   
   public String toString() {
   
      DecimalFormat dmc = new DecimalFormat("#,##0.0##");
      String output = "ConicalFrustum \"" + label 
         + "\" with radius1 = " + dmc.format(radius1) + ", radius2 = " 
         + dmc.format(radius2) + ", and height = " + dmc.format(height) 
         + " has:"
         + "\n\tvolume = " + dmc.format(volume()) + " cubic units"
         + "\n\tslant height = " + dmc.format(slantHeight()) + " units" 
         + "\n\tlateral surface area = " 
         + dmc.format(lateralSurfaceArea()) + " units"
         + "\n\ttotal surface area = " + dmc.format(totalSurfaceArea())
         + " square units";
         
      return output;
   }
   
   /**
   *@return returns the count variable.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   *Resets the count class variable to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   *@param obj is an object to check if it 
   *equals the conical frustum.
   *@return returns a boolean based on whether 
   *the above is true or false.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof ConicalFrustum)) { 
         return false;
      } 
      else {
         ConicalFrustum d = (ConicalFrustum) obj; 
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius1 - d.getRadius1()) < .000001 
            && Math.abs(radius2 - d.getRadius2()) < .000001 
            && Math.abs(height - d.getHeight()) < .000001);
      }
   }
      
      /**
      *@return returns zero. -- required due to equals method above.
      */
   public int hashCode() {
      return 0;
   }
}