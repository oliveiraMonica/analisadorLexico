package nodes.expr;
import java.util.Hashtable;

public class Var extends Expr{

  private String s;

  public Var(String s){
    this.s = s;
  }


  public String getNodeName(){
    return s;
  }


  public void printTree(int n){
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }
}

