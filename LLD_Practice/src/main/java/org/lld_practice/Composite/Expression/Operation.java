package org.lld_practice.Composite.Expression;

public class Operation implements Expression{

    private final Expression leftExpr;
    private final Expression rightExpr;
    private final Operand operand;

    public Operation(Expression leftExpr, Expression rightExpr, Operand operand) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
        this.operand = operand;
    }

    @Override
    public double eval() {
        double val = 0;

        switch (operand) {
            case ADD:
                val = leftExpr.eval() + rightExpr.eval();
                break;
            case MULT:
                val = leftExpr.eval() * rightExpr.eval();
                break;
            case DIV:
                val = leftExpr.eval()/ rightExpr.eval();
                break;
            case SUB:
                val = leftExpr.eval() - rightExpr.eval();
                break;
        }

        return val;
    }
}
