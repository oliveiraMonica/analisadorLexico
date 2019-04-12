package nodes.body;

import nodes.cmd.Cmd;
import nodes.type.Type;

public class Body extends Cmd {
    
  private Type t;
  private Cmd[] c;
    
  public Body (Type t, Cmd[] c) {
    this.t=t;
    this.c=c;
  }
    
  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());

    for(int j=0; j < c.length; j++) 
      c[j].printTree(n+3);
    
    if (t!=null)
      t.printTree(n+3);
  }

    public String getNodeName() {
       return "body";
    }  
}
