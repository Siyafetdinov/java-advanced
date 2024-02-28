package ru.ibs.task.three.product.factories;

import ru.ibs.task.three.product.logic.Product;
import ru.ibs.task.three.product.sweet.Marmalade;

public class MarmaladeFactory {
    public Product createProduct() {

        String[] names = {"Jolly Rancher", "Werther's", "Баварский фруктовый карамель", "Барбарис", "Дюшес"};
        double weight = Math.random() * 100 + 1000;
        double coast = Math.random() * 100 + 100;
        String[] form = {"Фрукты", "Полусферы", "Буквы", "Конструктор"};


        return new Marmalade(
                names[(int) (Math.random() * names.length)],
                weight,
                coast,
                form[(int) (Math.random() * form.length)]
        );
    }
}
