import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame {
  Label l1, l2, l3;
  TextField t1;

  TextFieldDemo() {
    super("TextField Demo");
    setLayout(new FlowLayout());

    l1 = new Label("No text entered                 ");
    l2 = new Label("Enter key is not pressed yet");
    t1 = new TextField("Type here", 20);
    add(l1);
    add(t1);
    add(l2);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });

    t1.addActionListener(e -> {
      l2.setText("Enter key pressed");
    });

    t1.addTextListener(e -> {
      l2.setText("Enter key is not pressed yet");
      if (t1.getText().equals("")) {
        l1.setText("No text entered");
        return;
      }
      l1.setText(t1.getText());
      t1.setEchoChar('*');
    });

  }

  public static void main(String[] args) {
    TextFieldDemo frame = new TextFieldDemo();
    frame.setSize(1000, 700);
    frame.setVisible(true);
  }
}
