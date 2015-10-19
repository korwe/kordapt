// Generated from KordaptCL.g4 by ANTLR 4.5

package com.korwe.kordapt.cl;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KordaptCLParser}.
 */
public interface KordaptCLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#kordaptCl}.
	 * @param ctx the parse tree
	 */
	void enterKordaptCl(KordaptCLParser.KordaptClContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#kordaptCl}.
	 * @param ctx the parse tree
	 */
	void exitKordaptCl(KordaptCLParser.KordaptClContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(KordaptCLParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(KordaptCLParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(KordaptCLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(KordaptCLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(KordaptCLParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(KordaptCLParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#kordaptType}.
	 * @param ctx the parse tree
	 */
	void enterKordaptType(KordaptCLParser.KordaptTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#kordaptType}.
	 * @param ctx the parse tree
	 */
	void exitKordaptType(KordaptCLParser.KordaptTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#kordaptTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterKordaptTypeAttribute(KordaptCLParser.KordaptTypeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#kordaptTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitKordaptTypeAttribute(KordaptCLParser.KordaptTypeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(KordaptCLParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(KordaptCLParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(KordaptCLParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(KordaptCLParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(KordaptCLParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(KordaptCLParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(KordaptCLParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(KordaptCLParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(KordaptCLParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(KordaptCLParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(KordaptCLParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(KordaptCLParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(KordaptCLParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(KordaptCLParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(KordaptCLParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(KordaptCLParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(KordaptCLParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(KordaptCLParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(KordaptCLParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(KordaptCLParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(KordaptCLParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(KordaptCLParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(KordaptCLParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(KordaptCLParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(KordaptCLParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(KordaptCLParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(KordaptCLParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(KordaptCLParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(KordaptCLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(KordaptCLParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(KordaptCLParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(KordaptCLParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(KordaptCLParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(KordaptCLParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(KordaptCLParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(KordaptCLParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(KordaptCLParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(KordaptCLParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(KordaptCLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(KordaptCLParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(KordaptCLParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(KordaptCLParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(KordaptCLParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(KordaptCLParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(KordaptCLParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(KordaptCLParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(KordaptCLParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(KordaptCLParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(KordaptCLParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(KordaptCLParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(KordaptCLParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(KordaptCLParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(KordaptCLParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(KordaptCLParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(KordaptCLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(KordaptCLParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(KordaptCLParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(KordaptCLParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(KordaptCLParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(KordaptCLParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(KordaptCLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(KordaptCLParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(KordaptCLParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(KordaptCLParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(KordaptCLParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(KordaptCLParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(KordaptCLParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(KordaptCLParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(KordaptCLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(KordaptCLParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(KordaptCLParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(KordaptCLParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(KordaptCLParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(KordaptCLParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(KordaptCLParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(KordaptCLParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KordaptCLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KordaptCLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(KordaptCLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(KordaptCLParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(KordaptCLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(KordaptCLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(KordaptCLParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(KordaptCLParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(KordaptCLParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(KordaptCLParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(KordaptCLParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(KordaptCLParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(KordaptCLParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(KordaptCLParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(KordaptCLParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(KordaptCLParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(KordaptCLParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(KordaptCLParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(KordaptCLParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(KordaptCLParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(KordaptCLParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(KordaptCLParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(KordaptCLParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(KordaptCLParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(KordaptCLParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(KordaptCLParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(KordaptCLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(KordaptCLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(KordaptCLParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(KordaptCLParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(KordaptCLParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(KordaptCLParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(KordaptCLParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(KordaptCLParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(KordaptCLParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(KordaptCLParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(KordaptCLParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(KordaptCLParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(KordaptCLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(KordaptCLParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(KordaptCLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(KordaptCLParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(KordaptCLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(KordaptCLParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(KordaptCLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(KordaptCLParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(KordaptCLParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(KordaptCLParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(KordaptCLParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(KordaptCLParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(KordaptCLParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(KordaptCLParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(KordaptCLParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(KordaptCLParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(KordaptCLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(KordaptCLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KordaptCLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KordaptCLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(KordaptCLParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(KordaptCLParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(KordaptCLParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(KordaptCLParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(KordaptCLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(KordaptCLParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KordaptCLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KordaptCLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(KordaptCLParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(KordaptCLParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(KordaptCLParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(KordaptCLParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(KordaptCLParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(KordaptCLParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(KordaptCLParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(KordaptCLParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(KordaptCLParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(KordaptCLParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(KordaptCLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(KordaptCLParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(KordaptCLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(KordaptCLParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(KordaptCLParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(KordaptCLParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(KordaptCLParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(KordaptCLParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(KordaptCLParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(KordaptCLParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(KordaptCLParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(KordaptCLParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(KordaptCLParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(KordaptCLParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(KordaptCLParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(KordaptCLParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(KordaptCLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(KordaptCLParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(KordaptCLParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(KordaptCLParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(KordaptCLParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(KordaptCLParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KordaptCLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KordaptCLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(KordaptCLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(KordaptCLParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(KordaptCLParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(KordaptCLParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(KordaptCLParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(KordaptCLParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(KordaptCLParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(KordaptCLParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(KordaptCLParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(KordaptCLParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(KordaptCLParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(KordaptCLParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(KordaptCLParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(KordaptCLParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(KordaptCLParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(KordaptCLParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(KordaptCLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(KordaptCLParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(KordaptCLParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(KordaptCLParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(KordaptCLParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(KordaptCLParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(KordaptCLParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(KordaptCLParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KordaptCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KordaptCLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KordaptCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KordaptCLParser.ArgumentsContext ctx);
}