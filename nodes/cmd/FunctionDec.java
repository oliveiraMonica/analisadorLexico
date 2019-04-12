package nodes.cmd;

import nodes.ASTNode;
import nodes.body.Body;
import nodes.type.Type;

public class FunctionDec extends Type{

  private Type t;
  private String s;
  private Cmd b;
  private Type[] p;

  public FunctionDec (Type t, String s, Cmd b) {
    this.t=t;
    this.s=s;
    this.b=b;
    this.p=null;
  }

  public FunctionDec (Type t, String s, Type[] p, Cmd b) {
    this.t=t;
    this.s=s;
    this.b=b;
    this.p=p;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    t.printTree(n);
    System.out.println(""+s);
    
    if(p!=null){
      for(int j=0; j<p.length; j++){
        p[j].printTree(n+3);
      }
    }
    
    b.printTree(n+3);
  }

  public String getNodeName() {
    return "FunctionDec";
  }
}
