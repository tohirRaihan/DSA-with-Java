package data_structures.nonlinear_data_structures.union_find;

class UnionFindExample {
  public static void main(String[] args) {
    int n = 10; // Example: 10 elements
    QuickFindUF uf = new QuickFindUF(n);

    // Example unions
    uf.union(4, 3);
    uf.union(3, 8);
    uf.union(6, 5);
    uf.union(9, 4);
    uf.union(2, 1);
    uf.union(8, 9);
    uf.union(5, 0);
    uf.union(7, 2);
    uf.union(6, 1);
    uf.union(1, 0);
    uf.union(6, 7);

    // Check connections
    System.out.println("Is 4 and 8 connected? " + uf.connected(4, 8)); // Should be true
    System.out.println("Is 0 and 7 connected? " + uf.connected(0, 7)); // Should be true
    System.out.println("Is 1 and 6 connected? " + uf.connected(1, 6)); // Should be true
    System.out.println("Is 2 and 5 connected? " + uf.connected(2, 5)); // Should be true
    System.out.println("Is 3 and 7 connected? " + uf.connected(3, 7)); // Should be true
    System.out.println("Is 4 and 6 connected? " + uf.connected(4, 6)); // Should be true
    System.out.println("Is 0 and 9 connected? " + uf.connected(0, 9)); // Should be true
    System.out.println("Is 5 and 8 connected? " + uf.connected(5, 8)); // Should be true
    System.out.println("Is 1 and 3 connected? " + uf.connected(1, 3)); // Should be true
    System.out.println("Is 2 and 9 connected? " + uf.connected(2, 9)); // Should be true
    System.out.println("Is 0 and 4 connected? " + uf.connected(0, 4)); // Should be true
    System.out.println("Is 5 and 7 connected? " + uf.connected(5, 7)); // Should be true
    System.out.println("Is 1 and 8 connected? " + uf.connected(1, 8)); // Should be true
    System.out.println("Is 2 and 6 connected? " + uf.connected(2, 6)); // Should be true

    System.out.println("Is 0 and 5 connected? " + uf.connected(0, 5)); // Should be true
    System.out.println("Is 3 and 5 connected? " + uf.connected(3, 5)); // Should be true
    System.out.println("Is 4 and 5 connected? " + uf.connected(4, 5)); // Should be true
    System.out.println("Is 1 and 9 connected? " + uf.connected(1, 9)); // Should be true
    System.out.println("Is 2 and 8 connected? " + uf.connected(2, 8)); // Should be true
    System.out.println("Is 0 and 3 connected? " + uf.connected(0, 3)); // Should be true
  }
}
