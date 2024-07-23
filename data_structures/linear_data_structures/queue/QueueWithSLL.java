package data_structures.linear_data_structures.queue;

import data_structures.linear_data_structures.linked_list.SinglyLinkedList;

public class QueueWithSLL {
  SinglyLinkedList list;

  public QueueWithSLL() {
    list = new SinglyLinkedList();
    System.out.println("The Queue is successfully created");
  }

  // isEmpty
  public boolean isEmpty() {
    return list.isEmpty();
  }

  // enQueue
  public void enQueue(int value) {
    list.insertInLinkedList(value, list.getSize());
    System.out.println("Successfully inserted " + value + " in the queue");
  }

  // deQueue
  public int deQueue() {
    int value = Integer.MIN_VALUE;
    if (isEmpty()) {
      System.out.println("The Queue is is Empty");
    } else {
      value = list.getValue(0);
      list.deletionOfNode(0);
    }
    return value;
  }

  // peek
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Queue is Empty");
      return Integer.MIN_VALUE;
    } else {
      return list.getValue(0);
    }
  }

  // delete
  public void deleteQueue() {
    list.deleteSLL();
    System.out.println("The Queue is successfully deleted");
  }
}
