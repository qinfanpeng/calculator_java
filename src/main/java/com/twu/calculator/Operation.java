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
        double operate(double leftOperand, double rightOperand) throws ArithmeticException{
            if (rightOperand == 0) { throw new ArithmeticException("Divisor cannot be zero");}

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


    public static String operatorRegExp() {
        StringBuffer result = new StringBuffer("[");
        for (Operation operation : values()) {
            result.append("\\" + operation.operator());
        }
        result.append("]");
        return result.toString();
    }

    public static Operation getOperationBy(String operator) {
        for (Operation operation : values()) {
            if (operation.operator().equals(operator)) {
                return operation;
            }
        }
        return null;
    }

}
