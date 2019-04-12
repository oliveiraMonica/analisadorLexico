package nodes.cmd;

import nodes.expr.Expr;

public class IfElse extends Cmd {

  private Expr c;
  private Cmd e;
  private Cmd f;

  public IfElse(Expr c, Cmd e, Cmd f) {
    this.c=c;
    this.e=e;
    this.f=f;
  }

  public String getNodeName() {
    return "se-senao";
  }

  public void printTree(int n){
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    c.printTree(n);
    e.printTree(n);
    f.printTree(n);
  }
}
