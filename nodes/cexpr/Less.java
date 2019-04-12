package nodes.cexpr;

import nodes.expr.Expr;

public class Less extends Cexpr {

	public Less(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "<";
	}
}
