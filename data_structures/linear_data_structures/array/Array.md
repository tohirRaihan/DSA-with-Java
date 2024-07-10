### What is an Array?
In computer science, an array is a data structure consisting of a collection of elements, each identified by al least
one array index or key. An array is stored such that the position of each element can be computed from its index by a
mathematical formula.

### Properties of an Array:
- Array can store of data of specified type
- Elements of an array are located in a contiguous (next to each other)
- Each element of an array has a unique index
- The size of the array is predefined and can not be modified

### Types of Arrays:
- One Dimensional
- Multi Dimensional
    - Two Dimensional
    - Three Additional
    - Four Dimensional
    - ....
    - N Dimensional

### Time and Space Complexity of 1D Arrays
| Operation                     | Time Complexity | Space Complexity |
|-------------------------------|-----------------|------------------|
| Creating an empty array       | `O(1)`          | `O(n)`           |
| Inserting a value in an array | `O(1)`          | `O(1)`           |
| Traversing a given array      | `O(n)`          | `O(1)`           |
| Accessing a given cell        | `O(1)`          | `O(1)`           |
| Searching a given value       | `O(n)`          | `O(1)`           |
| Deleting a given value        | `O(1)`          | `O(1)`           |

### Time and Space Complexity of 2D Arrays
| Operation                     | Time Complexity | Space Complexity |
|-------------------------------|-----------------|------------------|
| Creating an empty array       | `O(1)`          | `O(mn)`          |
| Inserting a value in an array | `O(1)`          | `O(1)`           |
| Traversing a given array      | `O(mn)`         | `O(1)`           |
| Accessing a given cell        | `O(1)`          | `O(1)`           |
| Searching a given value       | `O(mn)`         | `O(1)`           |
| Deleting a given value        | `O(1)`          | `O(1)`           |

### When to use Arrays
- To store multiple variables of same data type
- Random access

### When to avoid Arrays
- If we need to store different data type elements
- When dynamic size is required
- For frequent Insertions and Deletions
