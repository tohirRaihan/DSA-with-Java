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
- **Load Factor** The number of items stored in the table divided by the size of the table

### Properties of a good Hash Function:
- Minimize collision
- Be easy and quick to compute
- It distributes hash values evenly across hash tables
- Use all the information provided in the key
- Have a high load factor for a given set of keys

### Collision Resolution Techniques:
The process of finding an alternate location is called collision resolution.
``` mermaid
    flowchart TD
        RS[Resolution Techniques] --> DC[Direct Chaining] & OA[Open Addressing]
        OA --> LP[Linear Probing]
        OA --> QP[Quadratic Probing]
        OA --> DH[Double Hashing]
```

**Direct Chaining:** Implements the buckets as linked list. Colliding elements are stored in these lists.

**Open Addressing:** Colliding elements are stored in other vacant buckets. During storage and lookup these are found
through so called probing.
- **Linear Probing:** It places new key into the closest following empty cell.
- **Quadratic Probing:** Adding arbitrary quadratic polynomial to the index until an empty cell is found.
- **Double Hashing:** Interval between probes is computed by another hash function.

### If Hash Table is Full
what will happen if the hash table is full?

- **Direct Chaining** --> This situation will never arise. Hash Table will never be full, because in this case we are
  adding the references of the linked list to the cells, and then we are adding the new values at the end of the linked
  list.
- **Open Addressing** --> Whenever hash table is full, we are just creating 2X size of current hash table and recall
  hashing for the current keys.

### Pros and Cons of Collision Resolution Technique
**Direct Chaining**
- Hash Table never gets full.
- Huge Linked List causes performance leaks (Time complexity for search operation becomes `O(N)`)

**Open Addressing**
- Easy Implementation
- When Hash Table is full, creation of new Hash Table affects performance (Time complexity for search operation
  becomes `O(N)`)

### Which Collision Resolution Technique to choose:
- If the input size is known we always use "Open Addressing"
- If we perform deletion operation frequently we use "Direct Chaining"

### Pros and Cons of Hashing
- On an average, Insertion/Deletion/Search operations take `O(1)` time.
- When Hash function is not good enough, Insertion/Deletion/Search operations take `O(N)` time.

| Operations | Array  | Linked List | Tree      | Hashing     |
|------------|--------|-------------|-----------|-------------|
| Insertion  | `O(N)` | `O(N)`      | `O(logN)` | `O(1)/O(N)` |
| Deletion   | `O(N)` | `O(N)`      | `O(logN)` | `O(1)/O(N)` |
| Search     | `O(N)` | `O(N)`      | `O(logN)` | `O(1)/O(N)` |
