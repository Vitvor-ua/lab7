package lab7;

/**
 * Represents an addition operation in the expression tree.
 */
public class AddExpression implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs an AddExpression with the given left and right operands.
     *
     * @param left the left operand
     * @param right the right operand
     */
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the addition operation and returns the result.
     *
     * @return the result of the addition
     */
    @Override
    public double interpret() {
        return left.interpret() + right.interpret();
    }
}
