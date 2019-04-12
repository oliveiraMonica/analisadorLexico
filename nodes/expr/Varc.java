package nodes.expr;

public class Varc extends Expr {

  private String c;

  public Varc(String c){
    this.c = c;
  }

  public String getNodeName(){
    return ""+c;
  }

  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
  }
}
