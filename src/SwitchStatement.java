public class SwitchStatement {
  public static void main(String[] args) {
    var nilai = "C";

    switch (nilai) {
      case "A":
        System.out.println("Wow anda lulus dengan baik");
        break;
      case "B":
      case "C":
        System.out.println("Nilai anda cukup baik");
        break;
      case "D":
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin anda salah jurusan");
        break;
    }

    // lambda, khusus JAVA 14
    var poin = "D";
    String ucapan;

    switch (poin) {
      case "A" -> ucapan = "Mantap poin tertinggi";
      case "B", "C" -> ucapan = "Okelah, okelah";
      case "D" -> {
        System.out.println("panik gak>");
        ucapan = "ga lulus";
      }
      default -> ucapan = "bengong";
    }
    System.out.println(ucapan);

    // Yield, khusus JAVA 14
    int nomor = 3;

    String kata = switch (nomor) {
      case 1:
        yield "satu";
      case 2, 3:
        yield "dua, tiga";
      case 4:
        yield "empat";
      default:
        yield "seterusnya";
    };
    System.out.println(kata);
  }
}
