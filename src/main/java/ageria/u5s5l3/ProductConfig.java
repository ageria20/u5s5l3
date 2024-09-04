package ageria.u5s5l3;


import ageria.u5s5l3.entities.*;
import ageria.u5s5l3.enums.StatoOrdine;
import ageria.u5s5l3.enums.TableStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ProductConfig {


    @Bean(name="prosciutto")
    public Topping getProsciutto(){
        return new Topping("prosciutto");
    }

    @Bean(name="wrustel")
    public Topping getWrustel(){
        return new Topping("Wrustel");
    }

    @Bean(name="tonnoCipolla")
    public Topping getTonnoCipolla(){
        return new Topping("Tonno e cipolla");
    }

    @Bean(name="pinkPizza")
    public Pizza getPinkPizza(){
        return new Pizza( 5, "Pink Pizza", 600, getProsciutto());
    }

    @Bean(name="coke")
    public Drink getCoke(){
        return new Drink("Coke", 2, 11, 0.33);
    }

    @Bean(name="pizzaWrustel")
    public Pizza getPizzaWrustel(){
        return new Pizza(6.99, "Wrustellara", 900, getWrustel());
    }

    @Bean(name="pizzaTonnoCipolla")
    public Pizza getPizzaTonnoCipolla(){
        return new Pizza(6.50, "Tonno e Cipolla", 800, getTonnoCipolla());
    }


    @Bean(name="fanta")
    public Drink getFanta(){
        return new Drink("Fanta", 3, 15, 0.33);
    }

    @Bean(name="beer")
    public Drink getBeer(){
        return new Drink("Ichnusa non filtrata", 5, 25, 0.5);
    }

    @Bean
    public Menu getMenu(){
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(getPinkPizza());
        pizzaList.add(getPizzaWrustel());
        pizzaList.add(getPizzaTonnoCipolla());
        List<Drink> drinksList = new ArrayList<>();
        drinksList.add(getCoke());
        drinksList.add(getCoke());
        drinksList.add(getBeer());
        List<Topping> toppingsList = new ArrayList<>();
        toppingsList.add(getProsciutto());
        toppingsList.add(getWrustel());
        toppingsList.add(getTonnoCipolla());

        return new Menu(pizzaList, drinksList, toppingsList);
    }

    @Bean
    @Primary
    public Tavolo tb1(){
        return new Tavolo(1, TableStatus.LIBERO, 2);
    }
    @Bean
    public Tavolo tb2(){
        return new Tavolo(2, TableStatus.LIBERO, 6);
    }
    @Bean
    public Tavolo tb3(){
        return new Tavolo(3, TableStatus.OCCUPATO, 8);
    }

    @Bean
    public Ordine getOrder(Tavolo tavolo, @Value("${costo.coperto}")String coperto, @Qualifier("prosciutto") Topping prosciutto, @Qualifier("pinkPizza") Pizza pinkPizza, @Qualifier("tonnoCipolla") Topping tonnoCipolla, @Qualifier("pizzaTonnoCipolla") Pizza pizzaTonnoCipolla, @Qualifier("coke") Drink coke, @Qualifier("beer") Drink beer ) {
        List<Product> order = new ArrayList<>();

        order.add(pinkPizza);
        order.add(pizzaTonnoCipolla);
        order.add(coke);
        order.add(beer);

        return new Ordine(tb1(), order, 1, StatoOrdine.PRONTO, 6, LocalDateTime.of(2024, 9, 3, 20,30));
    }

}
