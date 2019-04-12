package nodes.cexpr;

import nodes.expr.Expr;

public class Higher extends Cexpr {

	public Higher(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "<";
	}
}
