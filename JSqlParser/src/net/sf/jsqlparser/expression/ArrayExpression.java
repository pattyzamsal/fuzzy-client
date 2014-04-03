package net.sf.jsqlparser.expression;

import java.util.List;

import net.sf.jsqlparser.expression.operators.relational.ExpressionList;

public class ArrayExpression implements Expression {

    private ExpressionList expressions;

    public ArrayExpression(List<Expression> expressions) {
        this.expressions = new ExpressionList(expressions);
    }

    public ExpressionList getExpressions() {
        return this.expressions;
    }

    public void accept(ExpressionVisitor expressionVisitor) throws Exception {
        expressionVisitor.visit(this);
    }

}