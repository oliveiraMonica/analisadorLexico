package nodes.expr;

public class Index extends Expr {

  private Expr s;
  private Expr e;

  public Index (Expr s, Expr e) {
    this.s=s;
    this.e=e;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    //System.out.println(s);
    
    if(s!=null){
      s.printTree(n);
    }
    
    if(e!=null){
      e.printTree(n);
    }
  }

  public String getNodeName() {
    return "Index";
  }
}