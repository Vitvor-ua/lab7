import lab7.*;

public class Main {
    public static void main(String[] args) {
        String expression = "2 5 * 10 /";
        Expression parsedExpression = ExpressionParser.parseExpression(expression);
        System.out.println(parsedExpression.interpret());
    }
}