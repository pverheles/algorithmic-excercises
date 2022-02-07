package algorithmic.exercises.ex_1_1_19;

import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {

  public static long fibonacci(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static long fibonacciImproved(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    long[] numbers = new long[n+1];
    numbers[0] = 0;
    numbers[1] = 1;
    for (int i = 2; i <= n; i++) {
      numbers[i] = numbers[i-1] + numbers[i-2];
    }

    return numbers[n];
  }

  public static void main(String[] args) {
    for (int n = 0; n < 90; n++) {
      StdOut.println(n + " " + fibonacciImproved(n));
    }
  }

}
