package multithreading;

class Thread1 extends Thread {
  public void run() {
    int i = 1;
    while (true) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Thread 1: " + i++);
    }
  }
}

class Thread2 extends Thread {
  public void run() {
    Thread cThread = Thread.currentThread();
    System.out.println("Thread 2: " + cThread.getName());
    System.out.println("Thread 2: " + cThread.getPriority());
    System.out.println("Thread 2: " + cThread.isDaemon());
    int i = 1;
    while (true) {
      System.out.println("Thread 2: " + i++);
    }
  }
}

// Implementing Runnable interface
class Thread3 implements Runnable {
  public void run() {
    Thread thread = Thread.currentThread();
    thread.setPriority(Thread.MAX_PRIORITY);
    int i = 1;
    while (true) {
      System.out.println("Thread 3: " + i++);
    }
  }
}

class Thread4 implements Runnable {
  public void run() {
    int i = 1;
    while (true) {
      System.out.println("Thread 4: " + i++);
    }
  }
}

public class SimpleMultithreading {
  public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    t1.start();

    t2.setPriority(Thread.MIN_PRIORITY);
    t2.setName("Thread 2");
    t2.setDaemon(true);
    t2.start();

    Thread t3 = new Thread(new Thread3());
    t3.start();

    Thread t4 = new Thread(new Thread4());
    t4.setDaemon(true);
    t4.start();
    try {
      // To prevent the main thread from exiting
      // We have to use join() method
      t4.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
