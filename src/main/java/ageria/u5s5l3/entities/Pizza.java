package ageria.u5s5l3.entities;

import lombok.*;

@Getter
@Setter
@ToString

public class Pizza extends Product{
    private Topping topping;


    public Pizza(double price, String description, int kcals, Topping topping) {
        super(price, description, kcals);
        this.topping = topping;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + topping +
                '}';
    }
}
