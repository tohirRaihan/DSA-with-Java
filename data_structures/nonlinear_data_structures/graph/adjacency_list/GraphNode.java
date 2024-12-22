package data_structures.nonlinear_data_structures.graph.adjacency_list;

import java.util.ArrayList;

class GraphNode {
  public String name;
  public int index;
  public boolean isVisited = false;

  public ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

  public GraphNode(String name, int index) {
    this.name = name;
    this.index = index;
  }

}
