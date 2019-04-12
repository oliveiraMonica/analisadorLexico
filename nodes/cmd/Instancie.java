package nodes.cmd;

import nodes.expr.Expr;

public class Instancie extends Cmd {

  private Expr e; 
  private Expr c;

  public Instancie ( Expr e, Expr c) {
    this.e=e;
    this.c=c;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());

    for(int i=0; i < n+3; i++){
      System.out.print(".");
    }

    e.printTree(n);
    c.printTree(n+9);
  }

  public String getNodeName() {
    return "instancie";
  }
}
