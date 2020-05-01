package com.com.fredymosquera.part1;

import edu.princeton.cs.algs4.Stack;

public class DijkstraTwoStackExpressionEvaluation {

    public static void main(String[] args) {
        String expression = "(1+((2+3)*(4*5)))";
        System.out.println(evaluateExpresion(expression));
    }
    private static double evaluateExpresion(String expression){
        String[] elements = expression.replace("(", "").split("");
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        for (String element: elements) {
            if("+".equals(element) || "-".equals(element) || "*".equals(element) || "/".equals(element)){
                operators.push(element);
            }else if(")".equals(element)){
                String operator = operators.pop();
                double operandA = Double.parseDouble(operands.pop());
                double operandB = Double.parseDouble(operands.pop());
                if("+".equals(operator)){
                    operands.push(String.valueOf(operandA + operandB));
                }else  if("-".equals(operator)){
                    operands.push(String.valueOf(operandA - operandB));
                } else  if("*".equals(operator)){
                    operands.push(String.valueOf(operandA * operandB));
                } else  if("/".equals(operator)){
                    operands.push(String.valueOf(operandA / operandB));
                }
            }else {
                operands.push(element);
            }
        }

        return  Double.parseDouble(operands.pop());
    }
}
