### What is Recursion?
Recursion is a way of solving problems by having a function calling itself.

### Why we need Recursion?
1. Recursive thinking is really important in programming, and it helps us break down big problems into smaller ones and
   easier to use.
    - **when to choose recursion?**
        - If we can divide the problem into smaller sub problems
        - Design an algorithm to compute nth...
        - Write code to list the n...
        - Implement a method to compute all
2. The prominent usage of recursion in data structures like trees and graphs.
3. It is used in many algorithms (divide and conquer, greedy and dynamic programming).

### The Logic Behind Recursion
1. A method calls itself
2. Exit from infinite loop

**Example pseudocode:**
```
FUNCTION recursionMethod()
    IF (exit from condition satisfied)
        RETURN some value
    ELSE
        recursionMethod(modified parameters)
    END IF
END FUNCTION
```

### Recursive vs Iterative Solutions
| Points           | Recursion | Iteration |                                                                                                                                 |
|------------------|-----------|-----------|---------------------------------------------------------------------------------------------------------------------------------|
| Space Efficient? | `No`      | `Yes`     | No stack memory require in case of iteration                                                                                    |
| Time Efficient?  | `No`      | `Yes`     | In case of recursion system needs more time for pop and push elements to stack memory which makes recursion less time efficient |
| Easy to code?    | `Yes`     | `No`      | We use recursion especially in the cases we know that a problem can be divided into similar sub problems                        |

### When to Use/Avoid Recursion?
- **When to use it?**
    - When we can easily break down a problem into similar sub-problems
    - When we are fine with extra overhead (both time and space) that comes with it
    - When we need a quick working solution instead of efficient one
    - When traverse a tree
    - When we use memoization in recursion
- **When to Avoid it?**
    - If time and space complexity matters for you
    - Recursion uses more memory. If we use embedded memory. For example an application that takes more memory in the
      phone is not efficient
    - Recursion can be slow

### Write Recursion in 3 Steps
- **Step 1:** Recursive case - the flow
    - **Example:** n! = n * (n-1)!
- **Step 2:** Base case - the stopping criterion
- **Step 3:** Unintentional case - the constraint
