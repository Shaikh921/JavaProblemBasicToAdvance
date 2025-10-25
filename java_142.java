// Example 142: Implement Queue using Queue interface

import java.util.LinkedList;
import java.util.Queue;

class java_142 {
  public static void main(String[] args) {
    Queue<Integer> numbers = new LinkedList<>();

    numbers.offer(1);
    numbers.offer(2);
    numbers.offer(3);
    System.out.println("Queue: " + numbers);

    int removedNumber = numbers.poll();
    System.out.println("Removed Element: " + removedNumber);

    System.out.println("Queue after deletion: " + numbers);
  }
}

/*
Output
Queue: [1, 2, 3]
Removed Element: 1
Queue after deletion: [2, 3]
*/
