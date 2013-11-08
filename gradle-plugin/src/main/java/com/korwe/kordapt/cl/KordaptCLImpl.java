package com.korwe.kordapt.cl;

import com.korwe.kordapt.Service;
import com.korwe.kordapt.ServiceFunction;
import com.korwe.kordapt.ServiceFunctionParameter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptCLImpl extends KordaptCLBaseListener{
    private Stack<ServiceFunctionParameter> parameterStack = new Stack<>();
    private Stack<ServiceFunction> functionStack = new Stack<>();
    private Service service;

    @Override
    public void exitService(@NotNull KordaptCLParser.ServiceContext ctx){
        service = new Service();
        service.setName(ctx.qualifiedName().getText());
        List<ServiceFunction> functions = new ArrayList<>();
        while(!functionStack.empty()){
            functions.add(functionStack.pop());
        }

        service.setFunctions(functions);
    }

    @Override
    public void exitFunction(@NotNull KordaptCLParser.FunctionContext ctx){
        ServiceFunction function = new ServiceFunction();
        function.setName(ctx.Identifier().getText());

        String returnType = ctx.returnType().getText();

        if(!"void".equals(returnType)) {
            function.setReturnType(returnType);
        }

        List<ServiceFunctionParameter> functionParameters =  new ArrayList<>();

        while (!parameterStack.empty()){
            functionParameters.add(parameterStack.pop());
        }

        function.setParameters(functionParameters);

        functionStack.push(function);

    }

    @Override
    public void exitFormalParameter(@NotNull KordaptCLParser.FormalParameterContext ctx){

        ServiceFunctionParameter sfp = new ServiceFunctionParameter();
        sfp.setName(ctx.variableDeclaratorId().getText());
        sfp.setType(ctx.type().getText());

        parameterStack.push(sfp);
    }


    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
