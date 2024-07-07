package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
  public static void main(String[] args) throws Exception {
    Properties props = new Properties();
    props.setProperty("name", "Abinash Karmakar");
    props.setProperty("email", "codeAbinash@gmail.com");
    props.setProperty("phone", "9876543210");
    props.setProperty("address", "India");

    props.store(new FileOutputStream("./collections/props.properties"), "Personal Information");
    props.storeToXML(new FileOutputStream("./collections/props.xml"), "Personal Information");

  
    Properties p = new Properties();
    p.loadFromXML(new FileInputStream("./collections/props.xml"));
    System.out.println(p);
    System.out.println(p.getProperty("namew"));

  }
}
