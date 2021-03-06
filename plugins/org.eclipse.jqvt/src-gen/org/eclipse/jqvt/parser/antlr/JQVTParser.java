/*
 * generated by Xtext
 */
package org.eclipse.jqvt.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.jqvt.services.JQVTGrammarAccess;

public class JQVTParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JQVTGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.jqvt.parser.antlr.internal.InternalJQVTParser createParser(XtextTokenStream stream) {
		return new org.eclipse.jqvt.parser.antlr.internal.InternalJQVTParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "PackageDeclaration";
	}
	
	public JQVTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JQVTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
