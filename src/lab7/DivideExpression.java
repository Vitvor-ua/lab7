package lab7;

/**
 * Represents a division operation in the expression tree.
 */
public class DivideExpression implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs a DivideExpression with the given left and right operands.
     *
     * @param left the left operand
     * @param right the right operand
     */
    public DivideExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the division operation and returns the result.
     * Throws an exception if division by zero is attempted.
     *
     * @return the result of the division
     * @throws ArithmeticException if dividing by zero
     */
    @Override
    public double interpret() {
        if (right.interpret() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.interpret() / right.interpret();
    }
}