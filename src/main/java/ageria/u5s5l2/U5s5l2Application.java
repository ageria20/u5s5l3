package ageria.u5s5l1;

import ageria.u5s5l1.entities.Drink;
import ageria.u5s5l1.entities.Pizza;
import ageria.u5s5l1.entities.Product;
import ageria.u5s5l1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class U5s5l1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5s5l1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5s5l1Application.class);

		Topping ham = (Topping) ctx.getBean("getProsciutto");
		Topping w = (Topping) ctx.getBean("getWrustel");
		Topping tc = (Topping) ctx.getBean("getTonnoCipolla");

		Pizza pizza1 = (Pizza) ctx.getBean("getPinkPizza");
		Pizza pizza2 = (Pizza) ctx.getBean("getPizzaWrustel");
		Pizza pizza3 = (Pizza) ctx.getBean("getPizzaTonnoCipolla");

		Drink coke = (Drink) ctx.getBean("getCoke");
		Drink fanta = (Drink) ctx.getBean("getFanta");
		Drink beer = (Drink) ctx.getBean("getBeer");

		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);
		System.out.println(ham);
		System.out.println(w);
		System.out.println(tc);
		System.out.println(coke);
		System.out.println(fanta);
		System.out.println(beer);


	}

}
