package nodes.cmd;

import nodes.expr.Expr;

public class Write extends Cmd {

  private Expr e;

  public Write ( Expr e) {
    this.e=e;
  }

  public void printTree(int n) {

    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    
    for(int i=0; i < n-6; i++){
      System.out.print(".");
    }
    
    e.printTree(n+6);
  }

  public String getNodeName() {
    return "escreva";
  }
}
