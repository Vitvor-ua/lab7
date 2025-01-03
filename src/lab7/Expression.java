package lab7;

/**
 * Interface representing an expression in the interpreter pattern.
 */
public interface Expression {
    /**
     * Interprets the expression and returns its value.
     *
     * @return the evaluated result of the expression
     */
    double interpret();
}