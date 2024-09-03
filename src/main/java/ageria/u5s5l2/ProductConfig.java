package ageria.u5s5l1;


import ageria.u5s5l1.entities.Drink;
import ageria.u5s5l1.entities.Pizza;
import ageria.u5s5l1.entities.Product;
import ageria.u5s5l1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ProductConfig {


    @Bean
    public Topping getProsciutto(){
        return new Topping("prosciutto");
    }

    @Bean
    public Topping getWrustel(){
        return new Topping("Wrustel");
    }

    @Bean
    public Topping getTonnoCipolla(){
        return new Topping("Tonno e cipolla");
    }

    @Bean
    public Pizza getPinkPizza(){
        return new Pizza( 5, "Pink Pizza", 600, getProsciutto());
    }

    @Bean
    public Drink getCoke(){
        return new Drink("Coke", 3, 11, 0.33);
    }

    @Bean
    public Pizza getPizzaWrustel(){
        return new Pizza(6.99, "Wrustellara", 900, getWrustel());
    }

    @Bean
    public Pizza getPizzaTonnoCipolla(){
        return new Pizza(6.50, "Tonno e Cipolla", 800, getTonnoCipolla());
    }


    @Bean
    public Drink getFanta(){
        return new Drink("Fanta", 3, 15, 0.33);
    }

    @Bean
    public Drink getBeer(){
        return new Drink("Ichnusa non filtrata", 5, 25, 0.5);
    }



}
