package nodes.expr;

import java.util.Hashtable;

public class LitInt extends Expr{

  private double d;

  public LitInt(double e){
    d = e;
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
