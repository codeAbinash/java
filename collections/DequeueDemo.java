package collections;

import java.util.ArrayDeque;

public class DequeueDemo {
  public static void main(String[] args) {
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    deque.add(1);
    deque.add(2);
    deque.add(3);
    deque.add(4);


    System.out.println(deque);

    System.out.println(deque.peek());
    System.out.println(deque.peekFirst());
    System.out.println(deque.peekLast());
    System.out.println(deque.poll());
    System.out.println(deque.pollFirst());
    System.out.println(deque.pollLast());
    System.out.println(deque);

    deque.push(1);
    deque.push(2);
    deque.push(3);

    System.out.println(deque);

    System.out.println(deque.pop());
    System.out.println(deque.pop());
    System.out.println(deque.pop());

    System.out.println(deque);

    deque.offer(1);
    deque.offer(2);
    deque.offer(3);

    System.out.println(deque);

    System.out.println(deque.offerFirst(4));
    System.out.println(deque.offerLast(5));

    System.out.println(deque);

    System.out.println(deque.remove());
    System.out.println(deque.removeFirst());
    System.out.println(deque.removeLast());

    System.out.println(deque);

    System.out.println(deque.removeFirstOccurrence(1));
    System.out.println(deque.removeLastOccurrence(2));

    System.out.println(deque);

  }
}
