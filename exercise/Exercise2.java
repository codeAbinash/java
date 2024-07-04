// Find if a Number is Binary or Not
// Write a program to find if a given number hexadecimal or not. 
// Find if a string is in date format or not dd/mm/yyyy

public class Exercise2 {

  public static void main(String[] args) {
    String number = "101010101";
    System.out.println(number.matches("[01]+"));

    String hex = "0x1234";
    System.out.println(hex.matches("0[xX][0-9a-fA-F]+"));

    String date = "12/12/2020";
    System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

  }
}