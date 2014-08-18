package com.twu.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by fpqin on 14-8-15.
 */
public class Main{
    public static void main(String[] args)
    {
        startCalculator();
    }

    private static void startCalculator() {
        Calculator calculator = new Calculator();
        while (true) {
            try {
                double result = calculator.calculate(getEnteredExpression());
                System.out.println("Result: " + result);
                System.out.println("----------------------------");
            } catch (Exception e) {
                handleEerror();
            }
        }
    }

    private static void handleEerror() {
        System.err.println("Something wrong.");
        System.out.println("----------------------------");
        startCalculator();
    }

    private static String getEnteredExpression() {
        System.out.print("Please enter your expression: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            return br.readLine();
        }catch(Exception e){
            handleEerror();
        }
        return "";
    }
}
