package ru.ibs.task.three.product.factories;

import ru.ibs.task.three.product.logic.Product;
import ru.ibs.task.three.product.sweet.Candies;

public class CandiesFactory {
    public Product createProduct() {

        String[] names = {"Рафаэлло", "Гусинные лапки", "Раковые шейки", "Красная шапочка", "Птичье молоко"};
        double weight = Math.random() * 100 + 1000;
        double coast = Math.random() * 10 + 100;
        boolean withNuts = Math.random() < 0.5;

        return new Candies(
                names[(int) (Math.random() * names.length)],
                weight,
                coast,
                withNuts
        );
    }
}
