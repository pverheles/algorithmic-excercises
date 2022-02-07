package algorithmic.exercises.ex_1_1_20;

import edu.princeton.cs.algs4.StdOut;

public class LogNFactorial {

  public static double logNFactorial(int n) {
    return Math.log(factorial(n));
  }

  private static long factorial(int n) {
    if (n < 1) {
      throw new IllegalArgumentException("n must be positive number");
    }

    if (n == 1) {
      return 1;
    }

    return Math.multiplyExact(n, factorial(n - 1));
  }

  public static void main(String[] args) {
    int n = 20;
    StdOut.println("Result: " + logNFactorial(n));
  }
}
