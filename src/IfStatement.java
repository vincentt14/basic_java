public class IfStatement {
  public static void main(String[] args) {

    var nilai = 70;
    var absen = 30;

    if (nilai >= 80 && absen >= 80) {
      System.out.println("Nilai anda A");
    } else if (nilai >= 70 && absen >= 70) {
      System.out.println("Nilai anda B");
    } else if (nilai >= 60 && absen >= 60) {
      System.out.println("Nilai anda C");
    } else if (nilai >= 50 && absen >= 50) {
      System.out.println("Nilai anda D");
    } else {
      System.out.println("Nilai anda E");
    }
  }
}
