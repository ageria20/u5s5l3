package ageria.u5s5l1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;




public class Drink extends Product{
    private double lt;

    public Drink(String description, double price, int kcals, double lt) {
        super(price, description, kcals);
        this.lt = lt;
    }



    public double getLt() {
        return lt;
    }

    public void setLt(double lt) {
        this.lt = lt;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "lt=" + lt +
                '}';
    }
}
