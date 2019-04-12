package nodes.cexpr;

import nodes.expr.Expr;

public class And extends Cexpr{

	public And(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "&";
	}
}
