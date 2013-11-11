// Generated from KordaptCL.g4 by ANTLR 4.1

package com.korwe.kordapt.cl;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KordaptCLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_kordaptCl = 0, RULE_service = 1, RULE_function = 2, RULE_returnType = 3, 
		RULE_kordaptType = 4, RULE_kordaptTypeAttribute = 5, RULE_compilationUnit = 6, 
		RULE_packageDeclaration = 7, RULE_importDeclaration = 8, RULE_typeDeclaration = 9, 
		RULE_modifier = 10, RULE_classOrInterfaceModifier = 11, RULE_variableModifier = 12, 
		RULE_classDeclaration = 13, RULE_typeParameters = 14, RULE_typeParameter = 15, 
		RULE_typeBound = 16, RULE_enumDeclaration = 17, RULE_enumConstants = 18, 
		RULE_enumConstant = 19, RULE_enumBodyDeclarations = 20, RULE_interfaceDeclaration = 21, 
		RULE_typeList = 22, RULE_classBody = 23, RULE_interfaceBody = 24, RULE_classBodyDeclaration = 25, 
		RULE_memberDeclaration = 26, RULE_methodDeclaration = 27, RULE_genericMethodDeclaration = 28, 
		RULE_constructorDeclaration = 29, RULE_genericConstructorDeclaration = 30, 
		RULE_fieldDeclaration = 31, RULE_interfaceBodyDeclaration = 32, RULE_interfaceMemberDeclaration = 33, 
		RULE_constDeclaration = 34, RULE_constantDeclarator = 35, RULE_interfaceMethodDeclaration = 36, 
		RULE_genericInterfaceMethodDeclaration = 37, RULE_variableDeclarators = 38, 
		RULE_variableDeclarator = 39, RULE_variableDeclaratorId = 40, RULE_variableInitializer = 41, 
		RULE_arrayInitializer = 42, RULE_packageOrTypeName = 43, RULE_enumConstantName = 44, 
		RULE_typeName = 45, RULE_type = 46, RULE_classOrInterfaceType = 47, RULE_primitiveType = 48, 
		RULE_typeArguments = 49, RULE_typeArgument = 50, RULE_qualifiedNameList = 51, 
		RULE_formalParameters = 52, RULE_formalParameterList = 53, RULE_formalParameter = 54, 
		RULE_lastFormalParameter = 55, RULE_methodBody = 56, RULE_constructorBody = 57, 
		RULE_qualifiedName = 58, RULE_literal = 59, RULE_annotation = 60, RULE_annotationName = 61, 
		RULE_elementValuePairs = 62, RULE_elementValuePair = 63, RULE_elementValue = 64, 
		RULE_elementValueArrayInitializer = 65, RULE_annotationTypeDeclaration = 66, 
		RULE_annotationTypeBody = 67, RULE_annotationTypeElementDeclaration = 68, 
		RULE_annotationTypeElementRest = 69, RULE_annotationMethodOrConstantRest = 70, 
		RULE_annotationMethodRest = 71, RULE_annotationConstantRest = 72, RULE_defaultValue = 73, 
		RULE_block = 74, RULE_blockStatement = 75, RULE_localVariableDeclarationStatement = 76, 
		RULE_localVariableDeclaration = 77, RULE_statement = 78, RULE_catchClause = 79, 
		RULE_catchType = 80, RULE_finallyBlock = 81, RULE_resourceSpecification = 82, 
		RULE_resources = 83, RULE_resource = 84, RULE_switchBlockStatementGroup = 85, 
		RULE_switchLabel = 86, RULE_forControl = 87, RULE_forInit = 88, RULE_enhancedForControl = 89, 
		RULE_forUpdate = 90, RULE_parExpression = 91, RULE_expressionList = 92, 
		RULE_statementExpression = 93, RULE_constantExpression = 94, RULE_expression = 95, 
		RULE_primary = 96, RULE_creator = 97, RULE_createdName = 98, RULE_innerCreator = 99, 
		RULE_arrayCreatorRest = 100, RULE_classCreatorRest = 101, RULE_explicitGenericInvocation = 102, 
		RULE_nonWildcardTypeArguments = 103, RULE_typeArgumentsOrDiamond = 104, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 105, RULE_superSuffix = 106, 
		RULE_explicitGenericInvocationSuffix = 107, RULE_arguments = 108;
	public static final String[] ruleNames = {
		"kordaptCl", "service", "function", "returnType", "kordaptType", "kordaptTypeAttribute", 
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"packageOrTypeName", "enumConstantName", "typeName", "type", "classOrInterfaceType", 
		"primitiveType", "typeArguments", "typeArgument", "qualifiedNameList", 
		"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
		"methodBody", "constructorBody", "qualifiedName", "literal", "annotation", 
		"annotationName", "elementValuePairs", "elementValuePair", "elementValue", 
		"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
		"annotationMethodRest", "annotationConstantRest", "defaultValue", "block", 
		"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
		"resources", "resource", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "primary", 
		"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
		"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
	};

	@Override
	public String getGrammarFileName() { return "KordaptCL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public KordaptCLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KordaptClContext extends ParserRuleContext {
		public KordaptTypeContext kordaptType() {
			return getRuleContext(KordaptTypeContext.class,0);
		}
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public KordaptClContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kordaptCl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterKordaptCl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitKordaptCl(this);
		}
	}

	public final KordaptClContext kordaptCl() throws RecognitionException {
		KordaptClContext _localctx = new KordaptClContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kordaptCl);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218); service();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); kordaptType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitService(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_service);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); qualifiedName();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0) || _la==Identifier) {
				{
				{
				setState(223); function();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); returnType();
			setState(230); match(COLON);
			setState(231); match(Identifier);
			setState(232); formalParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(234); type();
				}
				break;
			case VOID:
				{
				setState(235); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KordaptTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public KordaptTypeAttributeContext kordaptTypeAttribute(int i) {
			return getRuleContext(KordaptTypeAttributeContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<KordaptTypeAttributeContext> kordaptTypeAttribute() {
			return getRuleContexts(KordaptTypeAttributeContext.class);
		}
		public KordaptTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kordaptType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterKordaptType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitKordaptType(this);
		}
	}

	public final KordaptTypeContext kordaptType() throws RecognitionException {
		KordaptTypeContext _localctx = new KordaptTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kordaptType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(238); type();
				setState(239); match(COLON);
				}
				break;
			}
			setState(243); qualifiedName();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier) {
				{
				{
				setState(244); kordaptTypeAttribute();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KordaptTypeAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KordaptTypeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kordaptTypeAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterKordaptTypeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitKordaptTypeAttribute(this);
		}
	}

	public final KordaptTypeAttributeContext kordaptTypeAttribute() throws RecognitionException {
		KordaptTypeAttributeContext _localctx = new KordaptTypeAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kordaptTypeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); type();
			setState(251); match(COLON);
			setState(252); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(KordaptCLParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(254); packageDeclaration();
				}
				break;
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(257); importDeclaration();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(263); typeDeclaration();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(271); annotation();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277); match(PACKAGE);
			setState(278); qualifiedName();
			setState(279); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(IMPORT);
			setState(283);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(282); match(STATIC);
				}
			}

			setState(285); qualifiedName();
			setState(288);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(286); match(DOT);
				setState(287); match(MUL);
				}
			}

			setState(290); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(292); classOrInterfaceModifier();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(299); classOrInterfaceModifier();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305); enumDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(306); classOrInterfaceModifier();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312); interfaceDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(313); classOrInterfaceModifier();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(319); annotationTypeDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modifier);
		int _la;
		try {
			setState(325);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(329);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableModifier);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(CLASS);
			setState(336); match(Identifier);
			setState(338);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(337); typeParameters();
				}
			}

			setState(342);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(340); match(EXTENDS);
				setState(341); type();
				}
			}

			setState(346);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(344); match(IMPLEMENTS);
				setState(345); typeList();
				}
			}

			setState(348); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(LT);
			setState(351); typeParameter();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352); match(COMMA);
				setState(353); typeParameter();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(Identifier);
			setState(364);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(362); match(EXTENDS);
				setState(363); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); type();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(367); match(BITAND);
				setState(368); type();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KordaptCLParser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(ENUM);
			setState(375); match(Identifier);
			setState(378);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(376); match(IMPLEMENTS);
				setState(377); typeList();
				}
			}

			setState(380); match(LBRACE);
			setState(382);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(381); enumConstants();
				}
			}

			setState(385);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(384); match(COMMA);
				}
			}

			setState(388);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(387); enumBodyDeclarations();
				}
			}

			setState(390); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392); enumConstant();
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(393); match(COMMA);
					setState(394); enumConstant();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(400); annotation();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406); match(Identifier);
			setState(408);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(407); arguments();
				}
			}

			setState(411);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(410); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(SEMI);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(414); classBodyDeclaration();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(INTERFACE);
			setState(421); match(Identifier);
			setState(423);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(422); typeParameters();
				}
			}

			setState(427);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(425); match(EXTENDS);
				setState(426); typeList();
				}
			}

			setState(429); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); type();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(432); match(COMMA);
				setState(433); type();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(LBRACE);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(440); classBodyDeclaration();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); match(LBRACE);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(449); interfaceBodyDeclaration();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(458); match(STATIC);
					}
				}

				setState(461); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(462); modifier();
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(468); memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_memberDeclaration);
		try {
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471); methodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472); genericMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473); fieldDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474); constructorDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(475); genericConstructorDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(476); interfaceDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(477); annotationTypeDeclaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478); classDeclaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(479); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(482); type();
				}
				break;
			case VOID:
				{
				setState(483); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(486); match(Identifier);
			setState(487); formalParameters();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(488); match(LBRACK);
				setState(489); match(RBRACK);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(495); match(THROWS);
				setState(496); qualifiedNameList();
				}
			}

			setState(501);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(499); methodBody();
				}
				break;
			case SEMI:
				{
				setState(500); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); typeParameters();
			setState(504); methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); match(Identifier);
			setState(507); formalParameters();
			setState(510);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(508); match(THROWS);
				setState(509); qualifiedNameList();
				}
			}

			setState(512); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); typeParameters();
			setState(515); constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); type();
			setState(518); variableDeclarators();
			setState(519); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(529);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(521); modifier();
						}
						} 
					}
					setState(526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(527); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(528); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMemberDeclaration);
		try {
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531); constDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533); genericInterfaceMethodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535); annotationTypeDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(536); classDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(537); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); type();
			setState(541); constantDeclarator();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(542); match(COMMA);
				setState(543); constantDeclarator();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); match(Identifier);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(552); match(LBRACK);
				setState(553); match(RBRACK);
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559); match(ASSIGN);
			setState(560); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(562); type();
				}
				break;
			case VOID:
				{
				setState(563); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(566); match(Identifier);
			setState(567); formalParameters();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(568); match(LBRACK);
				setState(569); match(RBRACK);
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(575); match(THROWS);
				setState(576); qualifiedNameList();
				}
			}

			setState(579); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); typeParameters();
			setState(582); interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); variableDeclarator();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(585); match(COMMA);
				setState(586); variableDeclarator();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); variableDeclaratorId();
			setState(595);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(593); match(ASSIGN);
				setState(594); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(Identifier);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(598); match(LBRACK);
				setState(599); match(RBRACK);
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableInitializer);
		try {
			setState(607);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(605); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(606); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(LBRACE);
			setState(621);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(610); variableInitializer();
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(611); match(COMMA);
						setState(612); variableInitializer();
						}
						} 
					}
					setState(617);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(619);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(618); match(COMMA);
					}
				}

				}
			}

			setState(623); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_type);
		try {
			int _alt;
			setState(647);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(631); classOrInterfaceType();
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(632); match(LBRACK);
						setState(633); match(RBRACK);
						}
						} 
					}
					setState(638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(639); primitiveType();
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(640); match(LBRACK);
						setState(641); match(RBRACK);
						}
						} 
					}
					setState(646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(KordaptCLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KordaptCLParser.Identifier); }
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649); match(Identifier);
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(650); typeArguments();
				}
				break;
			}
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(653); match(DOT);
					setState(654); match(Identifier);
					setState(656);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(655); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(LT);
			setState(666); typeArgument();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(667); match(COMMA);
				setState(668); typeArgument();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeArgument);
		int _la;
		try {
			setState(682);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(676); type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(677); match(QUESTION);
				setState(680);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(678);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(679); type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); qualifiedName();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(685); match(COMMA);
				setState(686); qualifiedName();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); match(LPAREN);
			setState(694);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(693); formalParameterList();
				}
			}

			setState(696); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(711);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698); formalParameter();
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(699); match(COMMA);
						setState(700); formalParameter();
						}
						} 
					}
					setState(705);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(708);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(706); match(COMMA);
					setState(707); lastFormalParameter();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(713); variableModifier();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719); type();
			setState(720); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(722); variableModifier();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728); type();
			setState(729); match(ELLIPSIS);
			setState(730); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(KordaptCLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KordaptCLParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(Identifier);
			setState(741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(737); match(DOT);
					setState(738); match(Identifier);
					}
					} 
				}
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(KordaptCLParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(KordaptCLParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(KordaptCLParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(KordaptCLParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(KordaptCLParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); match(AT);
			setState(747); annotationName();
			setState(754);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(748); match(LPAREN);
				setState(751);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(749); elementValuePairs();
					}
					break;

				case 2:
					{
					setState(750); elementValue();
					}
					break;
				}
				setState(753); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); elementValuePair();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(759); match(COMMA);
				setState(760); elementValuePair();
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); match(Identifier);
			setState(767); match(ASSIGN);
			setState(768); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValue);
		try {
			setState(773);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(770); expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(771); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(772); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775); match(LBRACE);
			setState(784);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				setState(776); elementValue();
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(777); match(COMMA);
						setState(778); elementValue();
						}
						} 
					}
					setState(783);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
			}

			setState(787);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(786); match(COMMA);
				}
			}

			setState(789); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); match(AT);
			setState(792); match(INTERFACE);
			setState(793); match(Identifier);
			setState(794); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796); match(LBRACE);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(797); annotationTypeElementDeclaration();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(813);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(805); modifier();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(811); annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(812); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationTypeElementRest);
		try {
			setState(835);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(815); type();
				setState(816); annotationMethodOrConstantRest();
				setState(817); match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(819); classDeclaration();
				setState(821);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(820); match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(823); interfaceDeclaration();
				setState(825);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(824); match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(827); enumDeclaration();
				setState(829);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(828); match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(831); annotationTypeDeclaration();
				setState(833);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(832); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationMethodOrConstantRest);
		try {
			setState(839);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837); annotationMethodRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838); annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); match(Identifier);
			setState(842); match(LPAREN);
			setState(843); match(RPAREN);
			setState(845);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(844); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849); match(DEFAULT);
			setState(850); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852); match(LBRACE);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(853); blockStatement();
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blockStatement);
		try {
			setState(864);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863); typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866); localVariableDeclaration();
			setState(867); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(869); variableModifier();
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(875); type();
			setState(876); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public TerminalNode ASSERT() { return getToken(KordaptCLParser.ASSERT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(982);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879); match(ASSERT);
				setState(880); expression(0);
				setState(883);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(881); match(COLON);
					setState(882); expression(0);
					}
				}

				setState(885); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(887); match(IF);
				setState(888); parExpression();
				setState(889); statement();
				setState(892);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(890); match(ELSE);
					setState(891); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(894); match(FOR);
				setState(895); match(LPAREN);
				setState(896); forControl();
				setState(897); match(RPAREN);
				setState(898); statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(900); match(WHILE);
				setState(901); parExpression();
				setState(902); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(904); match(DO);
				setState(905); statement();
				setState(906); match(WHILE);
				setState(907); parExpression();
				setState(908); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(910); match(TRY);
				setState(911); block();
				setState(921);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(913); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(912); catchClause();
						}
						}
						setState(915); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(918);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(917); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(920); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(923); match(TRY);
				setState(924); resourceSpecification();
				setState(925); block();
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(926); catchClause();
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(933);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(932); finallyBlock();
					}
				}

				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(935); match(SWITCH);
				setState(936); parExpression();
				setState(937); match(LBRACE);
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(938); switchBlockStatementGroup();
						}
						} 
					}
					setState(943);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(944); switchLabel();
					}
					}
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(950); match(RBRACE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(952); match(SYNCHRONIZED);
				setState(953); parExpression();
				setState(954); block();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(956); match(RETURN);
				setState(958);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(957); expression(0);
					}
				}

				setState(960); match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(961); match(THROW);
				setState(962); expression(0);
				setState(963); match(SEMI);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(965); match(BREAK);
				setState(967);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(966); match(Identifier);
					}
				}

				setState(969); match(SEMI);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(970); match(CONTINUE);
				setState(972);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(971); match(Identifier);
					}
				}

				setState(974); match(SEMI);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(975); match(SEMI);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(976); statementExpression();
				setState(977); match(SEMI);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(979); match(Identifier);
				setState(980); match(COLON);
				setState(981); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984); match(CATCH);
			setState(985); match(LPAREN);
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(986); variableModifier();
				}
				}
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(992); catchType();
			setState(993); match(Identifier);
			setState(994); match(RPAREN);
			setState(995); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); qualifiedName();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(998); match(BITOR);
				setState(999); qualifiedName();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); match(FINALLY);
			setState(1006); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008); match(LPAREN);
			setState(1009); resources();
			setState(1011);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1010); match(SEMI);
				}
			}

			setState(1013); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015); resource();
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1016); match(SEMI);
					setState(1017); resource();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1023); variableModifier();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1029); classOrInterfaceType();
			setState(1030); variableDeclaratorId();
			setState(1031); match(ASSIGN);
			setState(1032); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1034); switchLabel();
				}
				}
				setState(1037); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039); blockStatement();
				}
				}
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_switchLabel);
		try {
			setState(1054);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044); match(CASE);
				setState(1045); constantExpression();
				setState(1046); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048); match(CASE);
				setState(1049); enumConstantName();
				setState(1050); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1052); match(DEFAULT);
				setState(1053); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forControl);
		int _la;
		try {
			setState(1068);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056); enhancedForControl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
					{
					setState(1057); forInit();
					}
				}

				setState(1060); match(SEMI);
				setState(1062);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1061); expression(0);
					}
				}

				setState(1064); match(SEMI);
				setState(1066);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1065); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forInit);
		try {
			setState(1072);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1074); variableModifier();
				}
				}
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1080); type();
			setState(1081); match(Identifier);
			setState(1082); match(COLON);
			setState(1083); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); match(LPAREN);
			setState(1088); expression(0);
			setState(1089); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); expression(0);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1092); match(COMMA);
				setState(1093); expression(0);
				}
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 190;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1104); match(LPAREN);
				setState(1105); type();
				setState(1106); match(RPAREN);
				setState(1107); expression(17);
				}
				break;

			case 2:
				{
				setState(1109);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1110); expression(15);
				}
				break;

			case 3:
				{
				setState(1111);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1112); expression(14);
				}
				break;

			case 4:
				{
				setState(1113); primary();
				}
				break;

			case 5:
				{
				setState(1114); match(NEW);
				setState(1115); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1214);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1118);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1119);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1120); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1121);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1122);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1123); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1132);
						switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
						case 1:
							{
							setState(1125); match(LT);
							setState(1126); match(LT);
							}
							break;

						case 2:
							{
							setState(1127); match(GT);
							setState(1128); match(GT);
							setState(1129); match(GT);
							}
							break;

						case 3:
							{
							setState(1130); match(GT);
							setState(1131); match(GT);
							}
							break;
						}
						setState(1134); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1136);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1137); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1139);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1140); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1142); match(BITAND);
						setState(1143); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1145); match(CARET);
						setState(1146); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1148); match(BITOR);
						setState(1149); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1151); match(AND);
						setState(1152); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1153);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1154); match(OR);
						setState(1155); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1169);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(1157); match(ASSIGN);
							}
							break;
						case ADD_ASSIGN:
							{
							setState(1158); match(ADD_ASSIGN);
							}
							break;
						case SUB_ASSIGN:
							{
							setState(1159); match(SUB_ASSIGN);
							}
							break;
						case MUL_ASSIGN:
							{
							setState(1160); match(MUL_ASSIGN);
							}
							break;
						case DIV_ASSIGN:
							{
							setState(1161); match(DIV_ASSIGN);
							}
							break;
						case AND_ASSIGN:
							{
							setState(1162); match(AND_ASSIGN);
							}
							break;
						case OR_ASSIGN:
							{
							setState(1163); match(OR_ASSIGN);
							}
							break;
						case XOR_ASSIGN:
							{
							setState(1164); match(XOR_ASSIGN);
							}
							break;
						case RSHIFT_ASSIGN:
							{
							setState(1165); match(RSHIFT_ASSIGN);
							}
							break;
						case URSHIFT_ASSIGN:
							{
							setState(1166); match(URSHIFT_ASSIGN);
							}
							break;
						case LSHIFT_ASSIGN:
							{
							setState(1167); match(LSHIFT_ASSIGN);
							}
							break;
						case MOD_ASSIGN:
							{
							setState(1168); match(MOD_ASSIGN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1171); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1173); match(QUESTION);
						setState(1174); expression(0);
						setState(1175); match(COLON);
						setState(1176); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1179); match(DOT);
						setState(1180); match(Identifier);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1182); match(DOT);
						setState(1183); match(THIS);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1185); match(DOT);
						setState(1186); match(NEW);
						setState(1188);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1187); nonWildcardTypeArguments();
							}
						}

						setState(1190); innerCreator();
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1191);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(1192); match(DOT);
						setState(1193); match(SUPER);
						setState(1194); superSuffix();
						}
						break;

					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(1196); match(DOT);
						setState(1197); explicitGenericInvocation();
						}
						break;

					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(1199); match(LBRACK);
						setState(1200); expression(0);
						setState(1201); match(RBRACK);
						}
						break;

					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1203);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(1204); match(LPAREN);
						setState(1206);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
							{
							setState(1205); expressionList();
							}
						}

						setState(1208); match(RPAREN);
						}
						break;

					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(1210);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1211);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1212); match(INSTANCEOF);
						setState(1213); type();
						}
						break;
					}
					} 
				}
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_primary);
		try {
			setState(1240);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219); match(LPAREN);
				setState(1220); expression(0);
				setState(1221); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223); match(THIS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1224); match(SUPER);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1225); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1226); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1227); type();
				setState(1228); match(DOT);
				setState(1229); match(CLASS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1231); match(VOID);
				setState(1232); match(DOT);
				setState(1233); match(CLASS);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1234); nonWildcardTypeArguments();
				setState(1238);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1235); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1236); match(THIS);
					setState(1237); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_creator);
		try {
			setState(1251);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242); nonWildcardTypeArguments();
				setState(1243); createdName();
				setState(1244); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246); createdName();
				setState(1249);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1247); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1248); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(KordaptCLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KordaptCLParser.Identifier); }
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_createdName);
		int _la;
		try {
			setState(1268);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253); match(Identifier);
				setState(1255);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1254); typeArgumentsOrDiamond();
					}
				}

				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1257); match(DOT);
					setState(1258); match(Identifier);
					setState(1260);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1259); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270); match(Identifier);
			setState(1272);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1271); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1274); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1276); match(LBRACK);
			setState(1304);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1277); match(RBRACK);
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1278); match(LBRACK);
					setState(1279); match(RBRACK);
					}
					}
					setState(1284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1285); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1286); expression(0);
				setState(1287); match(RBRACK);
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1288); match(LBRACK);
						setState(1289); expression(0);
						setState(1290); match(RBRACK);
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1297); match(LBRACK);
						setState(1298); match(RBRACK);
						}
						} 
					}
					setState(1303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306); arguments();
			setState(1308);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1307); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310); nonWildcardTypeArguments();
			setState(1311); explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313); match(LT);
			setState(1314); typeList();
			setState(1315); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_typeArgumentsOrDiamond);
		try {
			setState(1320);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317); match(LT);
				setState(1318); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319); typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1325);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322); match(LT);
				setState(1323); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324); nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_superSuffix);
		try {
			setState(1333);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328); match(DOT);
				setState(1329); match(Identifier);
				setState(1331);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1330); arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KordaptCLParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1339);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335); match(SUPER);
				setState(1336); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337); match(Identifier);
				setState(1338); arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KordaptCLListener ) ((KordaptCLListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341); match(LPAREN);
			setState(1343);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(1342); expressionList();
				}
			}

			setState(1345); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 95: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 12: return 25 >= _localctx._p;

		case 13: return 24 >= _localctx._p;

		case 14: return 23 >= _localctx._p;

		case 15: return 22 >= _localctx._p;

		case 17: return 20 >= _localctx._p;

		case 16: return 21 >= _localctx._p;

		case 19: return 16 >= _localctx._p;

		case 18: return 19 >= _localctx._p;

		case 20: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3k\u0546\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\5\2\u00df\n\2\3\3\3\3\7\3\u00e3\n\3\f\3\16"+
		"\3\u00e6\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u00ef\n\5\3\6\3\6\3\6\5"+
		"\6\u00f4\n\6\3\6\3\6\7\6\u00f8\n\6\f\6\16\6\u00fb\13\6\3\7\3\7\3\7\3\7"+
		"\3\b\5\b\u0102\n\b\3\b\7\b\u0105\n\b\f\b\16\b\u0108\13\b\3\b\7\b\u010b"+
		"\n\b\f\b\16\b\u010e\13\b\3\b\3\b\3\t\7\t\u0113\n\t\f\t\16\t\u0116\13\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u011e\n\n\3\n\3\n\3\n\5\n\u0123\n\n\3\n\3"+
		"\n\3\13\7\13\u0128\n\13\f\13\16\13\u012b\13\13\3\13\3\13\7\13\u012f\n"+
		"\13\f\13\16\13\u0132\13\13\3\13\3\13\7\13\u0136\n\13\f\13\16\13\u0139"+
		"\13\13\3\13\3\13\7\13\u013d\n\13\f\13\16\13\u0140\13\13\3\13\3\13\5\13"+
		"\u0144\n\13\3\f\3\f\5\f\u0148\n\f\3\r\3\r\5\r\u014c\n\r\3\16\3\16\5\16"+
		"\u0150\n\16\3\17\3\17\3\17\5\17\u0155\n\17\3\17\3\17\5\17\u0159\n\17\3"+
		"\17\3\17\5\17\u015d\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0165\n\20"+
		"\f\20\16\20\u0168\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u016f\n\21\3\22"+
		"\3\22\3\22\7\22\u0174\n\22\f\22\16\22\u0177\13\22\3\23\3\23\3\23\3\23"+
		"\5\23\u017d\n\23\3\23\3\23\5\23\u0181\n\23\3\23\5\23\u0184\n\23\3\23\5"+
		"\23\u0187\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u018e\n\24\f\24\16\24\u0191"+
		"\13\24\3\25\7\25\u0194\n\25\f\25\16\25\u0197\13\25\3\25\3\25\5\25\u019b"+
		"\n\25\3\25\5\25\u019e\n\25\3\26\3\26\7\26\u01a2\n\26\f\26\16\26\u01a5"+
		"\13\26\3\27\3\27\3\27\5\27\u01aa\n\27\3\27\3\27\5\27\u01ae\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\7\30\u01b5\n\30\f\30\16\30\u01b8\13\30\3\31\3\31\7"+
		"\31\u01bc\n\31\f\31\16\31\u01bf\13\31\3\31\3\31\3\32\3\32\7\32\u01c5\n"+
		"\32\f\32\16\32\u01c8\13\32\3\32\3\32\3\33\3\33\5\33\u01ce\n\33\3\33\3"+
		"\33\7\33\u01d2\n\33\f\33\16\33\u01d5\13\33\3\33\5\33\u01d8\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01e3\n\34\3\35\3\35\5\35"+
		"\u01e7\n\35\3\35\3\35\3\35\3\35\7\35\u01ed\n\35\f\35\16\35\u01f0\13\35"+
		"\3\35\3\35\5\35\u01f4\n\35\3\35\3\35\5\35\u01f8\n\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\5\37\u0201\n\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\""+
		"\7\"\u020d\n\"\f\"\16\"\u0210\13\"\3\"\3\"\5\"\u0214\n\"\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u021d\n#\3$\3$\3$\3$\7$\u0223\n$\f$\16$\u0226\13$\3$\3$\3%"+
		"\3%\3%\7%\u022d\n%\f%\16%\u0230\13%\3%\3%\3%\3&\3&\5&\u0237\n&\3&\3&\3"+
		"&\3&\7&\u023d\n&\f&\16&\u0240\13&\3&\3&\5&\u0244\n&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\7(\u024e\n(\f(\16(\u0251\13(\3)\3)\3)\5)\u0256\n)\3*\3*\3*\7"+
		"*\u025b\n*\f*\16*\u025e\13*\3+\3+\5+\u0262\n+\3,\3,\3,\3,\7,\u0268\n,"+
		"\f,\16,\u026b\13,\3,\5,\u026e\n,\5,\u0270\n,\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\60\7\60\u027d\n\60\f\60\16\60\u0280\13\60\3\60\3\60\3\60\7"+
		"\60\u0285\n\60\f\60\16\60\u0288\13\60\5\60\u028a\n\60\3\61\3\61\5\61\u028e"+
		"\n\61\3\61\3\61\3\61\5\61\u0293\n\61\7\61\u0295\n\61\f\61\16\61\u0298"+
		"\13\61\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u02a0\n\63\f\63\16\63\u02a3"+
		"\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u02ab\n\64\5\64\u02ad\n\64\3"+
		"\65\3\65\3\65\7\65\u02b2\n\65\f\65\16\65\u02b5\13\65\3\66\3\66\5\66\u02b9"+
		"\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u02c0\n\67\f\67\16\67\u02c3\13\67"+
		"\3\67\3\67\5\67\u02c7\n\67\3\67\5\67\u02ca\n\67\38\78\u02cd\n8\f8\168"+
		"\u02d0\138\38\38\38\39\79\u02d6\n9\f9\169\u02d9\139\39\39\39\39\3:\3:"+
		"\3;\3;\3<\3<\3<\7<\u02e6\n<\f<\16<\u02e9\13<\3=\3=\3>\3>\3>\3>\3>\5>\u02f2"+
		"\n>\3>\5>\u02f5\n>\3?\3?\3@\3@\3@\7@\u02fc\n@\f@\16@\u02ff\13@\3A\3A\3"+
		"A\3A\3B\3B\3B\5B\u0308\nB\3C\3C\3C\3C\7C\u030e\nC\fC\16C\u0311\13C\5C"+
		"\u0313\nC\3C\5C\u0316\nC\3C\3C\3D\3D\3D\3D\3D\3E\3E\7E\u0321\nE\fE\16"+
		"E\u0324\13E\3E\3E\3F\7F\u0329\nF\fF\16F\u032c\13F\3F\3F\5F\u0330\nF\3"+
		"G\3G\3G\3G\3G\3G\5G\u0338\nG\3G\3G\5G\u033c\nG\3G\3G\5G\u0340\nG\3G\3"+
		"G\5G\u0344\nG\5G\u0346\nG\3H\3H\5H\u034a\nH\3I\3I\3I\3I\5I\u0350\nI\3"+
		"J\3J\3K\3K\3K\3L\3L\7L\u0359\nL\fL\16L\u035c\13L\3L\3L\3M\3M\3M\5M\u0363"+
		"\nM\3N\3N\3N\3O\7O\u0369\nO\fO\16O\u036c\13O\3O\3O\3O\3P\3P\3P\3P\3P\5"+
		"P\u0376\nP\3P\3P\3P\3P\3P\3P\3P\5P\u037f\nP\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\6P\u0394\nP\rP\16P\u0395\3P\5P\u0399\n"+
		"P\3P\5P\u039c\nP\3P\3P\3P\3P\7P\u03a2\nP\fP\16P\u03a5\13P\3P\5P\u03a8"+
		"\nP\3P\3P\3P\3P\7P\u03ae\nP\fP\16P\u03b1\13P\3P\7P\u03b4\nP\fP\16P\u03b7"+
		"\13P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u03c1\nP\3P\3P\3P\3P\3P\3P\3P\5P\u03ca"+
		"\nP\3P\3P\3P\5P\u03cf\nP\3P\3P\3P\3P\3P\3P\3P\3P\5P\u03d9\nP\3Q\3Q\3Q"+
		"\7Q\u03de\nQ\fQ\16Q\u03e1\13Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u03eb\nR\fR\16"+
		"R\u03ee\13R\3S\3S\3S\3T\3T\3T\5T\u03f6\nT\3T\3T\3U\3U\3U\7U\u03fd\nU\f"+
		"U\16U\u0400\13U\3V\7V\u0403\nV\fV\16V\u0406\13V\3V\3V\3V\3V\3V\3W\6W\u040e"+
		"\nW\rW\16W\u040f\3W\6W\u0413\nW\rW\16W\u0414\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\5X\u0421\nX\3Y\3Y\5Y\u0425\nY\3Y\3Y\5Y\u0429\nY\3Y\3Y\5Y\u042d\n"+
		"Y\5Y\u042f\nY\3Z\3Z\5Z\u0433\nZ\3[\7[\u0436\n[\f[\16[\u0439\13[\3[\3["+
		"\3[\3[\3[\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\7^\u0449\n^\f^\16^\u044c\13^\3"+
		"_\3_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u045f\na\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u046f\na\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\5a\u0494\na\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\5a\u04a7\na\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5"+
		"a\u04b9\na\3a\3a\3a\3a\3a\3a\7a\u04c1\na\fa\16a\u04c4\13a\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u04d9\nb\5b\u04db\nb"+
		"\3c\3c\3c\3c\3c\3c\3c\5c\u04e4\nc\5c\u04e6\nc\3d\3d\5d\u04ea\nd\3d\3d"+
		"\3d\5d\u04ef\nd\7d\u04f1\nd\fd\16d\u04f4\13d\3d\5d\u04f7\nd\3e\3e\5e\u04fb"+
		"\ne\3e\3e\3f\3f\3f\3f\7f\u0503\nf\ff\16f\u0506\13f\3f\3f\3f\3f\3f\3f\3"+
		"f\7f\u050f\nf\ff\16f\u0512\13f\3f\3f\7f\u0516\nf\ff\16f\u0519\13f\5f\u051b"+
		"\nf\3g\3g\5g\u051f\ng\3h\3h\3h\3i\3i\3i\3i\3j\3j\3j\5j\u052b\nj\3k\3k"+
		"\3k\5k\u0530\nk\3l\3l\3l\3l\5l\u0536\nl\5l\u0538\nl\3m\3m\3m\3m\5m\u053e"+
		"\nm\3n\3n\5n\u0542\nn\3n\3n\3n\2o\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\2\16\6\2  ,,\60\60\63"+
		"\63\6\2\3\3\24\24#%()\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\4\2"+
		"\23\23**\3\2\65:\3\2QT\3\2GH\4\2UVZZ\3\2ST\4\2EFLM\4\2KKNN\3\2QR\u05c0"+
		"\2\u00de\3\2\2\2\4\u00e0\3\2\2\2\6\u00e7\3\2\2\2\b\u00ee\3\2\2\2\n\u00f3"+
		"\3\2\2\2\f\u00fc\3\2\2\2\16\u0101\3\2\2\2\20\u0114\3\2\2\2\22\u011b\3"+
		"\2\2\2\24\u0143\3\2\2\2\26\u0147\3\2\2\2\30\u014b\3\2\2\2\32\u014f\3\2"+
		"\2\2\34\u0151\3\2\2\2\36\u0160\3\2\2\2 \u016b\3\2\2\2\"\u0170\3\2\2\2"+
		"$\u0178\3\2\2\2&\u018a\3\2\2\2(\u0195\3\2\2\2*\u019f\3\2\2\2,\u01a6\3"+
		"\2\2\2.\u01b1\3\2\2\2\60\u01b9\3\2\2\2\62\u01c2\3\2\2\2\64\u01d7\3\2\2"+
		"\2\66\u01e2\3\2\2\28\u01e6\3\2\2\2:\u01f9\3\2\2\2<\u01fc\3\2\2\2>\u0204"+
		"\3\2\2\2@\u0207\3\2\2\2B\u0213\3\2\2\2D\u021c\3\2\2\2F\u021e\3\2\2\2H"+
		"\u0229\3\2\2\2J\u0236\3\2\2\2L\u0247\3\2\2\2N\u024a\3\2\2\2P\u0252\3\2"+
		"\2\2R\u0257\3\2\2\2T\u0261\3\2\2\2V\u0263\3\2\2\2X\u0273\3\2\2\2Z\u0275"+
		"\3\2\2\2\\\u0277\3\2\2\2^\u0289\3\2\2\2`\u028b\3\2\2\2b\u0299\3\2\2\2"+
		"d\u029b\3\2\2\2f\u02ac\3\2\2\2h\u02ae\3\2\2\2j\u02b6\3\2\2\2l\u02c9\3"+
		"\2\2\2n\u02ce\3\2\2\2p\u02d7\3\2\2\2r\u02de\3\2\2\2t\u02e0\3\2\2\2v\u02e2"+
		"\3\2\2\2x\u02ea\3\2\2\2z\u02ec\3\2\2\2|\u02f6\3\2\2\2~\u02f8\3\2\2\2\u0080"+
		"\u0300\3\2\2\2\u0082\u0307\3\2\2\2\u0084\u0309\3\2\2\2\u0086\u0319\3\2"+
		"\2\2\u0088\u031e\3\2\2\2\u008a\u032f\3\2\2\2\u008c\u0345\3\2\2\2\u008e"+
		"\u0349\3\2\2\2\u0090\u034b\3\2\2\2\u0092\u0351\3\2\2\2\u0094\u0353\3\2"+
		"\2\2\u0096\u0356\3\2\2\2\u0098\u0362\3\2\2\2\u009a\u0364\3\2\2\2\u009c"+
		"\u036a\3\2\2\2\u009e\u03d8\3\2\2\2\u00a0\u03da\3\2\2\2\u00a2\u03e7\3\2"+
		"\2\2\u00a4\u03ef\3\2\2\2\u00a6\u03f2\3\2\2\2\u00a8\u03f9\3\2\2\2\u00aa"+
		"\u0404\3\2\2\2\u00ac\u040d\3\2\2\2\u00ae\u0420\3\2\2\2\u00b0\u042e\3\2"+
		"\2\2\u00b2\u0432\3\2\2\2\u00b4\u0437\3\2\2\2\u00b6\u043f\3\2\2\2\u00b8"+
		"\u0441\3\2\2\2\u00ba\u0445\3\2\2\2\u00bc\u044d\3\2\2\2\u00be\u044f\3\2"+
		"\2\2\u00c0\u045e\3\2\2\2\u00c2\u04da\3\2\2\2\u00c4\u04e5\3\2\2\2\u00c6"+
		"\u04f6\3\2\2\2\u00c8\u04f8\3\2\2\2\u00ca\u04fe\3\2\2\2\u00cc\u051c\3\2"+
		"\2\2\u00ce\u0520\3\2\2\2\u00d0\u0523\3\2\2\2\u00d2\u052a\3\2\2\2\u00d4"+
		"\u052f\3\2\2\2\u00d6\u0537\3\2\2\2\u00d8\u053d\3\2\2\2\u00da\u053f\3\2"+
		"\2\2\u00dc\u00df\5\4\3\2\u00dd\u00df\5\n\6\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\3\3\2\2\2\u00e0\u00e4\5v<\2\u00e1\u00e3\5\6\4\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\5\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5\b\5\2\u00e8\u00e9"+
		"\7J\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\5j\66\2\u00eb\7\3\2\2\2\u00ec\u00ef"+
		"\5^\60\2\u00ed\u00ef\7\62\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\t\3\2\2\2\u00f0\u00f1\5^\60\2\u00f1\u00f2\7J\2\2\u00f2\u00f4\3"+
		"\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f9\5v<\2\u00f6\u00f8\5\f\7\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\13\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\5^\60\2\u00fd\u00fe\7J\2\2\u00fe\u00ff\7f\2\2\u00ff"+
		"\r\3\2\2\2\u0100\u0102\5\20\t\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2"+
		"\2\u0102\u0106\3\2\2\2\u0103\u0105\5\22\n\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010c\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u010b\5\24\13\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\2\2\3\u0110\17\3\2\2\2\u0111\u0113"+
		"\5z>\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\""+
		"\2\2\u0118\u0119\5v<\2\u0119\u011a\7A\2\2\u011a\21\3\2\2\2\u011b\u011d"+
		"\7\33\2\2\u011c\u011e\7(\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0122\5v<\2\u0120\u0121\7C\2\2\u0121\u0123\7U\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\7A\2\2\u0125\23\3\2\2\2\u0126\u0128\5\30\r\2\u0127\u0126\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u0144\5\34\17\2\u012d\u012f\5\30\r\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0144\5$\23\2\u0134"+
		"\u0136\5\30\r\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u0144\5,\27\2\u013b\u013d\5\30\r\2\u013c\u013b\3\2\2\2\u013d\u0140\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0144\5\u0086D\2\u0142\u0144\7A\2\2\u0143\u0129\3"+
		"\2\2\2\u0143\u0130\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\25\3\2\2\2\u0145\u0148\5\30\r\2\u0146\u0148\t\2\2"+
		"\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\27\3\2\2\2\u0149\u014c"+
		"\5z>\2\u014a\u014c\t\3\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\31\3\2\2\2\u014d\u0150\7\24\2\2\u014e\u0150\5z>\2\u014f\u014d\3\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\33\3\2\2\2\u0151\u0152\7\13\2\2\u0152\u0154"+
		"\7f\2\2\u0153\u0155\5\36\20\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0158\3\2\2\2\u0156\u0157\7\23\2\2\u0157\u0159\5^\60\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015b\7\32\2\2"+
		"\u015b\u015d\5.\30\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u015f\5\60\31\2\u015f\35\3\2\2\2\u0160\u0161\7F\2\2\u0161"+
		"\u0166\5 \21\2\u0162\u0163\7B\2\2\u0163\u0165\5 \21\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7E\2\2\u016a\37\3\2\2\2"+
		"\u016b\u016e\7f\2\2\u016c\u016d\7\23\2\2\u016d\u016f\5\"\22\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f!\3\2\2\2\u0170\u0175\5^\60\2\u0171"+
		"\u0172\7W\2\2\u0172\u0174\5^\60\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176#\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0179\7\22\2\2\u0179\u017c\7f\2\2\u017a\u017b\7\32\2\2"+
		"\u017b\u017d\5.\30\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0180\7=\2\2\u017f\u0181\5&\24\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\7B\2\2\u0183\u0182\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\5*\26\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7>"+
		"\2\2\u0189%\3\2\2\2\u018a\u018f\5(\25\2\u018b\u018c\7B\2\2\u018c\u018e"+
		"\5(\25\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\'\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\5z>\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7f\2\2\u0199"+
		"\u019b\5\u00dan\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d"+
		"\3\2\2\2\u019c\u019e\5\60\31\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2"+
		"\u019e)\3\2\2\2\u019f\u01a3\7A\2\2\u01a0\u01a2\5\64\33\2\u01a1\u01a0\3"+
		"\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"+\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7\36\2\2\u01a7\u01a9\7f\2\2"+
		"\u01a8\u01aa\5\36\20\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad"+
		"\3\2\2\2\u01ab\u01ac\7\23\2\2\u01ac\u01ae\5.\30\2\u01ad\u01ab\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\5\62\32\2\u01b0-"+
		"\3\2\2\2\u01b1\u01b6\5^\60\2\u01b2\u01b3\7B\2\2\u01b3\u01b5\5^\60\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7/\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bd\7=\2\2\u01ba\u01bc"+
		"\5\64\33\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2"+
		"\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1"+
		"\7>\2\2\u01c1\61\3\2\2\2\u01c2\u01c6\7=\2\2\u01c3\u01c5\5B\"\2\u01c4\u01c3"+
		"\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7>\2\2\u01ca\63\3\2\2\2"+
		"\u01cb\u01d8\7A\2\2\u01cc\u01ce\7(\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d8\5\u0096L\2\u01d0\u01d2\5\26\f"+
		"\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\5\66\34\2"+
		"\u01d7\u01cb\3\2\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d8\65"+
		"\3\2\2\2\u01d9\u01e3\58\35\2\u01da\u01e3\5:\36\2\u01db\u01e3\5@!\2\u01dc"+
		"\u01e3\5<\37\2\u01dd\u01e3\5> \2\u01de\u01e3\5,\27\2\u01df\u01e3\5\u0086"+
		"D\2\u01e0\u01e3\5\34\17\2\u01e1\u01e3\5$\23\2\u01e2\u01d9\3\2\2\2\u01e2"+
		"\u01da\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01dd\3\2"+
		"\2\2\u01e2\u01de\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\67\3\2\2\2\u01e4\u01e7\5^\60\2\u01e5\u01e7\7\62\2"+
		"\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9"+
		"\7f\2\2\u01e9\u01ee\5j\66\2\u01ea\u01eb\7?\2\2\u01eb\u01ed\7@\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f3\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7/\2\2\u01f2"+
		"\u01f4\5h\65\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2"+
		"\2\2\u01f5\u01f8\5r:\2\u01f6\u01f8\7A\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6"+
		"\3\2\2\2\u01f89\3\2\2\2\u01f9\u01fa\5\36\20\2\u01fa\u01fb\58\35\2\u01fb"+
		";\3\2\2\2\u01fc\u01fd\7f\2\2\u01fd\u0200\5j\66\2\u01fe\u01ff\7/\2\2\u01ff"+
		"\u0201\5h\65\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0203\5t;\2\u0203=\3\2\2\2\u0204\u0205\5\36\20\2\u0205\u0206"+
		"\5<\37\2\u0206?\3\2\2\2\u0207\u0208\5^\60\2\u0208\u0209\5N(\2\u0209\u020a"+
		"\7A\2\2\u020aA\3\2\2\2\u020b\u020d\5\26\f\2\u020c\u020b\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0211\u0214\5D#\2\u0212\u0214\7A\2\2\u0213\u020e"+
		"\3\2\2\2\u0213\u0212\3\2\2\2\u0214C\3\2\2\2\u0215\u021d\5F$\2\u0216\u021d"+
		"\5J&\2\u0217\u021d\5L\'\2\u0218\u021d\5,\27\2\u0219\u021d\5\u0086D\2\u021a"+
		"\u021d\5\34\17\2\u021b\u021d\5$\23\2\u021c\u0215\3\2\2\2\u021c\u0216\3"+
		"\2\2\2\u021c\u0217\3\2\2\2\u021c\u0218\3\2\2\2\u021c\u0219\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021dE\3\2\2\2\u021e\u021f\5^\60\2"+
		"\u021f\u0224\5H%\2\u0220\u0221\7B\2\2\u0221\u0223\5H%\2\u0222\u0220\3"+
		"\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7A\2\2\u0228G\3\2\2\2\u0229"+
		"\u022e\7f\2\2\u022a\u022b\7?\2\2\u022b\u022d\7@\2\2\u022c\u022a\3\2\2"+
		"\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231"+
		"\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\7D\2\2\u0232\u0233\5T+\2\u0233"+
		"I\3\2\2\2\u0234\u0237\5^\60\2\u0235\u0237\7\62\2\2\u0236\u0234\3\2\2\2"+
		"\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7f\2\2\u0239\u023e"+
		"\5j\66\2\u023a\u023b\7?\2\2\u023b\u023d\7@\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0243\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0241\u0242\7/\2\2\u0242\u0244\5h\65\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7A"+
		"\2\2\u0246K\3\2\2\2\u0247\u0248\5\36\20\2\u0248\u0249\5J&\2\u0249M\3\2"+
		"\2\2\u024a\u024f\5P)\2\u024b\u024c\7B\2\2\u024c\u024e\5P)\2\u024d\u024b"+
		"\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"O\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0255\5R*\2\u0253\u0254\7D\2\2\u0254"+
		"\u0256\5T+\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256Q\3\2\2\2\u0257"+
		"\u025c\7f\2\2\u0258\u0259\7?\2\2\u0259\u025b\7@\2\2\u025a\u0258\3\2\2"+
		"\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025dS"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0262\5V,\2\u0260\u0262\5\u00c0a\2"+
		"\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262U\3\2\2\2\u0263\u026f\7"+
		"=\2\2\u0264\u0269\5T+\2\u0265\u0266\7B\2\2\u0266\u0268\5T+\2\u0267\u0265"+
		"\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026e\7B\2\2\u026d\u026c\3\2"+
		"\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0264\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\7>\2\2\u0272W\3\2\2\2\u0273"+
		"\u0274\5v<\2\u0274Y\3\2\2\2\u0275\u0276\7f\2\2\u0276[\3\2\2\2\u0277\u0278"+
		"\5v<\2\u0278]\3\2\2\2\u0279\u027e\5`\61\2\u027a\u027b\7?\2\2\u027b\u027d"+
		"\7@\2\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u028a\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0286\5b"+
		"\62\2\u0282\u0283\7?\2\2\u0283\u0285\7@\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028a\3\2"+
		"\2\2\u0288\u0286\3\2\2\2\u0289\u0279\3\2\2\2\u0289\u0281\3\2\2\2\u028a"+
		"_\3\2\2\2\u028b\u028d\7f\2\2\u028c\u028e\5d\63\2\u028d\u028c\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0296\3\2\2\2\u028f\u0290\7C\2\2\u0290\u0292\7f\2"+
		"\2\u0291\u0293\5d\63\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295"+
		"\3\2\2\2\u0294\u028f\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297a\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\t\4\2\2"+
		"\u029ac\3\2\2\2\u029b\u029c\7F\2\2\u029c\u02a1\5f\64\2\u029d\u029e\7B"+
		"\2\2\u029e\u02a0\5f\64\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a4\u02a5\7E\2\2\u02a5e\3\2\2\2\u02a6\u02ad\5^\60\2\u02a7\u02aa"+
		"\7I\2\2\u02a8\u02a9\t\5\2\2\u02a9\u02ab\5^\60\2\u02aa\u02a8\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac\u02a7\3\2"+
		"\2\2\u02adg\3\2\2\2\u02ae\u02b3\5v<\2\u02af\u02b0\7B\2\2\u02b0\u02b2\5"+
		"v<\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4i\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b8\7;\2\2\u02b7"+
		"\u02b9\5l\67\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\7<\2\2\u02bbk\3\2\2\2\u02bc\u02c1\5n8\2\u02bd\u02be\7"+
		"B\2\2\u02be\u02c0\5n8\2\u02bf\u02bd\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c6\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c4\u02c5\7B\2\2\u02c5\u02c7\5p9\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02ca\5p9\2\u02c9\u02bc\3\2\2\2\u02c9"+
		"\u02c8\3\2\2\2\u02cam\3\2\2\2\u02cb\u02cd\5\32\16\2\u02cc\u02cb\3\2\2"+
		"\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\5^\60\2\u02d2\u02d3\5R*\2\u02d3"+
		"o\3\2\2\2\u02d4\u02d6\5\32\16\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2"+
		"\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02da\u02db\5^\60\2\u02db\u02dc\7h\2\2\u02dc\u02dd\5R*\2\u02dd"+
		"q\3\2\2\2\u02de\u02df\5\u0096L\2\u02dfs\3\2\2\2\u02e0\u02e1\5\u0096L\2"+
		"\u02e1u\3\2\2\2\u02e2\u02e7\7f\2\2\u02e3\u02e4\7C\2\2\u02e4\u02e6\7f\2"+
		"\2\u02e5\u02e3\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8w\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb\t\6\2\2\u02eb"+
		"y\3\2\2\2\u02ec\u02ed\7g\2\2\u02ed\u02f4\5|?\2\u02ee\u02f1\7;\2\2\u02ef"+
		"\u02f2\5~@\2\u02f0\u02f2\5\u0082B\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0\3"+
		"\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\7<\2\2\u02f4"+
		"\u02ee\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5{\3\2\2\2\u02f6\u02f7\5v<\2\u02f7"+
		"}\3\2\2\2\u02f8\u02fd\5\u0080A\2\u02f9\u02fa\7B\2\2\u02fa\u02fc\5\u0080"+
		"A\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\177\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0301\7f\2"+
		"\2\u0301\u0302\7D\2\2\u0302\u0303\5\u0082B\2\u0303\u0081\3\2\2\2\u0304"+
		"\u0308\5\u00c0a\2\u0305\u0308\5z>\2\u0306\u0308\5\u0084C\2\u0307\u0304"+
		"\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308\u0083\3\2\2\2\u0309"+
		"\u0312\7=\2\2\u030a\u030f\5\u0082B\2\u030b\u030c\7B\2\2\u030c\u030e\5"+
		"\u0082B\2\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2"+
		"\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u030a"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0316\7B\2\2\u0315"+
		"\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7>"+
		"\2\2\u0318\u0085\3\2\2\2\u0319\u031a\7g\2\2\u031a\u031b\7\36\2\2\u031b"+
		"\u031c\7f\2\2\u031c\u031d\5\u0088E\2\u031d\u0087\3\2\2\2\u031e\u0322\7"+
		"=\2\2\u031f\u0321\5\u008aF\2\u0320\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0325\u0326\7>\2\2\u0326\u0089\3\2\2\2\u0327\u0329\5\26\f\2\u0328"+
		"\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u0330\5\u008cG\2\u032e"+
		"\u0330\7A\2\2\u032f\u032a\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u008b\3\2"+
		"\2\2\u0331\u0332\5^\60\2\u0332\u0333\5\u008eH\2\u0333\u0334\7A\2\2\u0334"+
		"\u0346\3\2\2\2\u0335\u0337\5\34\17\2\u0336\u0338\7A\2\2\u0337\u0336\3"+
		"\2\2\2\u0337\u0338\3\2\2\2\u0338\u0346\3\2\2\2\u0339\u033b\5,\27\2\u033a"+
		"\u033c\7A\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u0346\3\2"+
		"\2\2\u033d\u033f\5$\23\2\u033e\u0340\7A\2\2\u033f\u033e\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0346\3\2\2\2\u0341\u0343\5\u0086D\2\u0342\u0344"+
		"\7A\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345"+
		"\u0331\3\2\2\2\u0345\u0335\3\2\2\2\u0345\u0339\3\2\2\2\u0345\u033d\3\2"+
		"\2\2\u0345\u0341\3\2\2\2\u0346\u008d\3\2\2\2\u0347\u034a\5\u0090I\2\u0348"+
		"\u034a\5\u0092J\2\u0349\u0347\3\2\2\2\u0349\u0348\3\2\2\2\u034a\u008f"+
		"\3\2\2\2\u034b\u034c\7f\2\2\u034c\u034d\7;\2\2\u034d\u034f\7<\2\2\u034e"+
		"\u0350\5\u0094K\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0091"+
		"\3\2\2\2\u0351\u0352\5N(\2\u0352\u0093\3\2\2\2\u0353\u0354\7\16\2\2\u0354"+
		"\u0355\5\u0082B\2\u0355\u0095\3\2\2\2\u0356\u035a\7=\2\2\u0357\u0359\5"+
		"\u0098M\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2"+
		"\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035e"+
		"\7>\2\2\u035e\u0097\3\2\2\2\u035f\u0363\5\u009aN\2\u0360\u0363\5\u009e"+
		"P\2\u0361\u0363\5\24\13\2\u0362\u035f\3\2\2\2\u0362\u0360\3\2\2\2\u0362"+
		"\u0361\3\2\2\2\u0363\u0099\3\2\2\2\u0364\u0365\5\u009cO\2\u0365\u0366"+
		"\7A\2\2\u0366\u009b\3\2\2\2\u0367\u0369\5\32\16\2\u0368\u0367\3\2\2\2"+
		"\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036e\5^\60\2\u036e\u036f\5N(\2\u036f"+
		"\u009d\3\2\2\2\u0370\u03d9\5\u0096L\2\u0371\u0372\7\4\2\2\u0372\u0375"+
		"\5\u00c0a\2\u0373\u0374\7J\2\2\u0374\u0376\5\u00c0a\2\u0375\u0373\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\7A\2\2\u0378"+
		"\u03d9\3\2\2\2\u0379\u037a\7\30\2\2\u037a\u037b\5\u00b8]\2\u037b\u037e"+
		"\5\u009eP\2\u037c\u037d\7\21\2\2\u037d\u037f\5\u009eP\2\u037e\u037c\3"+
		"\2\2\2\u037e\u037f\3\2\2\2\u037f\u03d9\3\2\2\2\u0380\u0381\7\27\2\2\u0381"+
		"\u0382\7;\2\2\u0382\u0383\5\u00b0Y\2\u0383\u0384\7<\2\2\u0384\u0385\5"+
		"\u009eP\2\u0385\u03d9\3\2\2\2\u0386\u0387\7\64\2\2\u0387\u0388\5\u00b8"+
		"]\2\u0388\u0389\5\u009eP\2\u0389\u03d9\3\2\2\2\u038a\u038b\7\17\2\2\u038b"+
		"\u038c\5\u009eP\2\u038c\u038d\7\64\2\2\u038d\u038e\5\u00b8]\2\u038e\u038f"+
		"\7A\2\2\u038f\u03d9\3\2\2\2\u0390\u0391\7\61\2\2\u0391\u039b\5\u0096L"+
		"\2\u0392\u0394\5\u00a0Q\2\u0393\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0399\5\u00a4"+
		"S\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039c\3\2\2\2\u039a"+
		"\u039c\5\u00a4S\2\u039b\u0393\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u03d9"+
		"\3\2\2\2\u039d\u039e\7\61\2\2\u039e\u039f\5\u00a6T\2\u039f\u03a3\5\u0096"+
		"L\2\u03a0\u03a2\5\u00a0Q\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2"+
		"\2\2\u03a6\u03a8\5\u00a4S\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03d9\3\2\2\2\u03a9\u03aa\7+\2\2\u03aa\u03ab\5\u00b8]\2\u03ab\u03af\7"+
		"=\2\2\u03ac\u03ae\5\u00acW\2\u03ad\u03ac\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b5\3\2\2\2\u03b1\u03af\3\2"+
		"\2\2\u03b2\u03b4\5\u00aeX\2\u03b3\u03b2\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b5\3\2"+
		"\2\2\u03b8\u03b9\7>\2\2\u03b9\u03d9\3\2\2\2\u03ba\u03bb\7,\2\2\u03bb\u03bc"+
		"\5\u00b8]\2\u03bc\u03bd\5\u0096L\2\u03bd\u03d9\3\2\2\2\u03be\u03c0\7&"+
		"\2\2\u03bf\u03c1\5\u00c0a\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03d9\7A\2\2\u03c3\u03c4\7.\2\2\u03c4\u03c5\5\u00c0"+
		"a\2\u03c5\u03c6\7A\2\2\u03c6\u03d9\3\2\2\2\u03c7\u03c9\7\6\2\2\u03c8\u03ca"+
		"\7f\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03d9\7A\2\2\u03cc\u03ce\7\r\2\2\u03cd\u03cf\7f\2\2\u03ce\u03cd\3\2\2"+
		"\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d9\7A\2\2\u03d1\u03d9"+
		"\7A\2\2\u03d2\u03d3\5\u00bc_\2\u03d3\u03d4\7A\2\2\u03d4\u03d9\3\2\2\2"+
		"\u03d5\u03d6\7f\2\2\u03d6\u03d7\7J\2\2\u03d7\u03d9\5\u009eP\2\u03d8\u0370"+
		"\3\2\2\2\u03d8\u0371\3\2\2\2\u03d8\u0379\3\2\2\2\u03d8\u0380\3\2\2\2\u03d8"+
		"\u0386\3\2\2\2\u03d8\u038a\3\2\2\2\u03d8\u0390\3\2\2\2\u03d8\u039d\3\2"+
		"\2\2\u03d8\u03a9\3\2\2\2\u03d8\u03ba\3\2\2\2\u03d8\u03be\3\2\2\2\u03d8"+
		"\u03c3\3\2\2\2\u03d8\u03c7\3\2\2\2\u03d8\u03cc\3\2\2\2\u03d8\u03d1\3\2"+
		"\2\2\u03d8\u03d2\3\2\2\2\u03d8\u03d5\3\2\2\2\u03d9\u009f\3\2\2\2\u03da"+
		"\u03db\7\t\2\2\u03db\u03df\7;\2\2\u03dc\u03de\5\32\16\2\u03dd\u03dc\3"+
		"\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e2\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e3\5\u00a2R\2\u03e3\u03e4"+
		"\7f\2\2\u03e4\u03e5\7<\2\2\u03e5\u03e6\5\u0096L\2\u03e6\u00a1\3\2\2\2"+
		"\u03e7\u03ec\5v<\2\u03e8\u03e9\7X\2\2\u03e9\u03eb\5v<\2\u03ea\u03e8\3"+
		"\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u00a3\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\7\25\2\2\u03f0\u03f1\5"+
		"\u0096L\2\u03f1\u00a5\3\2\2\2\u03f2\u03f3\7;\2\2\u03f3\u03f5\5\u00a8U"+
		"\2\u03f4\u03f6\7A\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03f8\7<\2\2\u03f8\u00a7\3\2\2\2\u03f9\u03fe\5\u00aaV\2"+
		"\u03fa\u03fb\7A\2\2\u03fb\u03fd\5\u00aaV\2\u03fc\u03fa\3\2\2\2\u03fd\u0400"+
		"\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u00a9\3\2\2\2\u0400"+
		"\u03fe\3\2\2\2\u0401\u0403\5\32\16\2\u0402\u0401\3\2\2\2\u0403\u0406\3"+
		"\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0407\u0408\5`\61\2\u0408\u0409\5R*\2\u0409\u040a\7D\2"+
		"\2\u040a\u040b\5\u00c0a\2\u040b\u00ab\3\2\2\2\u040c\u040e\5\u00aeX\2\u040d"+
		"\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0412\3\2\2\2\u0411\u0413\5\u0098M\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u00ad\3\2"+
		"\2\2\u0416\u0417\7\b\2\2\u0417\u0418\5\u00be`\2\u0418\u0419\7J\2\2\u0419"+
		"\u0421\3\2\2\2\u041a\u041b\7\b\2\2\u041b\u041c\5Z.\2\u041c\u041d\7J\2"+
		"\2\u041d\u0421\3\2\2\2\u041e\u041f\7\16\2\2\u041f\u0421\7J\2\2\u0420\u0416"+
		"\3\2\2\2\u0420\u041a\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u00af\3\2\2\2\u0422"+
		"\u042f\5\u00b4[\2\u0423\u0425\5\u00b2Z\2\u0424\u0423\3\2\2\2\u0424\u0425"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\7A\2\2\u0427\u0429\5\u00c0a\2"+
		"\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c"+
		"\7A\2\2\u042b\u042d\5\u00b6\\\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2"+
		"\2\u042d\u042f\3\2\2\2\u042e\u0422\3\2\2\2\u042e\u0424\3\2\2\2\u042f\u00b1"+
		"\3\2\2\2\u0430\u0433\5\u009cO\2\u0431\u0433\5\u00ba^\2\u0432\u0430\3\2"+
		"\2\2\u0432\u0431\3\2\2\2\u0433\u00b3\3\2\2\2\u0434\u0436\5\32\16\2\u0435"+
		"\u0434\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2"+
		"\2\2\u0438\u043a\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043b\5^\60\2\u043b"+
		"\u043c\7f\2\2\u043c\u043d\7J\2\2\u043d\u043e\5\u00c0a\2\u043e\u00b5\3"+
		"\2\2\2\u043f\u0440\5\u00ba^\2\u0440\u00b7\3\2\2\2\u0441\u0442\7;\2\2\u0442"+
		"\u0443\5\u00c0a\2\u0443\u0444\7<\2\2\u0444\u00b9\3\2\2\2\u0445\u044a\5"+
		"\u00c0a\2\u0446\u0447\7B\2\2\u0447\u0449\5\u00c0a\2\u0448\u0446\3\2\2"+
		"\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u00bb"+
		"\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u044e\5\u00c0a\2\u044e\u00bd\3\2\2"+
		"\2\u044f\u0450\5\u00c0a\2\u0450\u00bf\3\2\2\2\u0451\u0452\ba\1\2\u0452"+
		"\u0453\7;\2\2\u0453\u0454\5^\60\2\u0454\u0455\7<\2\2\u0455\u0456\5\u00c0"+
		"a\2\u0456\u045f\3\2\2\2\u0457\u0458\t\7\2\2\u0458\u045f\5\u00c0a\2\u0459"+
		"\u045a\t\b\2\2\u045a\u045f\5\u00c0a\2\u045b\u045f\5\u00c2b\2\u045c\u045d"+
		"\7!\2\2\u045d\u045f\5\u00c4c\2\u045e\u0451\3\2\2\2\u045e\u0457\3\2\2\2"+
		"\u045e\u0459\3\2\2\2\u045e\u045b\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u04c2"+
		"\3\2\2\2\u0460\u0461\6a\2\3\u0461\u0462\t\t\2\2\u0462\u04c1\5\u00c0a\2"+
		"\u0463\u0464\6a\3\3\u0464\u0465\t\n\2\2\u0465\u04c1\5\u00c0a\2\u0466\u046e"+
		"\6a\4\3\u0467\u0468\7F\2\2\u0468\u046f\7F\2\2\u0469\u046a\7E\2\2\u046a"+
		"\u046b\7E\2\2\u046b\u046f\7E\2\2\u046c\u046d\7E\2\2\u046d\u046f\7E\2\2"+
		"\u046e\u0467\3\2\2\2\u046e\u0469\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0470"+
		"\3\2\2\2\u0470\u04c1\5\u00c0a\2\u0471\u0472\6a\5\3\u0472\u0473\t\13\2"+
		"\2\u0473\u04c1\5\u00c0a\2\u0474\u0475\6a\6\3\u0475\u0476\t\f\2\2\u0476"+
		"\u04c1\5\u00c0a\2\u0477\u0478\6a\7\3\u0478\u0479\7W\2\2\u0479\u04c1\5"+
		"\u00c0a\2\u047a\u047b\6a\b\3\u047b\u047c\7Y\2\2\u047c\u04c1\5\u00c0a\2"+
		"\u047d\u047e\6a\t\3\u047e\u047f\7X\2\2\u047f\u04c1\5\u00c0a\2\u0480\u0481"+
		"\6a\n\3\u0481\u0482\7O\2\2\u0482\u04c1\5\u00c0a\2\u0483\u0484\6a\13\3"+
		"\u0484\u0485\7P\2\2\u0485\u04c1\5\u00c0a\2\u0486\u0493\6a\f\3\u0487\u0494"+
		"\7D\2\2\u0488\u0494\7[\2\2\u0489\u0494\7\\\2\2\u048a\u0494\7]\2\2\u048b"+
		"\u0494\7^\2\2\u048c\u0494\7_\2\2\u048d\u0494\7`\2\2\u048e\u0494\7a\2\2"+
		"\u048f\u0494\7d\2\2\u0490\u0494\7e\2\2\u0491\u0494\7c\2\2\u0492\u0494"+
		"\7b\2\2\u0493\u0487\3\2\2\2\u0493\u0488\3\2\2\2\u0493\u0489\3\2\2\2\u0493"+
		"\u048a\3\2\2\2\u0493\u048b\3\2\2\2\u0493\u048c\3\2\2\2\u0493\u048d\3\2"+
		"\2\2\u0493\u048e\3\2\2\2\u0493\u048f\3\2\2\2\u0493\u0490\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0493\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u04c1\5\u00c0"+
		"a\2\u0496\u0497\6a\r\3\u0497\u0498\7I\2\2\u0498\u0499\5\u00c0a\2\u0499"+
		"\u049a\7J\2\2\u049a\u049b\5\u00c0a\2\u049b\u04c1\3\2\2\2\u049c\u049d\6"+
		"a\16\3\u049d\u049e\7C\2\2\u049e\u04c1\7f\2\2\u049f\u04a0\6a\17\3\u04a0"+
		"\u04a1\7C\2\2\u04a1\u04c1\7-\2\2\u04a2\u04a3\6a\20\3\u04a3\u04a4\7C\2"+
		"\2\u04a4\u04a6\7!\2\2\u04a5\u04a7\5\u00d0i\2\u04a6\u04a5\3\2\2\2\u04a6"+
		"\u04a7\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04c1\5\u00c8e\2\u04a9\u04aa"+
		"\6a\21\3\u04aa\u04ab\7C\2\2\u04ab\u04ac\7*\2\2\u04ac\u04c1\5\u00d6l\2"+
		"\u04ad\u04ae\6a\22\3\u04ae\u04af\7C\2\2\u04af\u04c1\5\u00ceh\2\u04b0\u04b1"+
		"\6a\23\3\u04b1\u04b2\7?\2\2\u04b2\u04b3\5\u00c0a\2\u04b3\u04b4\7@\2\2"+
		"\u04b4\u04c1\3\2\2\2\u04b5\u04b6\6a\24\3\u04b6\u04b8\7;\2\2\u04b7\u04b9"+
		"\5\u00ba^\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2"+
		"\2\u04ba\u04c1\7<\2\2\u04bb\u04bc\6a\25\3\u04bc\u04c1\t\r\2\2\u04bd\u04be"+
		"\6a\26\3\u04be\u04bf\7\34\2\2\u04bf\u04c1\5^\60\2\u04c0\u0460\3\2\2\2"+
		"\u04c0\u0463\3\2\2\2\u04c0\u0466\3\2\2\2\u04c0\u0471\3\2\2\2\u04c0\u0474"+
		"\3\2\2\2\u04c0\u0477\3\2\2\2\u04c0\u047a\3\2\2\2\u04c0\u047d\3\2\2\2\u04c0"+
		"\u0480\3\2\2\2\u04c0\u0483\3\2\2\2\u04c0\u0486\3\2\2\2\u04c0\u0496\3\2"+
		"\2\2\u04c0\u049c\3\2\2\2\u04c0\u049f\3\2\2\2\u04c0\u04a2\3\2\2\2\u04c0"+
		"\u04a9\3\2\2\2\u04c0\u04ad\3\2\2\2\u04c0\u04b0\3\2\2\2\u04c0\u04b5\3\2"+
		"\2\2\u04c0\u04bb\3\2\2\2\u04c0\u04bd\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2"+
		"\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u00c1\3\2\2\2\u04c4\u04c2\3\2"+
		"\2\2\u04c5\u04c6\7;\2\2\u04c6\u04c7\5\u00c0a\2\u04c7\u04c8\7<\2\2\u04c8"+
		"\u04db\3\2\2\2\u04c9\u04db\7-\2\2\u04ca\u04db\7*\2\2\u04cb\u04db\5x=\2"+
		"\u04cc\u04db\7f\2\2\u04cd\u04ce\5^\60\2\u04ce\u04cf\7C\2\2\u04cf\u04d0"+
		"\7\13\2\2\u04d0\u04db\3\2\2\2\u04d1\u04d2\7\62\2\2\u04d2\u04d3\7C\2\2"+
		"\u04d3\u04db\7\13\2\2\u04d4\u04d8\5\u00d0i\2\u04d5\u04d9\5\u00d8m\2\u04d6"+
		"\u04d7\7-\2\2\u04d7\u04d9\5\u00dan\2\u04d8\u04d5\3\2\2\2\u04d8\u04d6\3"+
		"\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04c5\3\2\2\2\u04da\u04c9\3\2\2\2\u04da"+
		"\u04ca\3\2\2\2\u04da\u04cb\3\2\2\2\u04da\u04cc\3\2\2\2\u04da\u04cd\3\2"+
		"\2\2\u04da\u04d1\3\2\2\2\u04da\u04d4\3\2\2\2\u04db\u00c3\3\2\2\2\u04dc"+
		"\u04dd\5\u00d0i\2\u04dd\u04de\5\u00c6d\2\u04de\u04df\5\u00ccg\2\u04df"+
		"\u04e6\3\2\2\2\u04e0\u04e3\5\u00c6d\2\u04e1\u04e4\5\u00caf\2\u04e2\u04e4"+
		"\5\u00ccg\2\u04e3\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u04e6\3\2\2"+
		"\2\u04e5\u04dc\3\2\2\2\u04e5\u04e0\3\2\2\2\u04e6\u00c5\3\2\2\2\u04e7\u04e9"+
		"\7f\2\2\u04e8\u04ea\5\u00d2j\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2"+
		"\u04ea\u04f2\3\2\2\2\u04eb\u04ec\7C\2\2\u04ec\u04ee\7f\2\2\u04ed\u04ef"+
		"\5\u00d2j\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\3\2\2"+
		"\2\u04f0\u04eb\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f7\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04f7\5b\62\2\u04f6"+
		"\u04e7\3\2\2\2\u04f6\u04f5\3\2\2\2\u04f7\u00c7\3\2\2\2\u04f8\u04fa\7f"+
		"\2\2\u04f9\u04fb\5\u00d4k\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fc\3\2\2\2\u04fc\u04fd\5\u00ccg\2\u04fd\u00c9\3\2\2\2\u04fe\u051a"+
		"\7?\2\2\u04ff\u0504\7@\2\2\u0500\u0501\7?\2\2\u0501\u0503\7@\2\2\u0502"+
		"\u0500\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2"+
		"\2\2\u0505\u0507\3\2\2\2\u0506\u0504\3\2\2\2\u0507\u051b\5V,\2\u0508\u0509"+
		"\5\u00c0a\2\u0509\u0510\7@\2\2\u050a\u050b\7?\2\2\u050b\u050c\5\u00c0"+
		"a\2\u050c\u050d\7@\2\2\u050d\u050f\3\2\2\2\u050e\u050a\3\2\2\2\u050f\u0512"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0517\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u0514\7?\2\2\u0514\u0516\7@\2\2\u0515\u0513\3\2\2"+
		"\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051b"+
		"\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u04ff\3\2\2\2\u051a\u0508\3\2\2\2\u051b"+
		"\u00cb\3\2\2\2\u051c\u051e\5\u00dan\2\u051d\u051f\5\60\31\2\u051e\u051d"+
		"\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u00cd\3\2\2\2\u0520\u0521\5\u00d0i"+
		"\2\u0521\u0522\5\u00d8m\2\u0522\u00cf\3\2\2\2\u0523\u0524\7F\2\2\u0524"+
		"\u0525\5.\30\2\u0525\u0526\7E\2\2\u0526\u00d1\3\2\2\2\u0527\u0528\7F\2"+
		"\2\u0528\u052b\7E\2\2\u0529\u052b\5d\63\2\u052a\u0527\3\2\2\2\u052a\u0529"+
		"\3\2\2\2\u052b\u00d3\3\2\2\2\u052c\u052d\7F\2\2\u052d\u0530\7E\2\2\u052e"+
		"\u0530\5\u00d0i\2\u052f\u052c\3\2\2\2\u052f\u052e\3\2\2\2\u0530\u00d5"+
		"\3\2\2\2\u0531\u0538\5\u00dan\2\u0532\u0533\7C\2\2\u0533\u0535\7f\2\2"+
		"\u0534\u0536\5\u00dan\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u0538\3\2\2\2\u0537\u0531\3\2\2\2\u0537\u0532\3\2\2\2\u0538\u00d7\3\2"+
		"\2\2\u0539\u053a\7*\2\2\u053a\u053e\5\u00d6l\2\u053b\u053c\7f\2\2\u053c"+
		"\u053e\5\u00dan\2\u053d\u0539\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u00d9"+
		"\3\2\2\2\u053f\u0541\7;\2\2\u0540\u0542\5\u00ba^\2\u0541\u0540\3\2\2\2"+
		"\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\7<\2\2\u0544\u00db"+
		"\3\2\2\2\u009d\u00de\u00e4\u00ee\u00f3\u00f9\u0101\u0106\u010c\u0114\u011d"+
		"\u0122\u0129\u0130\u0137\u013e\u0143\u0147\u014b\u014f\u0154\u0158\u015c"+
		"\u0166\u016e\u0175\u017c\u0180\u0183\u0186\u018f\u0195\u019a\u019d\u01a3"+
		"\u01a9\u01ad\u01b6\u01bd\u01c6\u01cd\u01d3\u01d7\u01e2\u01e6\u01ee\u01f3"+
		"\u01f7\u0200\u020e\u0213\u021c\u0224\u022e\u0236\u023e\u0243\u024f\u0255"+
		"\u025c\u0261\u0269\u026d\u026f\u027e\u0286\u0289\u028d\u0292\u0296\u02a1"+
		"\u02aa\u02ac\u02b3\u02b8\u02c1\u02c6\u02c9\u02ce\u02d7\u02e7\u02f1\u02f4"+
		"\u02fd\u0307\u030f\u0312\u0315\u0322\u032a\u032f\u0337\u033b\u033f\u0343"+
		"\u0345\u0349\u034f\u035a\u0362\u036a\u0375\u037e\u0395\u0398\u039b\u03a3"+
		"\u03a7\u03af\u03b5\u03c0\u03c9\u03ce\u03d8\u03df\u03ec\u03f5\u03fe\u0404"+
		"\u040f\u0414\u0420\u0424\u0428\u042c\u042e\u0432\u0437\u044a\u045e\u046e"+
		"\u0493\u04a6\u04b8\u04c0\u04c2\u04d8\u04da\u04e3\u04e5\u04e9\u04ee\u04f2"+
		"\u04f6\u04fa\u0504\u0510\u0517\u051a\u051e\u052a\u052f\u0535\u0537\u053d"+
		"\u0541";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}