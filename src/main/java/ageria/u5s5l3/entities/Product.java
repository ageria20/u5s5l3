package ageria.u5s5l3.entities;

import lombok.*;

@Getter
@Setter

@ToString
public abstract class Product {
    private double price;
    private String description;
    private int kcals;

    public Product(double price, String description, int kcals) {
        this.price = price;
        this.description = description;
        this.kcals = kcals;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKcals() {
        return kcals;
    }

    public void setKcals(int kcals) {
        this.kcals = kcals;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", kcals=" + kcals +
                '}';
    }
}
