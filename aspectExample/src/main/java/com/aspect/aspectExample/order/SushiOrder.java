package com.aspect.aspectExample.order;

import org.springframework.stereotype.Component;

@Component
public class SushiOrder {

    public void sushiActivateOrder(){

        System.out.println(getClass() + ": Activating sushi order request");
    }

}
