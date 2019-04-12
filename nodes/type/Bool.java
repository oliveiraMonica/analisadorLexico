package nodes.type;

import nodes.expr.Expr;

public class Bool extends Type {

  private String b;

  public Bool(){
    b = "Bool";
  } 


  public String getNodeName(){
    return ""+b;
  }


  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }

}
