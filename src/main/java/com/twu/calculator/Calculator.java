package com.twu.calculator;

import java.util.List;

public class Calculator {
    ComputationExpressionParser expressionParser = new ComputationExpressionParser();


    public double calculate(String expression) {

        List<Double> operands = expressionParser.parseOperands(expression);
        List<Operation> operations = expressionParser.parseOperators(expression);

        double leftOperand = operands.get(0);

        for (int index = 1; index < operands.size(); index++) {
            double rightOperand = operands.get(index);
            leftOperand = operations.get(index).operate(leftOperand, rightOperand);
        }
        
        return leftOperand;
    }
}

