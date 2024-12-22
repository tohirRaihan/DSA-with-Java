package data_structures.nonlinear_data_structures.graph.adjacency_matrix;

class GraphNode {
  public String name;
  public int index;
  public boolean isVisited = false;

  public GraphNode(String name, int index) {
    this.name = name;
    this.index = index;
  }

}
