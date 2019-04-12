package nodes.cmd;

import nodes.expr.Expr;

public class Read extends Cmd {

  private Expr v;

  public Read (Expr v) {
    this.v=v;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());

    for(int i=0; i < n+6; i++){
      System.out.print(".");
    }

    System.out.println(""+v.getNodeName());
  }

  public String getNodeName() {
    return "leia";
  }
}
