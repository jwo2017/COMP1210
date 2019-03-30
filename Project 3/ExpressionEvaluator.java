import java.util.Scanner;
import java.text.DecimalFormat;
 /**
 *Outputs a result based on user input through an equation and shows the number
 *of decimal places.
 *Project 03
 *Jonathan Osborne COMP 1210-008
 *01/31/18
 */
 
public class ExpressionEvaluator {
 
 /**
*Outputs result after going through a function.
*@param  args Command line arguments-not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double result, x, formatted;
      String res;
      DecimalFormat fmt0 = new DecimalFormat("#,##0.0####");
      
      //gathers user input
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //computation
      result = Math.sqrt(Math.abs(10.4 * Math.pow(x, 10) - x + 1)) 
         / (3.5 * Math.pow(x, 4) + 2.5 * Math.pow(x, 2) + 1.5 * x + 0.5);
      
      //print result
      System.out.print("Result: " + result);
      
      //finds number of decimal places
      res = Double.toString(result);
      int dec = res.indexOf(".");
      int len = res.length() - 1;
      //prints number of decimal places
      System.out.print("\n# digits to left of decimal point: " + dec);
      System.out.print("\n# digits to right of decimal point: " + (len - dec));
      //formatted 
      
      
      
      System.out.print("\nFormatted Result: " + fmt0.format(result));
      
   }
}