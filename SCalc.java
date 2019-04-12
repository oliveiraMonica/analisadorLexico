import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import beaver.Symbol;
import beaver.Parser;
import nodes.*;
import nodes.expr.*;
import java.util.Hashtable;
import nodes.cexpr.Cexpr;

/* Programa princial: 
   Recebe como argumento uma expressão, fazo parser e constroi uma representação da árovre de sintaxe abstrata.
*/
public class SCalc{
    
    public static void main(String[] args){
        BufferedWriter output;     
        try{
             
            ScalcLexer input = new ScalcLexer(new FileReader(args[0]));
            ASTNode result = (ASTNode)new ScalcParser().parse(input);  
            result.printTree(0);      
        }
        catch (IOException e){
            System.err.println("Failed to read expression: " + e.getMessage());
        }
        catch (Parser.Exception e){
            System.err.println("Invalid expression: " + e.getMessage());
        }
        catch (Exception e){
            System.err.println("Exceção: " + e.getMessage());
        }
    }
}
