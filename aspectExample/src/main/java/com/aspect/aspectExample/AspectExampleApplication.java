package com.aspect.aspectExample;

import com.aspect.aspectExample.order.PizzaOrder;
import com.aspect.aspectExample.order.SushiOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectExampleApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AspectExampleConfig.class);
		ctx.refresh();
		PizzaOrder pizzaOrder = ctx.getBean("PizzaOrder", PizzaOrder.class);
		System.out.println("_________________________\n");
		pizzaOrder.pizzaActivateOrder();
		System.out.println("_________________________\n");

		SushiOrder sushiOrder = ctx.getBean("SushiOrder", SushiOrder.class);
		System.out.println("_________________________\n");
		sushiOrder.sushiActivateOrder();
		System.out.println("_________________________\n");

		System.out.flush();
		ctx.close();

	}

}
