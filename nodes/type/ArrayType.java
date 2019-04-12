package nodes.type;

import nodes.expr.Expr;

public class ArrayType extends Type {

  private Type t;

  public ArrayType(Type t){
    this.t=t;
  } 


  public String getNodeName(){
    return ""+t.getNodeName()+"[]";
  }


  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }
}
