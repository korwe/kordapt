// Generated from KordaptCL.g4 by ANTLR 4.1

package com.korwe.kordapt.cl;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KordaptCLParser}.
 */
public interface KordaptCLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull KordaptCLParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull KordaptCLParser.InnerCreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull KordaptCLParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull KordaptCLParser.GenericMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull KordaptCLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull KordaptCLParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull KordaptCLParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull KordaptCLParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull KordaptCLParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull KordaptCLParser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull KordaptCLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull KordaptCLParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull KordaptCLParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull KordaptCLParser.EnumConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull KordaptCLParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull KordaptCLParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull KordaptCLParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull KordaptCLParser.AnnotationMethodOrConstantRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull KordaptCLParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull KordaptCLParser.EnumConstantNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull KordaptCLParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull KordaptCLParser.FinallyBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull KordaptCLParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull KordaptCLParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull KordaptCLParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull KordaptCLParser.ElementValuePairsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull KordaptCLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull KordaptCLParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull KordaptCLParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull KordaptCLParser.InterfaceBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull KordaptCLParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull KordaptCLParser.EnumConstantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull KordaptCLParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull KordaptCLParser.CatchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull KordaptCLParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull KordaptCLParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull KordaptCLParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull KordaptCLParser.EnumDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull KordaptCLParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull KordaptCLParser.ExplicitGenericInvocationSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull KordaptCLParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull KordaptCLParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull KordaptCLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull KordaptCLParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull KordaptCLParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull KordaptCLParser.TypeBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull KordaptCLParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull KordaptCLParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull KordaptCLParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull KordaptCLParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull KordaptCLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull KordaptCLParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull KordaptCLParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull KordaptCLParser.GenericInterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull KordaptCLParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull KordaptCLParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull KordaptCLParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull KordaptCLParser.SuperSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull KordaptCLParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull KordaptCLParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull KordaptCLParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull KordaptCLParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull KordaptCLParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull KordaptCLParser.ExplicitGenericInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull KordaptCLParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull KordaptCLParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull KordaptCLParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull KordaptCLParser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull KordaptCLParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull KordaptCLParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull KordaptCLParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull KordaptCLParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull KordaptCLParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull KordaptCLParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull KordaptCLParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull KordaptCLParser.AnnotationConstantRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull KordaptCLParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull KordaptCLParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull KordaptCLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull KordaptCLParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull KordaptCLParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull KordaptCLParser.ConstructorBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull KordaptCLParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull KordaptCLParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull KordaptCLParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull KordaptCLParser.TypeArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull KordaptCLParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull KordaptCLParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull KordaptCLParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull KordaptCLParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull KordaptCLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull KordaptCLParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull KordaptCLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull KordaptCLParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull KordaptCLParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull KordaptCLParser.ResourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull KordaptCLParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull KordaptCLParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull KordaptCLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull KordaptCLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull KordaptCLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull KordaptCLParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull KordaptCLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull KordaptCLParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull KordaptCLParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull KordaptCLParser.AnnotationNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull KordaptCLParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull KordaptCLParser.EnhancedForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull KordaptCLParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull KordaptCLParser.AnnotationMethodRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull KordaptCLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull KordaptCLParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull KordaptCLParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull KordaptCLParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull KordaptCLParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull KordaptCLParser.ClassOrInterfaceModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull KordaptCLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull KordaptCLParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull KordaptCLParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull KordaptCLParser.VariableModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull KordaptCLParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull KordaptCLParser.ConstDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull KordaptCLParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull KordaptCLParser.CreatedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull KordaptCLParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull KordaptCLParser.InterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull KordaptCLParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull KordaptCLParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull KordaptCLParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull KordaptCLParser.ConstantDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull KordaptCLParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull KordaptCLParser.CatchTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull KordaptCLParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull KordaptCLParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull KordaptCLParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull KordaptCLParser.ClassCreatorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull KordaptCLParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull KordaptCLParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull KordaptCLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull KordaptCLParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull KordaptCLParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull KordaptCLParser.InterfaceBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(@NotNull KordaptCLParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(@NotNull KordaptCLParser.PackageOrTypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull KordaptCLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull KordaptCLParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull KordaptCLParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull KordaptCLParser.LastFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull KordaptCLParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull KordaptCLParser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull KordaptCLParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull KordaptCLParser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull KordaptCLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull KordaptCLParser.LocalVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull KordaptCLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull KordaptCLParser.VariableDeclaratorIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull KordaptCLParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull KordaptCLParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull KordaptCLParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull KordaptCLParser.ElementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull KordaptCLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull KordaptCLParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull KordaptCLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull KordaptCLParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull KordaptCLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull KordaptCLParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull KordaptCLParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull KordaptCLParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull KordaptCLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull KordaptCLParser.AnnotationTypeBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull KordaptCLParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull KordaptCLParser.QualifiedNameListContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull KordaptCLParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull KordaptCLParser.CreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull KordaptCLParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull KordaptCLParser.MemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull KordaptCLParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull KordaptCLParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull KordaptCLParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull KordaptCLParser.AnnotationTypeElementRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull KordaptCLParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull KordaptCLParser.ResourceSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull KordaptCLParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull KordaptCLParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull KordaptCLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull KordaptCLParser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull KordaptCLParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull KordaptCLParser.ElementValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(@NotNull KordaptCLParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(@NotNull KordaptCLParser.ReturnTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull KordaptCLParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull KordaptCLParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull KordaptCLParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull KordaptCLParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull KordaptCLParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull KordaptCLParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull KordaptCLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull KordaptCLParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull KordaptCLParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull KordaptCLParser.NonWildcardTypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(@NotNull KordaptCLParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(@NotNull KordaptCLParser.ServiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull KordaptCLParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull KordaptCLParser.ArrayCreatorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull KordaptCLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull KordaptCLParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull KordaptCLParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull KordaptCLParser.GenericConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull KordaptCLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull KordaptCLParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull KordaptCLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull KordaptCLParser.SwitchBlockStatementGroupContext ctx);
}