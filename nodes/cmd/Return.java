package nodes.cmd;

import nodes.expr.Expr;

public class Return extends Cmd {

  private Expr e;

  public Return (Expr e) {
    this.e=e;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    e.printTree(n+6);
  }

  public String getNodeName() {
    return "retorne";
  }
}
