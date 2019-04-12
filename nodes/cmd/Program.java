package nodes.cmd;

import nodes.type.Type;

public class Program extends Cmd {

  private Type t;
  private String i;
  private Cmd c;

  public Program (Type t, String i, Cmd c) {
    this.t=t;
    this.i=i;
    this.c=c;
  }

  public void printTree(int n) {

    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    //System.out.println(""+i);
    c.printTree(n);

    if (t!=null) {
      //System.out.println(""+t);
      t.printTree(0);
    } 
  }

  public String getNodeName() {
    return "programa";
  }
}
