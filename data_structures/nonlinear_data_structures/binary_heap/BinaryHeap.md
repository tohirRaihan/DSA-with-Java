### What is Binary Heap?
A Binary Heap is a Binary Tree with following properties:

- A Binary Heap is either Min Heap or Max Heap. In a Min Heap, the key at root must be minimum among all keys present in
  Binary Heap. The same property must be recursively true for all nodes in Binary Tree.
- It's a complete tree (All levels are completely filled except possibly the last level and the last level has all keys
  as left as possible). This property of Binary Heap makes them suitable to be stored in an array.

### Why we need a Binary Heap?
- Find the minimum or maximum number among a set of numbers in `O(logN)` time. And we also want to make sure that
  inserting additional numbers does not take more than `O(logN)` time.
- In sorted array, finding minimum or maximum is `O(1)` but for inserting it is `O(N)`. It is also true for Linked List
  in sorted manner.

**Practical Use:**
- Prims Algorithm
- Heap Sort
- Priority Queue

### Types of Binary Heap:
- **Min Heap:** the value of each node is less than or equal to the value of both its children.
- **Max Heap:** it is exactly the opposite of min heap that is the value of each node is more than or equal to the value
  of both its children.

### Common Operations of Binary Heap:
- Creation of Binary Heap
- Peek top of Binary Heap
- Extract Min / Extract Max
- Traversal of Binary Heap
- Size of Binary Heap
- Insert value in Binary Heap
- Delete the entire Binary Heap

**Implementation Options:**
- Array Implementation (Best way)
- Reference / Pointer Implementation

### Time and Space Complexity of Binary Heap
| Binary Heap               | Time Complexity | Space Complexity |
|---------------------------|-----------------|------------------|
| Create Binary Heap        | `O(1)`          | `O(N)`           |
| Peek of Heap              | `O(1)`          | `O(1)`           |
| size of Heap              | `O(1)`          | `O(1)`           |
| Traverse Binary Heap      | `O(N)`          | `O(1)`           |
| Insert a node             | `O(logN)`       | `O(logN)`        |
| Extract a node            | `O(logN)`       | `O(logN)`        |
| Delete Entire Binary Heap | `O(1)`          | `O(1)`           |
---
