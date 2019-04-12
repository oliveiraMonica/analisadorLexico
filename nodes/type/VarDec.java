package nodes.type;

public class VarDec extends Type{

  private Type t;
  private String s;

  public VarDec(Type t, String s){
    this.t = t;
    this.s = s;
  }

  public String getNodeName() {
    return ""+t.getNodeName();
  }

  public void printTree(int n){ 
    for(int i=0; i < n; i++){
      System.out.print(".");
    }

    System.out.println(getNodeName());

    for(int i=0; i < n+3; i++){
      System.out.print(".");
    }
    
    System.out.println(""+s);
  }
}
