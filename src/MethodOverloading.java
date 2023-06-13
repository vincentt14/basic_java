public class MethodOverloading {
  public static void main(String[] args) {
    sayHello();
    sayHello("bambang");
    sayHello("adi", 12);
  }

  static void sayHello() {
    System.out.println("Hello");
  }

  static void sayHello(String name) {
    System.out.println("Hello " + name);
  }

  static void sayHello(String name, int value) {
    System.out.println("Hello " + name + " hari ini tanggal " + value);
  }
}
