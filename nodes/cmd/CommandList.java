package nodes.cmd;

public class CommandList extends Cmd{

  private Cmd[] c;

  public CommandList (Cmd[] c ){
    this.c=c;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    for(int j=0; j < c.length; j++)
      c[j].printTree(n+3);
  }

  public String getNodeName() {
    return ""+c;
  }
}
