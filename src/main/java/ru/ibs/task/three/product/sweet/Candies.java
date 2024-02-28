package ru.ibs.task.three.product.sweet;

import ru.ibs.constants.ColorANSI;
import ru.ibs.task.three.product.logic.Product;

import java.util.Objects;

public class Candies extends Product {

    private boolean withNuts;

    public Candies(String name, double weight, double coast, boolean withNuts) {
        super(name, weight, coast);
        this.withNuts = withNuts;
    }

    public boolean isWithNuts() {
        return withNuts;
    }

    public void setWithNuts(boolean withNuts) {
        this.withNuts = withNuts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candies candies = (Candies) o;
        return withNuts == candies.withNuts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), withNuts);
    }

    @Override
    public String toString() {
        return super.toString() + ColorANSI.CYAN + " | Орехи: " + (withNuts ? "Есть" : "Нет") + ColorANSI.RESET;
    }
}
