package nodes.expr;

public class Sub extends BinOP{

	public Sub(Expr e, Expr d){
		super(e,d);
	}

	public String getNodeName(){
		return "-";
	}
}
