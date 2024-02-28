package ru.ibs.task.three.product.sweet;

import ru.ibs.constants.ColorANSI;
import ru.ibs.task.three.product.logic.Product;

import java.awt.*;
import java.util.Objects;

public class Marmalade extends Product {
    private String form;

    public Marmalade(String name, double weight, double coast, String form) {
        super(name, weight, coast);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Marmalade marmalade = (Marmalade) o;
        return Objects.equals(form, marmalade.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), form);
    }

    @Override
    public String toString() {
        return super.toString() + ColorANSI.YELLOW + " | Форма: " + form + ColorANSI.RESET;
    }
}
