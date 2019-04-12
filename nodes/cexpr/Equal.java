package nodes.cexpr;

import nodes.expr.Expr;

public class Equal extends Cexpr {

	public Equal(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "==";
	}
}
