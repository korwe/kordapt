
grammar KordaptCL;

@header{
package com.korwe.kordapt.cl;
}
import Java;


kordaptCl
    : service | kordaptType
;

service
    : qualifiedName function*
;

function
    : returnType ':' Identifier formalParameters
;

returnType
    : (type|'void')
;

kordaptType
    : (type ':')? qualifiedName kordaptTypeAttribute*
;

kordaptTypeAttribute
    : type ':' Identifier
;
