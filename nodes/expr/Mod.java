package nodes.expr;

public class Mod extends BinOP {

	public Mod(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "%";
	}
}
