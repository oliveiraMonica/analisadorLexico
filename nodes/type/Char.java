package nodes.type;

import nodes.expr.Expr;

public class Char extends Type{

  private String d;

  public Char(){
    d = "Char";
  } 


  public String getNodeName(){
    return d;
  }


  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }
}
