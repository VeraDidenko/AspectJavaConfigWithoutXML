package com.aspect.aspectExample;

import com.aspect.aspectExample.order.PizzaOrder;
import com.aspect.aspectExample.order.SushiOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aspect.aspectExample.aspects")
public class AspectExampleConfig {

    @Bean(name="PizzaOrder")
    public PizzaOrder PizzaOrder(){
        return new PizzaOrder();
    }

    @Bean(name="SushiOrder")
    public SushiOrder SushiOrder(){
        return new SushiOrder();
    }

}
