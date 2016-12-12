/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.formatting;

import org.eclipse.jqvt.services.JQVTGrammarAccess;
import org.eclipse.jqvt.services.JQVTGrammarAccess.ObjectTemplateElements;
import org.eclipse.jqvt.services.JQVTGrammarAccess.PackageDeclarationElements;
import org.eclipse.jqvt.services.JQVTGrammarAccess.RelationDomainElements;
import org.eclipse.jqvt.services.JQVTGrammarAccess.RelationElements;
import org.eclipse.jqvt.services.JQVTGrammarAccess.TransformationElements;
import org.eclipse.jqvt.services.JQVTGrammarAccess.VarDeclElements;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class JQVTFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		configure(c, (JQVTGrammarAccess) getGrammarAccess());
		c.setAutoLinewrap(300);
	}

	@SuppressWarnings("restriction")
	private void configure(FormattingConfig c, JQVTGrammarAccess ga) {
		configure(c, ga.getRelationAccess());
		configure(c, ga.getObjectTemplateAccess());
		configure(c, ga.getRelationDomainAccess());
		configure(c, ga.getTransformationAccess());
		configure(c, ga.getPackageDeclarationAccess());
		configure(c, ga.getVarDeclAccess());

		// configure some formatting for Xbase syntax
		c.setLinewrap().around(ga.getXImportDeclarationAccess().getGroup());
		c.setNoSpace().around(ga.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
		c.setNoSpace().around(ga.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
		c.setNoSpace().before(ga.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
		c.setNoSpace().around(ga.getXConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_4_0_0());
		c.setNoSpace().before(ga.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());

		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(ga.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(ga.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(ga.getML_COMMENTRule());

	}

	private void configure(FormattingConfig c, VarDeclElements ele) {
		c.setNoSpace().before(ele.getWriteableSemicolonKeyword_3_0());
	}

	private void configure(FormattingConfig c, PackageDeclarationElements ele) {
		c.setNoSpace().before(ele.getSemicolonKeyword_2());
		c.setLinewrap(2).after(ele.getSemicolonKeyword_2());
		c.setLinewrap(2).before(ele.getTransformationAssignment_4());
	}

	private void configure(FormattingConfig c, TransformationElements ele) {
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_6());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_8());
	}

	private void configure(FormattingConfig c, RelationDomainElements ele) {
		c.setLinewrap(2).around(ele.getGroup());
	}

	private void configure(FormattingConfig c, RelationElements ele) {
		c.setLinewrap(2).around(ele.getGroup());
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		c.setLinewrap(2).after(ele.getLeftCurlyBracketKeyword_3());
		c.setLinewrap().around(ele.getVarsAssignment_4());

		// when
		c.setLinewrap().before(ele.getWhenKeyword_6_0());
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_6_1());
		c.setLinewrap().around(ele.getGroup_6_2());
		c.setNoSpace().before(ele.getSemicolonKeyword_6_2_1());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_6_3());
		c.setLinewrap().around(ele.getRightCurlyBracketKeyword_6_3());

		// where
		c.setLinewrap().before(ele.getWhereKeyword_7_0());
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_7_1());
		c.setLinewrap().around(ele.getGroup_7_2());
		c.setNoSpace().before(ele.getSemicolonKeyword_7_2_1());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7_3());
		c.setLinewrap().around(ele.getRightCurlyBracketKeyword_7_3());

		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_8());
		c.setLinewrap(2).before(ele.getRightCurlyBracketKeyword_8());

	}

	private void configure(FormattingConfig c, ObjectTemplateElements ele) {
		c.setLinewrap().around(ele.getGroup_5());
		c.setIndentationIncrement().before(ele.getGroup_5());
		c.setIndentationDecrement().after(ele.getGroup_5());
	}
}
