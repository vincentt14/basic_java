public class Array {
  public static void main(String[] args) {

    String[] stringArray;
    stringArray = new String[3];

    String[] stringArray2 = new String[2];

    stringArray[0] = "Vincent";
    stringArray[1] = "developer";
    stringArray[2] = "full stack";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[2]);
    System.out.println(stringArray[1]);

    int[] arrayInt = new int[] {
        10, 8, 2, 12
    };

    String[] arrayString = {
        "halo", "bang", "makan", "bang"
    };

    arrayString[0] = null;

    System.out.println(arrayInt.length);
    System.out.println(arrayString[0]);

    String[][] members = {
        { "vincent", "makan", "sapi" },
        { "rucci", "minum" },
        { "oatmeal" }
    };

    System.out.println(members[0][2]);
    System.out.println(members[1][0]);
    System.out.println(members[2][0]);

  }
}
