package com.korwe.kordapt.acl;

import com.google.common.base.Strings;
import com.korwe.thecore.messages.ServiceRequest;
import com.korwe.thecore.service.ParameterHandler;
import com.thoughtworks.xstream.XStream;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.lang.annotation.Annotation;
import java.util.Map;

public class AuthParameterHandler extends ParameterHandler {

    private static String AUTH_PARAM = "__$$AUTHENTICATION";
    private XStream xStream;

    public AuthParameterHandler(XStream xStream) {this.xStream = xStream;}

    @Override public void processParameter(int currentIndex, Object[] params, Map<String, String> requestParams,
                                           String methodParamName, Annotation[] paramAnnotations,
                                           ServiceRequest request) {
        if (willProcess(requestParams, methodParamName, paramAnnotations)) {
            process(currentIndex, params, requestParams, methodParamName, paramAnnotations, request);
        }
        if (hasNext()) {
            getNext().processParameter(currentIndex, params, requestParams, methodParamName, paramAnnotations, request);
        }
    }

    @Override
    protected void process(int currentIndex, Object[] params, Map<String, String> requestParams, String methodParamName,
                           Annotation[] paramAnnotations, ServiceRequest request) {
        final String authParam = requestParams.remove(AUTH_PARAM);
        Authentication authentication = Strings.isNullOrEmpty(authParam) ? null :
                                        (Authentication) xStream.fromXML(authParam);
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    @Override protected boolean willProcess(Map<String, String> requestParams, String methodParamName,
                                            Annotation[] paramAnnotations) {
        return requestParams.containsKey(AUTH_PARAM);
    }
}
