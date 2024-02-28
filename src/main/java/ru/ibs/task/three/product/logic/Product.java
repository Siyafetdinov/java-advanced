package ru.ibs.task.three.product.logic;

import java.util.Objects;

public abstract class Product {
    private String name;
    private double weight;
    private double coast;

    public Product(String name, double weight, double coast) {
        this.name = name;
        this.weight = weight;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        if (coast < 0) {
            return;
        }
        this.coast = coast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 && Double.compare(product.coast, coast) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, coast);
    }

    @Override
    public String toString() {
        return "\nПродукт = " +
                "Имя: " + name +
                " | Вес: " + String.format("%.2f", weight) +
                " | Цена: " + String.format("%.2f", coast);
    }
}
