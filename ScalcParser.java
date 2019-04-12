import nodes.body.*;
import nodes.expr.*;
import nodes.*;
import nodes.type.*;
import nodes.cmd.*;
import beaver.*;
import java.util.ArrayList;
import nodes.cexpr.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "SCalc.grammar".
 */
public class ScalcParser extends Parser {

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9p5babmL4KOn$ylRvBC43O9iWIp4Y2P2KisGWWXW2WgkB4eoY8GaINY0hY0IxXuqYhBasT" +
		"BgxnOfMMLLPuyA0gAkAEYYEAkk82AA8hjh$lrZ8z9m0C7vjMllwsNh$lrwnufsAfhrQ5gzM" +
		"YeDgiDtTeRj54twrRTej3Pj#bsSr8Zj41NQR2swr8jLofd9vnzViukShPjjrYr6gyw3L291" +
		"gfGQJMeKRCrILsQfJa#ccstsRMhqKMQfyN6g83nevQChnlCIwUqFLTwiSywAWVrcLCrpoXL" +
		"QEPPZTBZ#gdIPArX5QFtiTAjHQdcukdcVIIzPxlFPOY6grd3N4Rn7ESwJuyhxr0BsaZVOu#" +
		"koscjNbkh6xrsdaOpMZbF9SyKjplApG$evRgGyagLcUzoSHkjDbzhFlOoxBNQv9YXrRf9Tp" +
		"cztTMwBwghBRh2QzVh6ienMg6xrQqBtAXZDOwSrcc2wdK$temcgabJDKtJyNRgObsYotIvE" +
		"QohjT1yhqLQIco9#TPyerLQR$xHLdRYdR1Dz#XU1UodUdPjXbMmkcKeSnp6YhIgpDdjz5t6" +
		"VXp96npD7CQGItdEJkNP9SwsxTBiWy6i$oJUrnIo7CxNOFqXtqOX6KJHRBi6rsuyCwkZfTp" +
		"uKKixVWqh5czxhlGEdtLK9llCgPudmrDrLgEaSlqaMOleVKHhKOATPYUKySuZJwNF9NIxeD" +
		"bb5CynxJmfLnRpfAWPzPYYVbOhzLe3#odIRDqIJfe1V4i3qMr#0yXd86MnypHZPUFHFagIS" +
		"HIr$LWg#7u3i7gjgzNewmRKZRHYj7fsUWQjb5xjg7R#fRIsiXpDof2vj47ahKSB6T5waxGC" +
		"YOr3I$ADLB4#8VqqELAKKkyE2cFC2JY6EWegO04qmH3ynjR9mkzHBp#7DYaeGkxrlWmKU$q" +
		"uB25U30ceXIuVM#RbQdopaJMm3lR19X$RukKsBtkX4Hw0X#51sWwAOi4Y68vorDSj$2$VO1" +
		"XCZUN$23mKdrC#$1w3W$0K7A9zE$9Pv51OZluySWGiXPKm4rR0CfX3$0NaI5W3Ow43LW7pr" +
		"KvafSzj7iLXsEt7FURzZLxEFqEEBn9V69ld3DY8SWJPxNspOAtNDy1wb1F8rbW$esDww2Lp" +
		"qPEGEDtuR8lzlkvpNZu3rR6#UhqyxCSVuUqTNZuUotsibxLUJl2opikCbms#xHFnNFWz7Uj" +
		"hefVLNawEnPfEDvzOdMOlMxAIucGiNffNVrgUFIexBiMklDYOF3i#XmF$brkMxDhtati1TC" +
		"RihhnuCZPUhs8$z$NB73S$cv#GF#RyNxdoQCx#4hu0ldvpo7n2#HaSW8$X8zWF7xgw7vYtd" +
		"7mVTfezvWtacsQlyxrktZFlcdVCssQVUHdxKpYeC$pCdbEi8rx#3h$2B$2AUSsyQdQRNUOt" +
		"5$lR$9Mh$wSh$yZPV0NSdZEuMreuR#qxRkLrMAPpsxGxYZW34znk5lapE#JCBk0yjZTB00N" +
		"SE04KSEk4aF24CLd0dLJeiUTws0#1Eylx9#5bq8SqiRJxLn5m5YViUUp#ivnAo9qMGAZEVm" +
		"7KldJu");

	private final Action[] actions;

	public ScalcParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] program = declList.d PROGRAMA TYID.i body.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final Type d = (Type) _symbol_d.value;
					final Symbol _symbol_i = _symbols[offset + 3];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_b = _symbols[offset + 4];
					final Cmd b = (Cmd) _symbol_b.value;
					 return new Program (d,i,b);
				}
			},
			new Action() {	// [1] declList = decl.c declList.d
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 1];
					final Type c = (Type) _symbol_c.value;
					final Symbol _symbol_d = _symbols[offset + 2];
					final Type d = (Type) _symbol_d.value;
					 return new DeclList(c,d);
				}
			},
			Action.NONE,  	// [2] declList = 
			new Action() {	// [3] decl = functionDec.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 1];
					final Type f = (Type) _symbol_f.value;
					 return f;
				}
			},
			new Action() {	// [4] decl = recordDec.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_r = _symbols[offset + 1];
					final Type r = (Type) _symbol_r.value;
					 return r;
				}
			},
			new Action() {	// [5] recordDec = REGISTRO TYID.t LBRACE varDecList.v RBRACE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final String t = (String) _symbol_t.value;
					final Symbol _symbol_v = _symbols[offset + 4];
					final ArrayList _list_v = (ArrayList) _symbol_v.value;
					final Type[] v = _list_v == null ? new Type[0] : (Type[]) _list_v.toArray(new Type[_list_v.size()]);
					 return new VarDecList(t, v);
				}
			},
			new Action() {	// [6] functionDec = type.t ID.id LPAREN RPAREN body.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Type t = (Type) _symbol_t.value;
					final Symbol _symbol_id = _symbols[offset + 2];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Cmd b = (Cmd) _symbol_b.value;
					 return new FunctionDec (t,id,b);
				}
			},
			new Action() {	// [7] functionDec = type.t ID.id LPAREN varDecList.v RPAREN body.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Type t = (Type) _symbol_t.value;
					final Symbol _symbol_id = _symbols[offset + 2];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_v = _symbols[offset + 4];
					final ArrayList _list_v = (ArrayList) _symbol_v.value;
					final Type[] v = _list_v == null ? new Type[0] : (Type[]) _list_v.toArray(new Type[_list_v.size()]);
					final Symbol _symbol_b = _symbols[offset + 6];
					final Cmd b = (Cmd) _symbol_b.value;
					 return new FunctionDec(t,id,v,b);
				}
			},
			new Action() {	// [8] body = LBRACE varsSection.v commandList.c RBRACE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_v = _symbols[offset + 2];
					final Type v = (Type) _symbol_v.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final ArrayList _list_c = (ArrayList) _symbol_c.value;
					final Cmd[] c = _list_c == null ? new Cmd[0] : (Cmd[]) _list_c.toArray(new Cmd[_list_c.size()]);
					 return new Body(v,c);
				}
			},
			new Action() {	// [9] varsSection = VARS COLON varDecList.v SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_v = _symbols[offset + 3];
					final ArrayList _list_v = (ArrayList) _symbol_v.value;
					final Type[] v = _list_v == null ? new Type[0] : (Type[]) _list_v.toArray(new Type[_list_v.size()]);
					 return new VarsSec(v);
				}
			},
			Action.NONE,  	// [10] varsSection = 
			new Action() {	// [11] varDecList = varDec
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [12] varDecList = varDecList VIRG varDec
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3].value); return _symbols[offset + 1];
				}
			},
			new Action() {	// [13] varDec = type.t ID.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Type t = (Type) _symbol_t.value;
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					 return new VarDec(t, i);
				}
			},
			new Action() {	// [14] block = LBRACE commandList.c RBRACE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 2];
					final ArrayList _list_c = (ArrayList) _symbol_c.value;
					final Cmd[] c = _list_c == null ? new Cmd[0] : (Cmd[]) _list_c.toArray(new Cmd[_list_c.size()]);
					 return new CommandList(c);
				}
			},
			new Action() {	// [15] commandList = cmd
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [16] commandList = commandList cmd
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			new Action() {	// [17] cmd = stmt.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final Cmd s = (Cmd) _symbol_s.value;
					 return s;
				}
			},
			new Action() {	// [18] cmd = singlecmd.c SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 1];
					final Cmd c = (Cmd) _symbol_c.value;
					 return c;
				}
			},
			new Action() {	// [19] singlecmd = INSTANCIE variable.v cexpr.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_v = _symbols[offset + 2];
					final Expr v = (Expr) _symbol_v.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					 return new Instancie (v,c);
				}
			},
			new Action() {	// [20] singlecmd = WRITE LPAREN cexpr.c RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					 return new Write(c);
				}
			},
			new Action() {	// [21] singlecmd = READ LPAREN variable.v RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_v = _symbols[offset + 3];
					final Expr v = (Expr) _symbol_v.value;
					 return new Read(v);
				}
			},
			new Action() {	// [22] singlecmd = variable.v ATTR cexpr.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_v = _symbols[offset + 1];
					final Expr v = (Expr) _symbol_v.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					 return new Attr(v,c);
				}
			},
			new Action() {	// [23] singlecmd = ID.id LPAREN paramList.p RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_p = _symbols[offset + 3];
					final ArrayList _list_p = (ArrayList) _symbol_p.value;
					final Expr[] p = _list_p == null ? new Expr[0] : (Expr[]) _list_p.toArray(new Expr[_list_p.size()]);
					 return new IdParam(id,p);
				}
			},
			new Action() {	// [24] singlecmd = ID.id LPAREN RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					 return new VarParen(id);
				}
			},
			new Action() {	// [25] singlecmd = RETURN cexpr.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 2];
					final Expr c = (Expr) _symbol_c.value;
					 return new Return(c);
				}
			},
			new Action() {	// [26] stmt = WHILE LPAREN cexpr.c RPAREN block.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Cmd b = (Cmd) _symbol_b.value;
					 return new While(c,b);
				}
			},
			new Action() {	// [27] stmt = IF LPAREN cexpr.c RPAREN block.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 3];
					final Expr c = (Expr) _symbol_c.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Cmd b = (Cmd) _symbol_b.value;
					 return new If(c,b);
				}
			},
			new Action() {	// [28] stmt = IF LPAREN cexpr.a RPAREN block.b ELSE block.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Cmd b = (Cmd) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 7];
					final Cmd c = (Cmd) _symbol_c.value;
					 return new IfElse(a,b,c);
				}
			},
			new Action() {	// [29] cexpr = cexpr.a AND cexpr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new And(a,b);
				}
			},
			new Action() {	// [30] cexpr = cexpr.a OR cexpr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Or(a,b);
				}
			},
			new Action() {	// [31] cexpr = expr.a EQUAL expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Equal(a,b);
				}
			},
			new Action() {	// [32] cexpr = expr.a LESS expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Less(a,b);
				}
			},
			new Action() {	// [33] cexpr = expr.a HIGHER expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Higher(a,b);
				}
			},
			new Action() {	// [34] cexpr = expr.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final Expr e = (Expr) _symbol_e.value;
					 return e;
				}
			},
			new Action() {	// [35] expr = expr.a MULT expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Mult(a,b);
				}
			},
			new Action() {	// [36] expr = expr.a DIV expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Div(a,b);
				}
			},
			new Action() {	// [37] expr = expr.a MOD expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Mod(a,b);
				}
			},
			new Action() {	// [38] expr = expr.a PLUS expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Add(a, b);
				}
			},
			new Action() {	// [39] expr = expr.a MINUS expr.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Sub(a, b);
				}
			},
			new Action() {	// [40] expr = LPAREN cexpr.e RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					 return e;
				}
			},
			new Action() {	// [41] expr = ID.id LPAREN paramList.p RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_p = _symbols[offset + 3];
					final ArrayList _list_p = (ArrayList) _symbol_p.value;
					final Expr[] p = _list_p == null ? new Expr[0] : (Expr[]) _list_p.toArray(new Expr[_list_p.size()]);
					 return new ParamList(id, p);
				}
			},
			new Action() {	// [42] expr = ID.id LPAREN RPAREN
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					 return new VarParen(id);
				}
			},
			new Action() {	// [43] expr = TRUE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new BoolTrue();
				}
			},
			new Action() {	// [44] expr = FALSE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new BoolFalse();
				}
			},
			new Action() {	// [45] expr = NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final Number n = (Number) _symbol_n.value;
					 return new LitInt(n.doubleValue());
				}
			},
			new Action() {	// [46] expr = CHAR.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 1];
					final String c = (String) _symbol_c.value;
					 return new Varc(c);
				}
			},
			new Action() {	// [47] expr = ID.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new Var(i);
				}
			},
			new Action() {	// [48] variable = ID.id indexes.e DOT variable.v
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol _symbol_v = _symbols[offset + 4];
					final Expr v = (Expr) _symbol_v.value;
					 return new Variable(id,e, v);
				}
			},
			new Action() {	// [49] variable = ID.id indexes.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_id = _symbols[offset + 1];
					final String id = (String) _symbol_id.value;
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					 return new Variable(id,e, null);
				}
			},
			new Action() {	// [50] variable = NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final Number n = (Number) _symbol_n.value;
					 return new LitInt(n.doubleValue());
				}
			},
			new Action() {	// [51] indexes = indexes.i LBRACK expr.e RBRACK
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final Expr i = (Expr) _symbol_i.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expr e = (Expr) _symbol_e.value;
					 return new Index(i, e);
				}
			},
			Action.NONE,  	// [52] indexes = 
			new Action() {	// [53] type = BOOL
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Bool();
				}
			},
			new Action() {	// [54] type = CHARACTER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Char();
				}
			},
			new Action() {	// [55] type = TYID.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final String t = (String) _symbol_t.value;
					 return new TyID(t);
				}
			},
			new Action() {	// [56] type = INTEGER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new Int();
				}
			},
			new Action() {	// [57] type = type.t LBRACK RBRACK
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Type t = (Type) _symbol_t.value;
					 return new ArrayType(t);
				}
			},
			new Action() {	// [58] paramList = variable
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [59] paramList = paramList VIRG variable
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3].value); return _symbols[offset + 1];
				}
			}
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
