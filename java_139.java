// Example 139: Java Program to implement Stack

class java_139 {
  private int arr[];
  private int top;
  private int capacity;

  java_139(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack Overflow");
      System.exit(1);
    }
    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    return arr[top--];
  }

  public Boolean isEmpty() {
    return top == -1;
  }

  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + ", ");
    }
  }

  public static void main(String[] args) {
    java_139 stack = new java_139(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.print("Stack: ");
    stack.printStack();

    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();
  }
}

/*
Output
Inserting 1
Inserting 2
Inserting 3
Stack: 1, 2, 3, 
After popping out
1, 2, 
*/
