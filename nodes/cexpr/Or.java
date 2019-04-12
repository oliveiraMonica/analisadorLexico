package nodes.cexpr;

import nodes.expr.Expr;

public class Or extends Cexpr{

	public Or(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "|";
	}
}
