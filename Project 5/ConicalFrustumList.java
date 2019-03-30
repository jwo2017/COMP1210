import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *Creates data based on radii and height.
 *Project 05
 *Jonathan Osborne COMP 1210-008
 *02/21/18
 */

public class ConicalFrustumList {
   private String listName;
   private ArrayList<ConicalFrustum> list 
      = new ArrayList<ConicalFrustum>();
   
   /**
   *@param listNameIn accepts a strig of the name of the list.
   *@param listIn accepts an ArrayList that has values in it.
   */
   public ConicalFrustumList(String listNameIn, 
      ArrayList<ConicalFrustum> listIn) {
      listName = listNameIn;
      list = listIn;
   }
   
   /**
   *@return listName returns the name of the list as a string.
   */
   public String getName() {
      return listName;
   }
    /**
   *@return returns an int that is the number of items in array.
   */
   public int numberOfConicalFrustums() {
      if (list.size() < 1) {
         return 0;
      } 
      else {
         return list.size();
      }
   }
   
    /**
   *@return returns a double that is the total surface area.
   */
   public double totalSurfaceArea() {
      if (list.size() > 0) {
         double output = 0;
         int i = 0;
         while (i < list.size()) {
            output += list.get(i).totalSurfaceArea();
            i++;
         }
         return output;
      }
      else {
         return 0;
      }
   
   }
    /**
   *@return returns double of total volume.
   */
   public double totalVolume() {
      if (list.size() > 0) {
         double output = 0;
         int i = 0;
         while (i < list.size()) {
            output += list.get(i).volume();
            i++;
         }
         return output;
      }
      else {
         return 0;
      }
   }
    /**
   *@return returns double of avg surface area.
   */
   public double averageSurfaceArea() {
      if (list.size() > 0) {
         double output = (totalSurfaceArea() / numberOfConicalFrustums());
         return output;
      }
      else {
         return 0.0;
      }
   }
    /**
   *@return returns the average volume.
   */
   public double averageVolume() {
      if (list.size() > 0) {
         double output = (totalVolume() / numberOfConicalFrustums());
         return output;
      }
      else {
         return 0.0;
      }
   }
    /**
   *@return returns the output as a string.
   */
   public String toString() {
      int i = 0;
      String output = listName + "\n";
      while (i < numberOfConicalFrustums()) {
      
         output += "\n" + list.get(i).toString() + "\n";
         i++;
      }
      output += "\n";
      return output;     
   }
   /**
   *@return returns a string that is a summary of the info obtained.
   */
   public String summaryInfo() {
   
      DecimalFormat dmc = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName
         + " -----\nNumber of ConicalFrustum Objects: "
         + numberOfConicalFrustums()
         + "\nTotal Surface Area: " + dmc.format(totalSurfaceArea())
         + "\nTotal Volume: " + dmc.format(totalVolume())
         + "\nAverage Surface Area: " + dmc.format(averageSurfaceArea())
         + "\nAverage Volume: " + dmc.format(averageVolume());
      return output;
   }
}