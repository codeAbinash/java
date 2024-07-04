package basic;
public class RegularExpression {
  public static void main(String[] args) {
    String regex = "[0-9]+";
    System.out.println("1234".matches(regex)); // true
    System.out.println("1234a".matches(regex)); // false

    regex = "[a-zA-Z]+";
    System.out.println("abcd".matches(regex)); // true
    System.out.println("abcd123".matches(regex)); // false

  }
}
