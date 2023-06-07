public class TipeDataBukanPrimitive {
  public static void main(String[] args) {

    Integer iniInteger = 100;
    Long iniLong = 10_000L;
    Byte iniByte = null;
    iniByte = 99;
    Character iniCharacter = 'a';

    System.out.println(iniByte);

    int iniInt = 100;
    Integer iniInt2 = iniInt;

    System.out.println(iniInt2);

    Integer iniObject = 30;

    short iniShort = iniObject.shortValue();
    long iniLong2 = iniObject.longValue();
    float iniFloat = iniObject.floatValue();
  }
}
