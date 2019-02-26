package com.aspect.aspectExample.order;

import org.springframework.stereotype.Component;

@Component
public class PizzaOrder {

    public void pizzaActivateOrder(){

        System.out.println(getClass() + ": Activating pizza order request");
    }

}
