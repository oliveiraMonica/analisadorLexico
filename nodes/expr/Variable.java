package nodes.expr;

public class Variable extends Expr {

  private String s;
  private Expr e;

  private Expr v;

  public Variable (String s, Expr e, Expr v) {
    this.s=s;
    this.e=e;
    this.v=v;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    //System.out.println(s);
    if(e!=null)
      e.printTree(n);
    if(v!=null)
      v.printTree(n);
  }

  public String getNodeName() {
    return s;
  }
}
