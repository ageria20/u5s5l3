package ageria.u5s5l2.entities;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {

    private List<Pizza> pizze;
    private List<Drink> drinks;
    private List<Topping> toppings;


    public Menu(List<Pizza> pizze, List<Drink> drinks, List<Topping> toppings) {
        this.pizze = pizze;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", drinks=" + drinks +
                ", toppings=" + toppings +
                '}';
    }
}
