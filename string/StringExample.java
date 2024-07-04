public class StringExample {
  public static void main(String[] args) {
    String name = "John"; // String Literal Will be stored in String Pool
    String name2 = new String("John"); // String Object Will be stored in Heap

    char[] nameArray = { 'J', 'o', 'h', 'n' };
    String name3 = new String(nameArray); // String Object Will be stored in Heap

    System.out.println(name);
    System.out.println(name2);
    System.out.println(name3);

    byte[] byteArray = { 65, 66, 67, 68, 69, 70 };
    String byteString = new String(byteArray);
    System.out.println(byteString);

    String n1 = "John";
    String n2 = "John";

    System.out.println(n1 == n2); // true

    String n3 = new String("John");
    String n4 = new String("John");

    System.out.println(n3 == n4); // false

  }
}
