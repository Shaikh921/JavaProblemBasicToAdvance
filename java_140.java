// Example 140: Implement Stack using Stack class

import java.util.Stack;

class java_140 {
  public static void main(String[] args) {
    Stack<String> animals = new Stack<>();

    animals.push("Dog");
    animals.push("Horse");
    animals.push("Cat");
    System.out.println("Stack: " + animals);

    animals.pop();
    System.out.println("Stack after pop: " + animals);
  }
}

/*
Output
Stack: [Dog, Horse, Cat]
Stack after pop: [Dog, Horse]
*/
