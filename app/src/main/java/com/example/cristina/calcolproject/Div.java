package com.example.cristina.calcolproject;

public class Div extends Operator {
    Double execute() {
        return op1.execute()/op2.execute();
    }

    Div (Expression e1, Expression e2){
        op1=e1;
        op2=e2;
    }
}
