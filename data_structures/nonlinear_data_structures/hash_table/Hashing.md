### What is Hashing?

Hashing is a method of sorting and indexing data. The idea behind hashing is to allow large amounts of data to be
indexed using keys commonly created by formulas.

### Why Hashing?

- It is time efficient in case of SEARCH Operation (when there is less collision)

| Data Structure | Time Complexity for SEARCH |
|----------------|----------------------------|
| Array          | `O(logN)`                  |
| Linked List    | `O(N)`                     |
| Tree           | `O(logN)`                  |
| Hashing        | `O(1)/O(N)`                |

### Hashing Terminology

- **Hash Function:** It is a function that can be used to map of arbitrary size to data of fixed size
- **Key:** Input data by a user
- **Hash Value:** A value that is returned by Hash Function
- **Hash Table:** It is a data structure which implements an associative array abstract data type, a structure that can
  map keys to values
- **Collision:** A collision occurs when two different keys to a hash function produce the same output

### Hash Function

**Properties of good hash function:**

- It distributes hash values uniformly across hash tables
- It has to use all the input data

### Collision Resolution Techniques:

- Direct Chaining
- Open Addressing
    - Linear Probing
    - Quadratic Probing
    - Double Hashing

**Direct Chaining:** Implements the buckets as linked list. Colliding elements are stored in these lists.

**Open Addressing:** Colliding elements are stored in other vacant buckets. During storage and lookup these are found
through so called probing.
- **Linear Probing:** It places new key into the closest following empty cell

### If Hash Table is Full

what will happen if the hash table is full?

- **Direct Chaining** --> This situation will never arise. Hash Table will never be full, because in this case we are
  adding the references of the linked list to the cells, and then we are adding the new values at the end of the linked
  list.
- **Open Addressing** --> Whenever hash table is full, we are just creating 2X size of current hash table and recall
  hashing for the current keys.