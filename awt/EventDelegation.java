import java.awt.*;

public class EventDelegation extends Frame {
  EventDelegation(String title) {
    super(title);
    setLayout(new FlowLayout());
    Button b = new Button("Save");
    Label l = new Label("Name: ");
    TextField t = new TextField("Type here", 20);
    add(l);
    add(t);
    add(b);
  }

  public static void main(String[] args) {
    EventDelegation f = new EventDelegation("My Frame 1");
    f.setSize(1000, 700);
    f.setVisible(true);

  }
}
