package nodes.type;

public class VarsSec  extends Type {

  private Type[] c;

  public VarsSec(Type[] c) {
    this.c=c;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());
    
    for(int j=0; j < c.length; j++){ 
      c[j].getNodeName();
      c[j].printTree(n+3);
    }
  }

  public String getNodeName() {
    return "vars";
  }
}
