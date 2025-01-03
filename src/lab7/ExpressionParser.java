package lab7;

import java.util.Stack;

/**
 * A parser for mathematical expressions in Reverse Polish Notation (RPN).
 */
public class ExpressionParser {

    /**
     * Parses a given mathematical expression in Reverse Polish Notation (RPN)
     * and returns the resulting expression tree.
     *
     * @param context the expression to be parsed
     * @return the root expression node of the parsed expression tree
     * @throws IllegalArgumentException if an unsupported operator is found
     */
    public static Expression parseExpression(String context) {
        String[] tokens = context.split(" ");
        Stack<Expression> expressionStack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                expressionStack.push(new NumberExpression(Integer.parseInt(token)));
            } else {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();

                switch (token) {
                    case "+" -> expressionStack.push(new AddExpression(left, right));
                    case "-" -> expressionStack.push(new SubtractExpression(left, right));
                    case "*" -> expressionStack.push(new MultiplyExpression(left, right));
                    case "/" -> expressionStack.push(new DivideExpression(left, right));
                    default -> throw new IllegalArgumentException("Unsupported operator: " + token);
                }
            }
        }

        return expressionStack.pop();
    }
}
