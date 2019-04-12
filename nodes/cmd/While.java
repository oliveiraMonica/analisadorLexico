package nodes.cmd;

import nodes.expr.Expr;

public class While extends Cmd {

  private Expr a;
  private Cmd e;

  public While(Expr a, Cmd e) {
    this.a=a;
    this.e=e;
  }


  public String getNodeName() {
    return "WHILE";
  }

  public void printTree(int n){
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    
    a.printTree(n+3);
    e.printTree(n+3);
  }
}
