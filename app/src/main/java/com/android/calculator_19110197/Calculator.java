package com.android.calculator_19110197;

public class Calculator {
    public enum Operator {ADD, SUB, DIV, MUL, POW, FACT, LOG}

    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }

    public double log(double firstOperand, double secondOperand) {
        return Math.log(secondOperand) / Math.log(firstOperand);
    }
    public double fact(double firstOperand) {
        if(firstOperand <0 || Math.round(firstOperand) != firstOperand){
            return 0;
        }
        int fac = 1;
        for(int i = 2; i<=firstOperand;i++){
            fac *= i;
        }
        return fac ;
    }
}
