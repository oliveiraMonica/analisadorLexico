package nodes.cexpr;

import nodes.expr.*;

public abstract class Cexpr extends Expr {

	protected Expr e;
	protected Expr d;

	public Cexpr(Expr e, Expr d){
		this.e = e;
		this.d = d;
	}

	public void printTree(int n){
		for(int i=0; i < n; i++){
			System.out.print(".");
		}

		System.out.println(getNodeName());
		e.printTree(n+3);
		d.printTree(n+3);
	}
}
