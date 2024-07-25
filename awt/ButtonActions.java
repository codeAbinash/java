import java.awt.*;

public class ButtonActions extends Frame {
  int count = 0;
  Button b1, b2;
  Label l1;

  ButtonActions() {
    super("Button Actions");
    l1 = new Label("Count: 0");
    b1 = new Button("Increment");
    b2 = new Button("Decrement");
    setLayout(new FlowLayout());
    add(l1);
    add(b1);
    add(b2);
    b1.addActionListener(e -> {
      count++;
      l1.setText("Count: " + count);
    });
    b2.addActionListener(e -> {
      count--;
      l1.setText("Count: " + count);
    });
  }

  public static void main(String[] args) {
    ButtonActions ba = new ButtonActions();
    ba.setSize(300, 300);
    ba.setVisible(true);
  }
}
