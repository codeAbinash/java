package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyCom implements Comparator<Integer> {
  public int compare(Integer a, Integer b) {
    return b - a;
  }
}

public class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(10);
    pq.add(20);
    pq.add(13);
    pq.add(7);

    System.out.println("Priority queue: " + pq);

    System.out.println("Head of the queue: " + pq.peek());

    pq.poll();
    System.out.println("Priority queue after removing the head: " + pq);
    System.out.println("Head of the queue after removing the head: " + pq.peek());


    PriorityQueue<Integer> pq2 = new PriorityQueue<>(new MyCom());
    pq2.add(10);
    pq2.add(20);
    pq2.add(13);
    pq2.add(7);

    System.out.println("Priority queue with custom comparator: " + pq2);
  }
}
