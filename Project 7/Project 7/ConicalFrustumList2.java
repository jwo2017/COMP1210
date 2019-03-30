import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
 *Creates data based on radii and height.
 *Project 6
 *Jonathan Osborne COMP 1210-008
 *02/28/18
 */

public class ConicalFrustumList2 {
   private String listName;
   private ConicalFrustum[] list = new ConicalFrustum[100];
   private int numberOfConicalFrustums = 0;
   
   /**
   *@param listNameIn accepts a strig of the name of the list.
   *@param listIn accepts an ArrayList that has values in it.
   *@param numberOfConicalFrustumsIn is the number of frustums that 
   * will be set to a variable.
   */
   public ConicalFrustumList2(String listNameIn, 
      ConicalFrustum[] listIn, int numberOfConicalFrustumsIn) {
      listName = listNameIn;
      list = listIn;
      numberOfConicalFrustums = numberOfConicalFrustumsIn;
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
      if (numberOfConicalFrustums < 1) {
         return 0;
      } 
      else {
         return numberOfConicalFrustums;
      }
   }
   
   
    /**
   *@return returns a double that is the total surface area.
   */
   
   
   public double totalSurfaceArea() {
      if (list.length > 0) {
         double output = 0;
         int i = 0;
         while (i < numberOfConicalFrustums) {
            output += list[i].totalSurfaceArea();
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
      if (list.length > 0) {
         double output = 0;
         int i = 0;
         while (i < numberOfConicalFrustums) {
            output += list[i].volume();
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
      if (numberOfConicalFrustums > 0) {
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
      if (numberOfConicalFrustums > 0) {
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
      while (i < numberOfConicalFrustums) {
      
         output += "\n" + list[i].toString() + "\n";
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
   
   /**
   *@return list returns the list      
   */
   public ConicalFrustum[] getList() {
      return list;
   }
   
   /**
   *@param fileNameIn takes a file and is read in
   *@throws FileNotFoundException throws a file not
      found exception if invalid file input
   *@return returns a ConicalFrustumList
   */
   public ConicalFrustumList2 readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      int numConicalFrustum = 0;
      ConicalFrustum[] myCList = new ConicalFrustum[100];
      String nameOfList = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double r1 = Double.parseDouble(scanFile.nextLine());
         double r2 = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         
         ConicalFrustum cone = new ConicalFrustum(label, r1, r2, height);
         myCList[numConicalFrustum] = cone;
         numConicalFrustum++;
      }
      
      scanFile.close();
      // vvvvvv return
      ConicalFrustumList2 cL = 
         new ConicalFrustumList2(nameOfList, myCList, numConicalFrustum);
      return cL;
   }
   
   /**
   *@param label takes a string that represents the label of a conical frustum.
   *@param radius1 takes a double that represents the input for a radius.
   *@param radius2 takes a double that represents input for a second radius.
   *@param height takes a double that represents the input 
   *for the height of the frustum.
   */
   public void addConicalFrustum(String label, double radius1,
      double radius2, double height) {
      ConicalFrustum con = new ConicalFrustum(label, radius1, radius2, height);
      list[numberOfConicalFrustums] = con;
      numberOfConicalFrustums++;
   }
   
   /**
   *@param labelIn takes a string that represents the input 
   *label of the frustum that is sought after.
   *@return returns a conical frustum with the label or null.
   */
   public ConicalFrustum findConicalFrustum(String labelIn) {
      labelIn = labelIn.toUpperCase();
      
      //int index = -1;
      ConicalFrustum res = null;
      
      for (int i = 0; i < numberOfConicalFrustums; i++) {
         String iLabel = list[i].getLabel();
         iLabel = iLabel.toUpperCase();
         if (iLabel.equals(labelIn)) {
            res = list[i];
            break;
         }
      }
      
      
      //return list.get(index);
      
      if (numberOfConicalFrustums == 0) {
         res = null;
      }
      
      return res;
   }
   
   
   /**
   *@param labelIn takes a label that represents the frustum to be deleted.
   *@return returns the frustum to be deleted.
   */
   
   public ConicalFrustum deleteConicalFrustum(String labelIn) {
      ConicalFrustum doomedFrustum = null;
      labelIn = labelIn.toUpperCase();
      
      
      for (int i = 0; i < numberOfConicalFrustums; i++) {
         String tempLabel = list[i].getLabel().toUpperCase();
         if (tempLabel.equals(labelIn)) {
            doomedFrustum = list[i];
            for (int j = i; j < numberOfConicalFrustums - 1; j++) {
               list[j] = list[j + 1];
            }
         
            list[numberOfConicalFrustums - 1] = null;
            numberOfConicalFrustums--;
            return doomedFrustum;
         }
         
      
      }
      
      return null;
      
   }
   
   /**
   *@param label represents a label of a frustum to be edited.
   *@param radius1 represents the new radius of the frustum.
   *@param radius2 represents the other new radius.
   *@param height represents the new height of the frustum.
   *@return returns a boolean of true or false.
   */
   
   public boolean editConicalFrustum(String label, double radius1, 
      double radius2, double height) {
      //Conical in question
      ConicalFrustum questConical = findConicalFrustum(label);
      
      if (questConical != null) {
         questConical.setRadius1(radius1);
         questConical.setRadius2(radius2);
         questConical.setHeight(height);
         return true;
      }
      else {
         return false;
      }
   }
}

