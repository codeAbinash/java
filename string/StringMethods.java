package string;
public class StringMethods {
  public static void main(String[] args) {
    String name = "  Abinash Karmakar  ";
    System.out.println(name.length());
    System.out.println(name.charAt(0));

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    System.out.println(name.trim());

    System.out.println(name.substring(2));
    System.out.println(name.substring(2, 8));

    System.out.println(name.replace('A', 'B'));

    System.out.println(name.startsWith("  Ab"));
    System.out.println(name.endsWith("kar"));

    System.out.println(name.charAt(0));
    System.out.println(name.indexOf('a'));
    System.out.println(name.lastIndexOf('a'));

    System.out.println(name.contains("Karmakar"));

    System.out.println(name.equals("  Abinash Karmakar  "));
    System.out.println(name.equalsIgnoreCase("  abinash karmakar  "));

    System.out.println(name.compareTo("  Abinash Karmakar  "));
    System.out.println(name.compareToIgnoreCase("  abinash karmakar  "));

    System.out.println(name.concat("p"));

    System.out.println(name.toCharArray());

    System.out.println(name.isEmpty());

  }
}
