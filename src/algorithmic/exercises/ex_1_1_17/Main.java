package algorithmic.exercises.ex_1_1_17;

public class Main {

  public static void main(String[] args) {
    System.out.println(exR2(6));
  }

  public static String exR2(int n) {
    if (n <= 0) {
      return "";
    }
    String s = exR2(n - 3) + n + exR2(n - 2) + n;
    return s;
  }

  // 311361142246

}
