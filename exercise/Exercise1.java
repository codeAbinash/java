// Find if the email id is on gmail
// Find the username and domain from the email id
public class Exercise1 {
  public static void main(String[] args) {
    String email = "codeAbinash@gmail.com";
    System.out.println(email.endsWith("gmail.com"));

    int index = email.indexOf('@');
    String username = email.substring(0, index);
    String domain = email.substring(index + 1);

    System.out.println("Username: " + username);
    System.out.println("Domain: " + domain);

  }
}
