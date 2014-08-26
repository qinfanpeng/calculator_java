package com.twu.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputationExpressionParser {

    public List<Double> parseOperands(String expression) {
        List<String> operands = Arrays.asList(expression.split(Operation.operatorRegExp()));
        return map(operands, new Predictor<String, Double>() {
            @Override
            public Double apply(String original) {
                return Double.parseDouble(original);
            }
        });

    }

    public List<Operation> parseOperators(String expression) {
        String[] operators = expression.replaceAll("[0-9]", "").split("");
        return map(Arrays.asList(operators), new Predictor<String, Operation>() {
            @Override
            public Operation apply(String original) {
                return Operation.getOperationBy(original);
            }
        });
    }

    private <F, T> List<T> map(List<F> from, Predictor<F, T> predictor){
        List<T> result = new ArrayList<T>();
        for (F original : from) {
            result.add(predictor.apply(original));
        }
        return result;
    };

}

 interface Predictor<F, T> {
      T apply(F original);
 }
