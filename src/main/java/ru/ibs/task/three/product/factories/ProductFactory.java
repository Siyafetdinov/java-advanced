package ru.ibs.task.three.product.factories;

import ru.ibs.task.three.product.logic.Product;
import java.util.List;

public class ProductFactory {
    public static Product getNewProduct() {
        List<Product> product = List.of(
                new CandiesFactory().createProduct(),
                new LollipopsFactory().createProduct(),
                new MarmaladeFactory().createProduct());
        return product.get((int) (Math.random() * product.size()));
    }
}
