package Expression;

public class Square implements Expression{
    Expression expression;
    public Square(Expression expression) {
        this.expression = expression;
    }
    @Override
    public int evaluate() {
        int temp = expression.evaluate();
        return temp*temp;
    }
    @Override
    public String toString() {
        String temp = expression.toString();
        return temp + "^2" + "=" + String.valueOf(evaluate());
    }
}
