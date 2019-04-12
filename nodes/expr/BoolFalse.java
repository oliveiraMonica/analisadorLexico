package nodes.expr;

public class BoolFalse extends Expr {

  private String d;

  public BoolFalse(){
    d = "F";
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
