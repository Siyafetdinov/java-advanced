package ru.ibs.task.three.product.utils;

import ru.ibs.task.three.product.factories.ProductFactory;
import ru.ibs.task.three.product.logic.Product;

public class UtilsProduct {

    /**
     * Метод формирует массив случайных продкутов
     *
     * @param size размер списка
     * @return сформированный массив продуктов
     */
    public static Product[] getRandomArrayProduct(int size){
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++)
        {
            products[i] = ProductFactory.getNewProduct();
        }

        return products;
    }
}
