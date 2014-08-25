package com.twu.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputationExpressionParser {

    public List<Double> parseOperands(String expression) {
        List<Double> operands = new ArrayList<Double>();
        for (String operand : expression.split(Operation.operatorRegExp())) {
            operands.add(Double.parseDouble(operand));
        }
        return operands;
    }

    public List<String> parseOperators(String expression) {
        return Arrays.asList(expression.replaceAll("[0-9]", "").split(""));
    }
}
