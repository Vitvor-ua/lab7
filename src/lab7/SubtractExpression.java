package lab7;

/**
 * Represents a subtraction operation in the expression tree.
 */
public class SubtractExpression implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs a SubtractExpression with the given left and right operands.
     *
     * @param left the left operand
     * @param right the right operand
     */
    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the subtraction operation and returns the result.
     *
     * @return the result of the subtraction
     */
    @Override
    public double interpret() {
        return left.interpret() - right.interpret();
    }
}
