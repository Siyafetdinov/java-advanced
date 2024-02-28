package ru.ibs.task.three.product.sweet;

import ru.ibs.constants.ColorANSI;
import ru.ibs.task.three.product.logic.Product;

import java.awt.*;
import java.util.Objects;

public class Lollipops extends Product {

    String fruitTaste;

    public Lollipops(String name, double weight, double coast, String fruitTaste) {
        super(name, weight, coast);
        this.fruitTaste = fruitTaste;
    }

    public String getFruitTaste() {
        return fruitTaste;
    }

    public void setFruitTaste(String fruitTaste) {
        this.fruitTaste = fruitTaste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lollipops lollipops = (Lollipops) o;
        return Objects.equals(fruitTaste, lollipops.fruitTaste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fruitTaste);
    }

    @Override
    public String toString() {
        return super.toString() + ColorANSI.PURPLE + " | Вкус: " + fruitTaste + ColorANSI.RESET;
    }
}
