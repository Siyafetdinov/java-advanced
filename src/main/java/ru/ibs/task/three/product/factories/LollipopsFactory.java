package ru.ibs.task.three.product.factories;

import ru.ibs.task.three.product.logic.Product;
import ru.ibs.task.three.product.sweet.Lollipops;

public class LollipopsFactory {
    public Product createProduct() {

        String[] names = {"Jolly Rancher", "Werther's", "Баварский фруктовый карамель", "Барбарис", "Дюшес"};
        double weight = Math.random() * 100 + 1000;
        double coast = Math.random() * 10 + 100;
        String[] fruitTaste = {"Яблоко", "Лимон", "Апельсин"};


        return new Lollipops(
                names[(int) (Math.random() * names.length)],
                weight,
                coast,
                fruitTaste[(int) (Math.random() * fruitTaste.length)]
        );
    }
}
