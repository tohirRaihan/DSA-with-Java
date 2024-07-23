package data_structures.linear_data_structures.stack;

import data_structures.linear_data_structures.linked_list.SinglyLinkedList;

public class StackWithSLL {
  SinglyLinkedList linkedList;

  public StackWithSLL() {
    linkedList = new SinglyLinkedList();
  }

  // Push method
  public void push(int value) {
    linkedList.insertInLinkedList(value, 0);
    System.out.println("Inserted " + value + " in Stack");
  }

  // isEmpty
  public boolean isEmpty() {
    return linkedList.isEmpty();
  }

  // Pop method
  public int pop() {
    int result = Integer.MIN_VALUE;
    if (isEmpty()) {
      System.out.println("The Stack is Empty!");
    } else {
      result = linkedList.getValue(0);
      linkedList.deletionOfNode(0);
    }
    return result;
  }

  // Peek Method
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Stack is Empty!");
      return Integer.MIN_VALUE;
    } else {
      return linkedList.getValue(0);
    }
  }

  // Delete Method
  public void deleteStack() {
    linkedList.deleteSLL();
    System.out.println("The Stack is deleted");
  }

  public static void main(String[] args) {
    StackWithSLL newStack = new StackWithSLL();
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    newStack.deleteStack();
  }
}
