package com.spring.demo;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Gaurav", 26);
        StandardEvaluationContext standardEvaluationContext = new StandardEvaluationContext(person);
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("age");
        System.out.println(expression.getValue(person));
        System.out.println(expression.getValue(standardEvaluationContext));
    }
}
