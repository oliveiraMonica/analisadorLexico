package nodes.type;

import nodes.expr.Expr;

public class TyID extends Type {

  private String id;

  public TyID(String id){
    this.id=id;
  } 


  public String getNodeName(){
    return id;
  }


  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }
}
