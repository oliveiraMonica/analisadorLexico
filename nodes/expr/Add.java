package nodes.expr;

public class Add extends BinOP{   
	public Add(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "+";
	}  
}
