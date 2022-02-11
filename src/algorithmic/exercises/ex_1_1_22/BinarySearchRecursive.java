package algorithmic.exercises.ex_1_1_22;

import edu.princeton.cs.algs4.StdOut;

public class BinarySearchRecursive {

  public static void main(String[] args) {
    StdOut.println(indexOf(new int[] {1, 20, 22, 24, 40, 42, 45, 48, 50, 53, 60, 72, 88}, 43));
  }

  public  static int indexOf(int[] a, int key) {
    return indexOf(a, key, 0, a.length - 1, 0);
  }

  public static int indexOf(int[] a, int key, int lo, int hi, int depth) {
    StdOut.println("lo=" + lo + ", hi=" + hi + ", depth=" + depth);

    if (lo > hi) {
      return -1;
    }

    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      return indexOf(a, key, lo, mid - 1, ++depth);
    } else if (key > a[mid]) {
      return indexOf(a, key, mid + 1, hi, ++depth);
    } else {
      return mid;
    }
  }
}
