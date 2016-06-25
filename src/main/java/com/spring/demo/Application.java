package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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


        StandardEvaluationContext context = new StandardEvaluationContext();
        expression = expressionParser.parseExpression("(#a * #b)+#c");
        context.setVariable("a", 2);
        context.setVariable("b", 4);
        context.setVariable("c", 1);
        System.out.println(expression.getValue(context));


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springIntermediateConfig.xml");
        Dummy2 dummy2 = applicationContext.getBean(Dummy2.class);
        System.out.println(dummy2);
    }
}
