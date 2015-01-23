package com.korwe.kordapt.cl;

import com.google.common.collect.Lists;
import com.korwe.kordapt.api.bean.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Stack;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptCLImpl extends KordaptCLBaseListener{
    private Stack<ServiceFunctionParameter> parameterStack = new Stack<>();
    private Stack<ServiceFunction> functionStack = new Stack<>();
    private Stack<Attribute> attributeStack = new Stack<>();
    private Stack<Type> typeArgumentStack = new Stack<>();
    private Service service;
    private Type type;

    @Override
    public void exitService(@NotNull KordaptCLParser.ServiceContext ctx){
        service = new Service();
        String name = ctx.qualifiedName().getText();
        service.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
        service.setFunctions(Lists.newArrayList(functionStack));
        functionStack.clear();

    }

    @Override
    public void exitFunction(@NotNull KordaptCLParser.FunctionContext ctx){
        ServiceFunction function = new ServiceFunction();
        function.setName(ctx.Identifier().getText());

        Type returnType = typeFromQualifiedName(ctx.returnType().getText());

        if(!"void".equals(returnType.getName())) {
            function.setReturnType(returnType);
        }


        function.setParameters(Lists.newArrayList(parameterStack));
        parameterStack.clear();

        functionStack.push(function);

    }

    @Override
    public void exitFormalParameter(@NotNull KordaptCLParser.FormalParameterContext ctx){

        ServiceFunctionParameter sfp = new ServiceFunctionParameter();
        sfp.setName(ctx.variableDeclaratorId().getText());
        sfp.setType(typeFromQualifiedName(ctx.type().getText()));

        parameterStack.push(sfp);
    }


    @Override
    public void exitKordaptType(@NotNull KordaptCLParser.KordaptTypeContext ctx){
        Type t = typeFromQualifiedName(ctx.qualifiedName().getText());
        if(ctx.type()!= null){
            t.setInheritsFrom(typeFromQualifiedName(ctx.type().getText()));
        }
        t.setAttributes(Lists.newArrayList(attributeStack));
        attributeStack.clear();

        type = t;

    }

    @Override
    public void exitKordaptTypeAttribute(@NotNull KordaptCLParser.KordaptTypeAttributeContext ctx){
        Attribute a = new Attribute();
        a.setName(ctx.Identifier().getText());
        a.setType(typeFromQualifiedName(ctx.type().getText()));
        attributeStack.push(a);
    }

    @Override
    public void exitTypeArguments(@NotNull KordaptCLParser.TypeArgumentsContext ctx){
        for(KordaptCLParser.TypeArgumentContext typeArgumentsContext : ctx.typeArgument()){
            Type t = typeFromQualifiedName(typeArgumentsContext.getText());
            typeArgumentStack.push(t);
        }
    }

    public Type typeFromQualifiedName(String qualifiedName){
        Type type = new Type();
        //Handle generic type
        Integer genericOpeningDeclarationIndex = qualifiedName.indexOf('<');
        if(genericOpeningDeclarationIndex != -1){//Has generic opening declarator
            qualifiedName = qualifiedName.substring(0,genericOpeningDeclarationIndex);
        }


        Integer nameSeparatorIndex = qualifiedName.lastIndexOf('.');
        if(nameSeparatorIndex == -1){
            type.setName(qualifiedName);
        }
        else{
            type.setName(qualifiedName.substring(nameSeparatorIndex+1));
            type.setPackageName(qualifiedName.substring(0,nameSeparatorIndex));
        }

        if(!typeArgumentStack.empty()){
            type.setTypeArguments(Lists.newArrayList(typeArgumentStack));
            typeArgumentStack.clear();
        }

        return type;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
