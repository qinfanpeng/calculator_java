package com.twu.calculator;

public class Calculator {
    private String expression;

    public double calculate(String expression) {
        this.expression = expression;

        double leftOperand = Double.parseDouble(operands()[0]);
        for (int index = 1; index < operands().length; index++) {
             leftOperand = operation(index).operate(leftOperand, rightOperand(index));
        }

        return leftOperand;
    }

    private Operation operation(int index) {
        for (Operation operation : Operation.values()) {
            if (operation.operator().equals(operator(index))) {
                return operation;
            }
        }
        return null;
    }

    private String operator(int index) {
        return operators()[index];
    }

    private double rightOperand(int index) {
        return Double.parseDouble(operands()[index]);
    }

    private String[] operators() {
        return expression.replaceAll("[0-9]", "").split("");
    }

    private String[] operands() {
        return expression.split(operatorRegExp());
    }

    private String operatorRegExp() {
        StringBuffer result = new StringBuffer("[");
        for (Operation operation : Operation.values()) {
            result.append("\\" + operation.operator());
        }
        result.append("]");
        return result.toString();
    }
}

