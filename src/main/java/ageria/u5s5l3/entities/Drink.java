package ageria.u5s5l3.entities;


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
