package data_structures.nonlinear_data_structures.union_find;

/**
 * The most efficient version of Union-Find combines both weighted quick union
 * and path compression.
 */

// Weighted Quick Union with path compression
class WeightedQuickUnionUF {
  private int[] id;
  private int[] sz; // Size of subtree rooted at i (number of objects)

  public WeightedQuickUnionUF(int n) {
    id = new int[n];
    sz = new int[n];
    for (int i = 0; i < n; i++) {
      id[i] = i;
      sz[i] = 1; // Initial size of each tree is 1
    }
  }

  // Time Complexity: O(lg N) -----> almost O(1)
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  // Time Complexity: O(lg N) -----> almost O(1)
  public void union(int p, int q) {
    int rootP = root(p);
    int rootQ = root(q);
    if (rootP == rootQ)
      return;

    // Make smaller root point to larger one
    if (sz[rootP] < sz[rootQ]) {
      id[rootP] = rootQ;
      sz[rootQ] += sz[rootP];
    } else {
      id[rootQ] = rootP;
      sz[rootP] += sz[rootQ];
    }
  }

  private int root(int i) {
    while (i != id[i]) {
      id[i] = id[id[i]]; // Path compression: Make each examined node point to its grandparent
      i = id[i];
    }
    return i;
  }
}
