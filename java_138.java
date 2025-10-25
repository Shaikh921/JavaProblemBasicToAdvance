// Example 138: Java program to implement LinkedList

class java_138 {
  Node head;

  static class Node {
    int value;
    Node next;
    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    java_138 linkedList = new java_138();

    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    linkedList.head.next = second;
    second.next = third;

    System.out.print("LinkedList: ");
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
}

/*
Output
LinkedList: 1 2 3 
*/
