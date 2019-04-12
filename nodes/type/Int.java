package nodes.type;

import nodes.expr.Expr;

public class Int extends Type {

  private String d;

  public Int(){
    d = "Int";
  } 


  public String getNodeName(){
    return ""+d;
  }


  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }
}
