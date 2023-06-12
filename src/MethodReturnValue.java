public class MethodReturnValue {
  public static void main(String[] args) {
    var result = sum(100, 100);
    System.out.println(result);

    System.out.println(sum(400, 100));

    System.out.println(hitung(300, "+", 50));
  }

  static int sum(int angka1, int angka2) {
    var total = angka1 + angka2;
    return total;
  }

  static int hitung(int value1, String operasi, int value2) {
    switch (operasi) {
      case "+":
        return value1 + value2;
      case "-":
        return value1 - value2;
      default:
        return 0;
    }
  }
}
