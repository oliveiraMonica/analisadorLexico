package nodes;

import java.util.Hashtable;
/* Classe abstrata para representação de uma expressão qualquer
   Expressões serão representadas por meio de uma árvore na qual
   cada nó é uma expressão.
   
   Nessa classe são definidos todas as funções comuns a todos os nśo.
*/
public abstract class ASTNode extends beaver.Symbol {
   
   public abstract void printTree(int n);
   
   public abstract String getNodeName();
                                        
 
}
