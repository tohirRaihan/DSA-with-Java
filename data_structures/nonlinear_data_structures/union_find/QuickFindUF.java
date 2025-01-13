package data_structures.nonlinear_data_structures.union_find;

class QuickFindUF {
  private int[] id;

  public QuickFindUF(int n) {
    id = new int[n];
    for (int i = 0; i < n; i++) {
      id[i] = i;
    }
  }

  // Time Complexity: O(1)
  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  // Time Complexity: O(n)
  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];
    if (pid == qid) return; // Already connected

    for (int i = 0; i < id.length; i++) {
      if (id[i] == pid) {
        id[i] = qid;
      }
    }
  }
}
