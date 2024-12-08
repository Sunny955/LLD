package org.lld_practice.Composite.Expression;

public class Number implements Expression{
    private final double val;

    public Number(double val) {
        this.val = val;
    }

    @Override
    public double eval() {
        return val;
    }
}
