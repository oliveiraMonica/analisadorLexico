package nodes.type;

public class DeclList extends Type{

	private Type a;
	private Type b;

	public DeclList(Type a, Type b){
		this.a = a;
		this.b = b;
	}

	public String getNodeName() {
		return "DeclList";
	}

	public void printTree(int n){ 
		for(int i=0; i < n; i++){
			System.out.print(".");
		}
		
		if(a!=null)
			a.printTree(n);
		
		if(b!=null)
			b.printTree(n);
		//System.out.println(getNodeName());

		//for(int i=0; i < n+3; i++){
		//	System.out.print(".");
		//}
		//System.out.println(""+s);
	}
}