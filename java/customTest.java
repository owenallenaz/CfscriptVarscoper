import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// this file exists to provide an entry point for testing the CfscriptCUstomListener in a full java environment using Java tools for debugging
public class customTest {
	public static void main(String[] args) throws Exception {
		CfscriptLexer lexer = new CfscriptLexer(new ANTLRFileStream("D:\\inetpub\\web_sites\\web\\clients\\CfscriptVarscoper\\testing\\testPrimary.cfc"));
		CfscriptParser parser = new CfscriptParser(new CommonTokenStream(lexer));
		
		ParseTree tree = parser.component();
		ParseTreeWalker walker = new ParseTreeWalker();
		CfscriptCustomListener result = new CfscriptCustomListener();
		walker.walk(result, tree);
	}
}