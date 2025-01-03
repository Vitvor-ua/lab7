package lab7;

/**
 * Represents a multiplication operation in the expression tree.
 */
public class MultiplyExpression implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs a MultiplyExpression with the given left and right operands.
     *
     * @param left the left operand
     * @param right the right operand
     */
    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the multiplication operation and returns the result.
     *
     * @return the result of the multiplication
     */
    @Override
    public double interpret() {
        return left.interpret() * right.interpret();
    }
}