package ageria.u5s5l3.entities;


public class Topping {
    private String ingredient;
    private String fixedIngreditne;

    public Topping(String ingredient) {
        this.fixedIngreditne = "tomato, cheese";
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getFixedIngreditne() {
        return fixedIngreditne;
    }

    public void setFixedIngreditne(String fixedIngreditne) {
        this.fixedIngreditne = fixedIngreditne;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "ingredient='" + ingredient + '\'' +
                ", fixedIngreditne='" + fixedIngreditne + '\'' +
                '}';
    }
}
