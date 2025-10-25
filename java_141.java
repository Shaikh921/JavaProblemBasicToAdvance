// Example 141: Java program to implement Queue

public class java_141 {
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  java_141() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    return (front == 0 && rear == SIZE - 1);
  }

  boolean isEmpty() {
    return (front == -1);
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Insert " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty
