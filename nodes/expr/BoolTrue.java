package nodes.expr;

public class BoolTrue extends Expr {

  private String d;

  public BoolTrue(){
    d = "V";
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
