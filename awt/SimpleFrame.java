import java.awt.*;

class MyFrame extends Frame {
  MyFrame(String title) {
    super(title);
    setLayout(new FlowLayout());
    setSize(1000, 700);
    setVisible(true);
    Button b2 = new Button("Save");
    Label l2 = new Label("Name: ");
    TextField t2 = new TextField("Type here", 20);
    add(l2);
    add(t2);
    add(b2);

    setSize(1000, 700);
    setVisible(true);
  }
}

public class SimpleFrame {

  public static void main(String[] args) {
    Frame f = new Frame("Simple Frame");
    f.setLayout(new FlowLayout());
    Button b = new Button("Save");
    Label l = new Label("Name: ");
    TextField t = new TextField("Type here", 20);
    f.add(l);
    f.add(t);
    f.add(b);

    f.setSize(1000, 700);
    f.setVisible(true);

    new MyFrame("My Frame 1");

  }

}
