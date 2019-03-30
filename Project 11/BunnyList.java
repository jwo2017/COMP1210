import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;

/**
*Creates a list of bunny objects.
*COMP 1210 - 008
*Jonathan Osborne
*Project 10
*4/10/18
*/

public class BunnyList {
   private String listName;
   private Bunny[] bunnyList;
   private String[] excludedRecords;
   
   /**
   *Constructor for bunnylist.
   */
   public BunnyList() {
      listName = "not yet assigned";
      bunnyList = new Bunny[0];
      excludedRecords = new String[0];
   }
   
   /**
   *@param fileNameIn is the file name.
   *@throws FileNotFoundException if file isn't found.
   *@throws NegativeValueException if a negative number is entered.
   *@throws NoSuchElementException if an item is missing from 
      constructor.
   */
   public void readBunnyFile(String fileNameIn) 
      throws FileNotFoundException, NegativeValueException,
      NoSuchElementException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      BunnyList tempList = new BunnyList();
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String input = scanFile.nextLine();
         Scanner thisLine = new Scanner(input);
         thisLine = thisLine.useDelimiter(",");
         
         char bunnyClass = thisLine.next().toUpperCase().charAt(0);
         String bunnyName = thisLine.next().trim();
         String bunnyBreed = thisLine.next().trim();
         try {
                        
            double bunnyWeight = Double.parseDouble(thisLine.next().trim());
         
         
            switch (bunnyClass) {
               case 'P':
                  PetBunny pb = new PetBunny(bunnyName, bunnyBreed, 
                     bunnyWeight);
                  tempList.addBunny(pb);
                  break;
               case 'H':
                  double wnt = Double.parseDouble(thisLine.next().trim());
                  HouseBunny hb = new HouseBunny(bunnyName, bunnyBreed,
                     bunnyWeight, wnt);
                  tempList.addBunny(hb);
                  break;
               case 'J':
                  double training = Double.parseDouble(thisLine.next().trim());
                  JumpingBunny jb = new JumpingBunny(bunnyName, bunnyBreed,
                     bunnyWeight, training);
                  tempList.addBunny(jb);
                  break;
               case 'S':
                  double grooming = Double.parseDouble(thisLine.next().trim());
                  ShowBunny sb = new ShowBunny(bunnyName, bunnyBreed,
                     bunnyWeight, grooming);
                  tempList.addBunny(sb);
                  break;
               default:
                  tempList.addExcludedRecord("Invalid Bunny Category in:\n" 
                     + input);
                  break;
            }
         }
         catch (NumberFormatException issue) {
            tempList.addExcludedRecord(issue + " in:\n" + input);
         }
         catch (NegativeValueException issue) {
            tempList.addExcludedRecord(issue + " in:\n" + input);
         }
         catch (NoSuchElementException issue) {
            tempList.addExcludedRecord(issue + " in:\n" + input);
         }
      }
      scanFile.close();
      bunnyList = tempList.getBunnyList();
      excludedRecords = tempList.getExcludedRecords();
   }
   
   /**
   *@return returns the list name.
   */
   public String getListName() {
      return listName;
   }
   
   /**
   *@param listNameIn is the list name to be set.
   
   */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   
   /**
   *@return returns a bunny list.
   */
   public Bunny[] getBunnyList() {
      return bunnyList;
   }
   
   /**
   *@return returns array of strings.
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   *@param bunnyIn is the bunny object to be added.
   *
   */
   public void addBunny(Bunny bunnyIn) {
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   }
   
   /**
   *@param recordIn represents record to be added.
   */
   public void addExcludedRecord(String recordIn) {
      excludedRecords = Arrays.copyOf(excludedRecords, 
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = recordIn;
   }
   
   /**
   *@return returns the string.
   */
   public String toString() {
      String output = "";
      for (int i = 0; i < bunnyList.length; i++) {
         output += "\n" + bunnyList[i] + "\n";
      }
      return output;
   }
   
   /**
   *@return returns a double.
   */
   public double totalEstimatedMonthlyCost() {
      double total = 0;
      for (int i = 0; i < bunnyList.length; i++) {
         total += bunnyList[i].estimatedMonthlyCost();
      }
      return total;
   }
   
   /**
   *@return returns summary info.
   */
   public String summary() {
      DecimalFormat d = new DecimalFormat("0.00");
      return "------------------------------"
         + "\nSummary for " + listName
         + "\n------------------------------\n"
         + "Number of Bunnies: " + bunnyList.length
         + "\nTotal Estimated Monthly Cost: $"
         + d.format(this.totalEstimatedMonthlyCost())
         + "\n\n\n";
   }
   
   /**
   *@return returns the sorted list.
   */
   public String listByName() {
      Arrays.sort(bunnyList);
      String output = "------------------------------\n"
         + "Bunnies by Name\n"
         + "------------------------------\n";
      /*for (int i = bunnyList.length - 1; i >= 0; i--) {
         output += "\n" + bunnyList[i] + "\n";
      }*/
         
      output += this.toString();
      return output + "\n";
   }
   
   /**
   *@return returns the sorted list.
   */
   public String listByCost() {
      Arrays.sort(bunnyList, new CostComparator());
      String output = "------------------------------"
         + "\nBunnies by Cost\n"
         + "------------------------------\n";
      for (int i = 0; i < bunnyList.length; i++) {
         output += "\n" + bunnyList[i] + "\n";
      }
      return output + "\n";
   }
   
   /**
   *@return prints the list.
   */
   public String excludedRecordsList() {
      String output = "------------------------------"
         + "\nExcluded Records\n"
         + "------------------------------\n";
         
      for (int i = 0; i < excludedRecords.length; i++) {
         output += "\n" + excludedRecords[i] + "\n";
      }
      
      return output + "\n";
   }
}

