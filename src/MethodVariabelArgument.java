public class MethodVariabelArgument {
  public static void main(String[] args) {

    int[] values = { 80, 50, 70, 90, 100 };
    sayCongrats("vincent", values);

    sayCongrats("budi", 10, 20, 50, 80);
  }

  static void sayCongrats(String name, int... values) {

    var total = 0;
    for (var value : values) {
      total += value;
    }

    var finalValues = total / values.length;
    if (finalValues >= 75) {
      System.out.println("Selamat " + name + " anda lulus");
    } else {
      System.out.println("Maaf " + name + " anda belum lulus");
    }
  }
}
