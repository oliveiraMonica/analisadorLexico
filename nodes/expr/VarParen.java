package nodes.expr;
import java.util.Hashtable;

public class VarParen extends Expr{

  private String s;

  public VarParen(String s){
    this.s = s;
  }


  public String getNodeName(){
    return s;
  }


  public void printTree(int n){
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName()+"()");
  }
}

