package enums;

enum Lang {
  JAVA, PY, C, CPP, JS, RUST
}

enum Dept {
  CS("Computer Science"), IT("Information Technology"), ECE("Electronics and Communication Engineering");

  String name;

  Dept(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class EnumExample {
  public static void main(String[] args) {
    Lang l = Lang.JAVA;
    System.out.println(l);

    Dept d = Dept.CS;
    System.out.println(d);
    System.out.println(d.name);
    System.out.println(d.getName());
  }
}
