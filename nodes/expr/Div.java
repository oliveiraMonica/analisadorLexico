package nodes.expr;

public class Div extends BinOP {

	public Div(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "/";
	}
}
