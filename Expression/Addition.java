package Expression;

public class Addition extends BinaryExpression{
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
    @Override
    public String toString() {
        return left.toString() + " + " + right.toString() + " = " + String.valueOf(evaluate());
    }
}
