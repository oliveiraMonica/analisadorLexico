package nodes.expr;

public class Mult extends BinOP{

	public Mult(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "*";
	}
}

