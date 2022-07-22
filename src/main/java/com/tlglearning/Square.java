package com.tlglearning;

/**
 * Defines a single static method, {@link #isPerfectSquare(long)}, which evaluates a specified value
 * to determine whether it is a perfect square.
 */
public final class Square {

  private Square() {
    // NOTE: There is NO need to do anything with this constructor! The method you will implement in
    // this class is static; thus, there is no need to create instances of this class. Making the
    // constructor private prevents this class from being instantiated, and prevents a compiler- 
    // generated default from being generated (and being documented by Javadoc).
  }

  /**
   * Computes and returns a {@code boolean} flag indicating whether the provided {@code input} is a
   * perfect square. A negative {@code input} value will result in {@link IllegalArgumentException}
   * being thrown.
   *
   * @param input Value to be tested.
   * @return Flag indicating whether {@code input} is a perfect square or not.
   * @throws IllegalArgumentException When {@code input} is negative.
   */


  /*
   * NOTE: Max int value in Java = 2147483647
   * NOTE: Max long value in Java = 9,223,372,036,854,775,807
   * NOTE: Max double size in Java = 10^308
   *
   * Math.sqrt() is preferred, it over Math.pow()
   *
   */
  public static boolean isPerfectSquare(long input) throws IllegalArgumentException {
    
    boolean result = false; 
    
    if(input < 0) {
      throw new IllegalArgumentException();
    } else if (input == 0 || input == 1) {
      return true;
    }

    /*
        input = 9

        low = 3
        high = 3
        middle = 3
     */


    long low = 1;
    long high = input;
    long middle = 0;

    while(low <= high) {

      middle = (low + high) / 2;

      if(middle * middle == input) {
        return true;
      } else if (middle * middle < input) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }

    }

    return false;
    // throw new UnsupportedOperationException("Not yet implemented"); // TODO Replace with implementation.
  }

}
