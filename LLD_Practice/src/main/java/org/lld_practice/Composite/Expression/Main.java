package org.lld_practice.Composite.Expression;

public class Main {
    public static void main(String[] args) {
        Expression two = new Number(2);
        Expression one = new Number(1);
        Expression seven = new Number(7);

        Expression right = new Operation(one,seven,Operand.ADD);

        Expression multiply = new Operation(two,right,Operand.MULT);

        System.out.println(multiply.eval());
    }
}
