package data_structures.linear_data_structures.linked_list;

public class SinglyLinkedList {
  static class Node {
    private int value;
    private Node next;
  }

  private Node head;
  private Node tail;
  private int size;

  public SinglyLinkedList createSLL(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return this;
  }

  // Insert Method SinglyLinkedList
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createSLL(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
    } else if (location >= size) {
      node.next = null;
      tail.next = node;
      tail = node;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;
      node.next = nextNode;
    }
    size++;
  }

  // get value from SinglyLinkedList
  public int getValue(int location) {
    if (head == null) {
      System.out.println("List is empty");
      return Integer.MIN_VALUE;
    } else if (location >= size) {
      return tail.value;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index <= location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      return tempNode.value;
    }
  }

  // SinglyLinkedList Traversal
  public void traverseSinglyLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist!");
    } else {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }

  // Search for a node
  boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found the node at location: " + i + "\n");
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found! ");
    return false;
  }

  // Deleting a node from SinglyLinkedList
  public void deletionOfNode(int location) {
    if (head == null) {
      System.out.println("The SLL does not exist");
    } else if (location == 0) {
      head = head.next;
      size--;
      if (size == 0) {
        tail = null;
      }
    } else if (location >= size) {
      Node tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.next;
      }
      if (tempNode == head) {
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = null;
      tail = tempNode;
      size--;
    } else {
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  // Delete Entire SinglyLinkedList
  public void deleteSLL() {
    head = null;
    tail = null;
    System.out.println("The SLL deleted successfully");
  }

  // isEmpty
  public boolean isEmpty() {
    return this.head == null;
  }

  // getSize
  public int getSize() {
    return this.size;
  }

  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList().createSLL(5);
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 3);
    sLL.insertInLinkedList(8, 4);
    sLL.insertInLinkedList(9, 0);
    sLL.traverseSinglyLinkedList();
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();
  }
}
