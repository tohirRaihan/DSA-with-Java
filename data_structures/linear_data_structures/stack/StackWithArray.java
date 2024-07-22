package data_structures.linear_data_structures.stack;

public class StackWithArray {
  int[] arr;
  int topOfStack;

  public StackWithArray(int size) {
    this.arr = new int[size];
    this.topOfStack = -1;
    System.out.println("The Stack is created with size of: " + size);
  }

  // isEmpty
  public boolean isEmpty() {
    return topOfStack == -1;
  }

  // isFull
  public boolean isFull() {
    return topOfStack == arr.length - 1;
  }

  // Push
  public void push(int value) {
    if (isFull()) {
      System.out.println("The Stack is full!");
    } else {
      arr[topOfStack + 1] = value;
      topOfStack++;
      System.out.println("The value is successfully inserted");
    }
  }

  // pop
  public int pop() {
    if (isEmpty()) {
      System.out.println("The stack is empty");
      return -1;
    } else {
      int topStack = arr[topOfStack];
      topOfStack--;
      return topStack;
    }
  }

  // Peek method
  public int peek() {
    if (isEmpty()) {
      System.out.println("The stack is empty!");
      return -1;
    } else {
      return arr[topOfStack];
    }
  }

  //  Delete method
  public void deleteStack() {
    arr = null;
    System.out.println("The Stack is successfully deleted");
  }

  public static void main(String[] args) {
    StackWithArray newStack = new StackWithArray(4);
    boolean result = newStack.isFull();
    System.out.println(result);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    newStack.push(4);
    newStack.push(5);
  }
}
