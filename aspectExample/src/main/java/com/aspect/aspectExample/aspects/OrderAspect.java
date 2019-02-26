package com.aspect.aspectExample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class OrderAspect {

    @Before("execution(public void *ActivateOrder())")
    public void beforeActivateOrderAdvice(){
        System.out.println("==========> Executing @before advice on *ActivateOrder()");
    }

}
