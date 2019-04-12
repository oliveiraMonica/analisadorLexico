package nodes.type;

public class VarDecList extends Type{

  private String a;
  private Type[] b;

  public VarDecList (String a, Type[] b){
    this.a = a;
    this.b = b;
  }

  public String getNodeName() {
    return a;
  }

  public void printTree(int n) {
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println("registro");
    System.out.println(""+getNodeName());
    
    for(int j=0; j < b.length; j++) 
      b[j].printTree(n+3);
  }
}
