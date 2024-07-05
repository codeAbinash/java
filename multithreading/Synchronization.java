package multithreading;

class MyData {
  public void display(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
    }
  }
}

class MyThread1 extends Thread {
  MyData d;

  MyThread1(MyData d) {
    this.d = d;
  }

  public void run() {
    d.display("Hello WorldHello WorldHello WorldHello WorldHello WorldHello WorldHello WorldHello World");
  }
}

class MyThread2 extends Thread {
  MyData d;

  MyThread2(MyData d) {
    this.d = d;
  }

  public void run() {
    d.display("Welcome to JavaWelcome to JavaWelcome to JavaWelcome to JavaWelcome to JavaWelcome to Java");
  }
}

class MyDataSync extends MyData {
  public synchronized void display(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
    }
  }

  public void display2(String str) {
    synchronized (this) {
      for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i));
      }
    }
  }
}

public class Synchronization {

  public static void main(String[] args) {
    MyData d = new MyData();
    MyThread1 t1 = new MyThread1(d);
    MyThread2 t2 = new MyThread2(d);
    t1.start();
    t2.start();

    MyDataSync ds = new MyDataSync();
    MyThread1 t3 = new MyThread1(ds);
    MyThread2 t4 = new MyThread2(ds);
    t3.start();
    t4.start();

  }
}