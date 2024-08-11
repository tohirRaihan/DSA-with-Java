package data_structures.nonlinear_data_structures.tree;

import java.util.ArrayList;

public class Tree {
  String data;
  ArrayList<Tree> children;

  public Tree(String data) {
    this.data = data;
    this.children = new ArrayList<>();
  }

  public void addChild(Tree node) {
    this.children.add(node);
  }

  public String print(int level) {
    StringBuilder ret;
    ret = new StringBuilder("  ".repeat(level) + data + "\n");
    for (Tree node : this.children) {
      ret.append(node.print(level + 1));
    }
    return ret.toString();
  }
}
