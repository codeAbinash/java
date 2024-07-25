import java.awt.*;
import java.awt.event.*;

public class RadioCheck extends Frame implements ItemListener {
  Label l1;
  Checkbox c1, c2, c3;
  Label selected;

  CheckboxGroup cbg;

  RadioCheck() {
    super("Radio Check");
    l1 = new Label("Select Languages: ");
    selected = new Label("Selected:                                      ");
    c1 = new Checkbox("Java");
    c2 = new Checkbox("Python");
    c3 = new Checkbox("C++");
    setLayout(new FlowLayout());

    add(l1);
    add(c1);
    add(c2);
    add(c3);
    // Add a line break
    add(selected);

    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);

    Checkbox cb1 = new Checkbox("Java ", false, cbg);
    Checkbox cb2 = new Checkbox("Python ", false, cbg);
    Checkbox cb3 = new Checkbox("C++ ", false, cbg);
    add(cb1);
    add(cb2);
    add(cb3);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    String str = "";
    if (c1.getState()) {
      str += "Java ";
    }
    if (c2.getState()) {
      str += "Python ";
    }
    if (c3.getState()) {
      str += "C++ ";
    }
    selected.setText("Selected: " + str);
  }

  public static void main(String[] args) {
    RadioCheck rc = new RadioCheck();
    rc.setSize(1000, 700);
    rc.setVisible(true);
  }
}
