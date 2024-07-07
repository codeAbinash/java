package collections;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenizerDemo {
  public static void main(String[] args) {
    String data = "address=India;email=codeAbinash@gmail.com;name=Abinash Karmakar;phone=9876543210";
    StringTokenizer st = new StringTokenizer(data, ";=");
    while (st.hasMoreTokens()) {
      String key = st.nextToken();
      String value = st.nextToken();
      System.out.println(key + " : " + value);
    }

    data = "10, 20, 30, 40, 50";
    st = new StringTokenizer(data, ", ");
    ArrayList<Integer> list = new ArrayList<>();
    while (st.hasMoreTokens()) {
      list.add(Integer.parseInt(st.nextToken()));
    }
    System.out.println("List: " + list);

  }
}
