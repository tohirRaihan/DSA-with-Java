### What is a Tree?
A tree is a nonlinear data structure with hierarchical relationships between its elements without having any cycle, it
is basically reversed from a real life tree.

**Tree Properties:**
- Represent hierarchical data
- Each node has two components: data and a link to its sub category
- Base category and sub categories under it

### Why Tree?
- Quicker and easier access to the data
- Store hierarchical data, like folder structure, organization structure, XML/HTML data
- There are many different types of data structures which performs better in various situations
    - Binary Search Tree, AVL Tree, Red Black Tree, Trie

### Tree Terminology
- **Root:** top node without parent
- **Edge:** a link between parent and child
- **Leaf:** a node which does not have children
- **Sibling:** children of same parent
- **Ancestor:** parent, grandparent, great grandparent of a node
- **Depth of a node:** a length of the path from root to node
- **Height of node:** a length of the path from the node to the deepest node
- **Depth of tree:** depth of root node
- **Height of tree:** height of root node

### Binary Tree
- Binary trees are the datastructures in which each node has at most two children, often referred to as the left and
  right children
- Binary tree is a family of data structure (BST, Heap tree, AVL, Red black tree, Syntax tree)
- **It can create with:**
    - Linked List
    - Array

### Types of Binary Tree:
- **Full Binary Tree:** Each node of binary tree has zero or two children but not one
- **Perfect Binary Tree:** All non leaf node have two children, and they are at the same depth
- **Complete Binary Tree:** All levels are completely filled except the last level
- **Balanced Binary Tree:** Each leaf is not more than a certain distance from the root node than any other leaf

### Binary Tree Common Operations:
- Creation of Tree
- Insertion of a node
- Deletion of a node
- Search for a value
- Traverse all nodes
- Deletion of tree

### Binary Tree Traversal:
- Depth first search
    - Preorder traversal
    - Inorder traversal
    - Postorder traversal
- Breadth first search
    - Level order traversal

### Time and Space Complexity of Binary Tree using Array
| Binary Tree               | Time Complexity | Space Complexity |
|---------------------------|-----------------|------------------|
| Create Binary Tree        | `O(1)`          | `O(n)`           |
| Insert a node             | `O(1)`          | `O(1)`           |
| Delete a node             | `O(n)`          | `O(1)`           |
| Search for a node         | `O(n)`          | `O(1)`           |
| Traverse Binary Tree      | `O(n)`          | `O(1)/O(n)`      |
| Delete Entire Binary Tree | `O(1)`          | `O(1)`           |

### Time and Space Complexity of Binary Tree using Linked List
| Binary Tree               | Time Complexity | Space Complexity |
|---------------------------|-----------------|------------------|
| Create Binary Tree        | `O(1)`          | `O(1)`           |
| Insert a node             | `O(n)`          | `O(n)`           |
| Delete a node             | `O(n)`          | `O(n)`           |
| Search for a node         | `O(n)`          | `O(n)`           |
| Traverse Binary Tree      | `O(n)`          | `O(n)`           |
| Delete Entire Binary Tree | `O(1)`          | `O(1)`           |
---

### What is a Binary Search Tree?
- In the left subtree the value of a node is less than or equal to its parent node's value
- In the right subtree the value of a node is greater than its parent node's value

### Why Binary Search Tree?
- It performs faster than Binary Tree when inserting and deleting nodes