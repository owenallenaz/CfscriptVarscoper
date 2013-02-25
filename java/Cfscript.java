import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Cfscript {
	public Cfscript() {}
	
	public static CfscriptCustomListener process(String file) throws Exception {
		CfscriptLexer lexer = new CfscriptLexer(new ANTLRFileStream(file));
		CfscriptParser parser = new CfscriptParser(new CommonTokenStream(lexer));
		
		/* 
		parser.setBuildParseTree(true);
		ParserRuleContext tree = parser.component();
		tree.inspect(parser);
		*/
		
		ParseTree tree = parser.component();
		ParseTreeWalker walker = new ParseTreeWalker();
		CfscriptCustomListener result = new CfscriptCustomListener();
		walker.walk(result, tree);
		
		return result;
	}
}