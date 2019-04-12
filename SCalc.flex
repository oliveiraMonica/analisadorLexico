

import beaver.Symbol;
import beaver.Scanner;

%%

%class ScalcLexer
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	return newToken(Terminals.EOF, "end-of-file");
%eofval}
%unicode
%line
%column
%{
	private Symbol newToken(short id)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength());
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}
%}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

Comment = {EndOfLineComment} | {DocumentationComment}

EndOfLineComment = "--""" {InputCharacter}* {LineTerminator}
DocumentationComment = "{-" {InputCharacter}* {LineTerminator}*[^-}] ~"-}"

WhiteSpace     = {LineTerminator} | [ \t\f]

Number = [:digit:] [:digit:]*
ID     = [a-z] ([:letter:] | [:digit:])*
TYID     = [A-Z] ([:letter:] | [:digit:])*
CHAR = "'"([a-z]|[A-Z]|\\n|\\r|\\b|\\t|\\f|\\[0-255]|{Outros})"'"
//CHAR = "'"\r|\n|\b|\[:digit:]?[:digit:]?[:digit:]"'"
//SingleCharacter = [^\r\n\'\\]
//OctDigit = [0-7]
Outros = ["!"|"@"|"#"|"$"|"%"|"&"|"*"|"("|")"|"^"|"~"|"-"|"{"|"}"|"{"|"}"|"<"|">"|":"|";"|" "]

%%

<YYINITIAL> {

        {WhiteSpace}+   { /* ignore */ }
        {Comment}      { /* ignore */ }

       
        "("         { return newToken(Terminals.LPAREN); }
        ")"         { return newToken(Terminals.RPAREN); }
        "*"         { return newToken(Terminals.MULT);   }
        "+"         { return newToken(Terminals.PLUS);   }
        "-"         { return newToken(Terminals.MINUS);  }
        "/"         { return newToken(Terminals.DIV);    }
        "%"         { return newToken(Terminals.MOD);    }
        "V"         { return newToken(Terminals.TRUE);   }
        "F"         { return newToken(Terminals.FALSE);  }
        "enquanto"  { return newToken(Terminals.WHILE);  }
        "se"        { return newToken(Terminals.IF);     }
        "senao"     { return newToken(Terminals.ELSE);   }
        "&"         { return newToken(Terminals.AND);    }
        "|"         { return newToken(Terminals.OR);     }
        "=="        { return newToken(Terminals.EQUAL);  }
        "<"         { return newToken(Terminals.LESS);   }
        ">"         { return newToken(Terminals.HIGHER); }
        ","         { return newToken(Terminals.VIRG);   }
        "{"         { return newToken(Terminals.LBRACE); }
        "}"         { return newToken(Terminals.RBRACE); }
        ";"         { return newToken(Terminals.SEMI);   }
        "instancie" { return newToken(Terminals.INSTANCIE);}
        "escreva"   { return newToken(Terminals.WRITE);  }
        "leia"      { return newToken(Terminals.READ);   }
        "="         { return newToken(Terminals.ATTR);   }
        "retorne"   { return newToken(Terminals.RETURN); }
        "Bool"      { return newToken(Terminals.BOOL);   }
        "Char"      { return newToken(Terminals.CHARACTER); }
        "Int"       { return newToken(Terminals.INTEGER);   }
        "["         { return newToken(Terminals.LBRACK);    }
        "]"         { return newToken(Terminals.RBRACK);    }
        "registro"  { return newToken(Terminals.REGISTRO);  }
        "vars"      { return newToken(Terminals.VARS); }
        ":"         { return newToken(Terminals.COLON); }
        "programa"  { return newToken(Terminals.PROGRAMA); }
        "."         { return newToken(Terminals.DOT); }
        {Number}    { return newToken(Terminals.NUMBER, new Double(yytext())); }
        {ID}        { return newToken(Terminals.ID, yytext());                 }
        {CHAR}      { return newToken(Terminals.CHAR, yytext());     }
        {TYID}      { return newToken(Terminals.TYID, yytext());               }
}


.|\n            { throw new Scanner.Exception("unexpected character '" + yytext() + "'"); }
