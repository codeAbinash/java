package io;

import java.io.InputStream;
import java.io.OutputStream;

class Producer extends Thread {
  OutputStream os;

  public Producer(OutputStream os) {
    this.os = os;
  }

  public void run() {
    int count = 1;
    while (true) {
      try {
        os.write(count);
        os.flush();
        System.out.println("Produced: " + count);
        count++;
        Thread.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class Consumer extends Thread {
  InputStream is;

  public Consumer(InputStream is) {
    this.is = is;
  }

  public void run() {
    while (true) {
      try {
        int ch = is.read();
        System.out.println("Consumed: " + ch);
        Thread.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class PipedDemo {
  public static void main(String[] args) throws Exception {
    java.io.PipedInputStream pis = new java.io.PipedInputStream();
    java.io.PipedOutputStream pos = new java.io.PipedOutputStream();
    pos.connect(pis);
    Producer p = new Producer(pos);
    Consumer c = new Consumer(pis);
    p.start();
    c.start();
  }
}
