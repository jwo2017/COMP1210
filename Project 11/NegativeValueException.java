
/**
*Exception for negative values.
*COMP 1210 - 008
*Jonathan Osborne
*Project 11
*4/10/18
*/

public class NegativeValueException extends Exception {

/**
*Constructor for when thrown.
*/
   public NegativeValueException() {
      super("Numeric values must be nonnegative");
   }
}