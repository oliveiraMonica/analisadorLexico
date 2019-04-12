package nodes.expr;

import nodes.expr.Expr;
import nodes.expr.Var;

public class ParamList extends Expr {

  protected Var e;
  protected Expr[] d;

  public ParamList(String e, Expr[] d){
    this.e = new Var(e);
    this.d = d;
  }

  public void printTree(int n){
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(e.getNodeName());

    for(int j=0; j < d.length; j++)
      d[j].printTree(n+3);

  }

  public String getNodeName(){
    return "TESTE";
  }
}
