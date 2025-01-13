package data_structures.nonlinear_data_structures.union_find;

class QuickUnionUF {
  private final int[] id;

  public QuickUnionUF(int n) {
    id = new int[n];
    for (int i = 0; i < n; i++)
      id[i] = i;
  }

  // Time Complexity: O(n)
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  // Time Complexity: O(n)
  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    id[i] = j;
  }

  private int root(int i) {
    while (i != id[i]) {
      i = id[i];
    }
    
    return i;
  }
}
