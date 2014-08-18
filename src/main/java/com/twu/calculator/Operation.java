package com.twu.calculator;

public enum Operation {
    ADD("+") {
        double operate(double leftOperand, double rightOperand) {
            return leftOperand + rightOperand;
        }
    },

    SUBTRACT("-") {
        double operate(double leftOperand, double rightOperand) {
            return leftOperand - rightOperand;
        }
    },

    MULTIPLY("*") {
        double operate(double leftOperand, double rightOperand) {
            return leftOperand * rightOperand;
        }
    },

    DIVIDE("/") {
        double operate(double leftOperand, double rightOperand) {
            return leftOperand / rightOperand;
        }
    };

    private String operator;
    abstract double operate(double leftOperand, double rightOperand);

    private Operation(String operator) {
        this.operator = operator;
    }

    public String operator() {
        return operator;
    }

}
