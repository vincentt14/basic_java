public class RecursiveMethod {
  public static void main(String[] args) {

    System.out.println(factorialLoop(5));
    System.out.println(factorialRecursive(5));

    errorStackOverflow(10000);
  }

  static int factorialLoop(int value) {
    var result = 1;
    for (int i = 1; i <= value; i++) {
      result = result * i;
    }
    return result;
  }

  static int factorialRecursive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * factorialLoop(value - 1);
    }
  }

  static void errorStackOverflow(int value) {
    if (value == 0) {
      System.out.println("Selesai");
    } else {
      System.out.println("Loop - " + value);
      errorStackOverflow(value - 1);
    }
  }
}
