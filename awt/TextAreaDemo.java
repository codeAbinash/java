import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame {
  TextArea ta;
  TextField tf;
  Label l1;
  Button b1;

  TextAreaDemo() {
    super("TextArea Demo");
    setLayout(new FlowLayout());
    ta = new TextArea("Type here", 10, 50);
    l1 = new Label("                                                                     ");
    tf = new TextField(20);
    b1 = new Button("Append");

    add(ta);
    add(l1);
    add(tf);
    add(b1);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });

    b1.addActionListener(e -> {
      ta.insert(tf.getText(), ta.getCaretPosition());
    });
  }

  public static void main(String[] args) {
    TextAreaDemo frame = new TextAreaDemo();
    frame.setSize(1000, 700);
    frame.setVisible(true);

  }
}
