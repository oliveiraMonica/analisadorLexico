package nodes.cmd;

import nodes.expr.Expr;

public class Attr extends Cmd {

  private Expr v;
  private Expr e;

  public Attr(Expr v, Expr e) {
    this.v=v;
    this.e=e;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());

    for(int j=0; j < n+3; j++) {
      System.out.print(".");
    }

    System.out.println(""+v.getNodeName());
    e.printTree(n+3);
  }

  public String getNodeName() {
    return "=";
  }
}
