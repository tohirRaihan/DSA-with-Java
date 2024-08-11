package data_structures.nonlinear_data_structures.tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinaryTreeWithLL {
  Node root;

  public BinaryTreeWithLL() {
    this.root = null;
  }

  public class Node {
    public String value;
    public Node left;
    public Node right;
  }

  // PreOrder Traversal
  void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  // InOrder Traversal
  void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }

  // Post Order Traversal
  void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }

  // Level Order
  void levelOrder() {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node presentNode = queue.remove();
      System.out.print(presentNode.value + " ");
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
  }

  // Search Method
  public void search(String value) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node presentNode = queue.remove();
      if (Objects.equals(presentNode.value, value)) {
        System.out.println("The value-" + value + " is found in Tree");
        return;
      } else {
        if (presentNode.left != null) {
          queue.add(presentNode.left);
        }
        if (presentNode.right != null) {
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println("The value-" + value + " is not found in Tree");
  }

  // Insert Method
  public void insert(String value) {
    Node newNode = new Node();
    newNode.value = value;
    if (root == null) {
      root = newNode;
      System.out.println("Inserted new node at Root");
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node presentNode = queue.remove();
      if (presentNode.left == null) {
        presentNode.left = newNode;
        System.out.println("Successfully Inserted");
        return;
      } else if (presentNode.right == null) {
        presentNode.right = newNode;
        System.out.println("Successfully Inserted");
        return;
      } else {
        queue.add(presentNode.left);
        queue.add(presentNode.right);
      }
    }
  }

  // Get Deepest node
  public Node getDeepestNode() {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    Node presentNode = null;
    while (!queue.isEmpty()) {
      presentNode = queue.remove();
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
    return presentNode;
  }

  // Delete Deepest node
  public void deleteDeepestNode() {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    Node presentNode = null;
    while (!queue.isEmpty()) {
      Node previousNode = presentNode;
      presentNode = queue.remove();
      if (presentNode.left == null) {
        assert previousNode != null;
        previousNode.right = null;
        return;
      } else if (presentNode.right == null) {
        presentNode.left = null;
        return;
      }
      queue.add(presentNode.left);
      queue.add(presentNode.right);
    }
  }

  // Delete Given node
  void deleteNode(String value) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node presentNode = queue.remove();
      if (Objects.equals(presentNode.value, value)) {
        presentNode.value = getDeepestNode().value;
        deleteDeepestNode();
        System.out.println("The node is deleted!");
        return;
      } else {
        if (presentNode.left != null) queue.add(presentNode.left);
        if (presentNode.right != null) queue.add(presentNode.right);
      }
    }
    System.out.println("The node does not exist in this BT");
  }

  // Delete Binary Tree
  void deleteBT() {
    root = null;
    System.out.println("BT has been successfully deleted!");
  }
}
