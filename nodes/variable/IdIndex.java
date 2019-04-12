package nodes.variable;

import nodes.expr.Expr;

public class IdIndex extends Expr {

  protected String i;
  protected Expr[] indexes;


  public IdIndex(String i, Expr[] indexes){
    this.i = i;
    this.indexes = indexes;
  }

  public String getIdName(){
    return i;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }
    System.out.println(getNodeName());
  }

  public String getNodeName() {
    return i;
  }
}
