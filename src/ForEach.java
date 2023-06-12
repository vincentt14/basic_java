public class ForEach {
  public static void main(String[] args) {

    String[] names = {
        "vincent", "rucci", "martin",
        "leo", "thea", "darren"
    };

    for (var i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    System.out.println("--- For Each ---");

    for (var name : names) {
      System.out.println(name);
    }
  }
}
