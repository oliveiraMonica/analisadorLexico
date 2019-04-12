package nodes.cmd;

import nodes.cexpr.Cexpr;
import nodes.cmd.Cmd;
import nodes.expr.Expr;
import nodes.expr.Expr;

public class If extends Cmd {

  private Expr e; 
  private Cmd c;

  public If(Expr e, Cmd c){
    this.e = e;
    this.c = c;
  }

  public String getNodeName(){
    return "IF";
  }

  public void printTree(int n){
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    c.printTree(n);
    e.printTree(n+3);
  }
}
