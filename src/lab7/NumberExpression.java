package lab7;

/**
 * Represents a number in the expression tree.
 */
public class NumberExpression implements Expression {
    private double value;

    /**
     * Constructs a NumberExpression with the given value.
     *
     * @param value the value of the number
     */
    public NumberExpression(double value) {
        this.value = value;
    }

    /**
     * Interprets the number and returns its value.
     *
     * @return the value of the number
     */
    @Override
    public double interpret() {
        return value;
    }
}
