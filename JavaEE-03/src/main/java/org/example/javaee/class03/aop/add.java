package org.example.javaee.class03.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class add {
    @Pointcut("execution(* org.example.javaee.class03.aop.addHomework.addhomework(..))")
    public void addhomework(){}

    @Before("addhomework()")
    public void add(){
        System.out.println("Homework is added.");
    }

    @AfterReturning("addhomework()")
    public void addsuccess(){
        System.out.println("Add homework successfully.");
    }

    @AfterThrowing("addhomework()")
    public void addfail(){
        System.out.println("Can not add homework!");
    }
}
