package homework33.catalog;

import java.util.HashMap;

import java.util.Map;


//Реализовать класс ProductCatalog, который будет управлять каталогом продуктов.
//
//Класс ProductCatalog должен содержать следующие методы:
//- `addProduct(int productId, Product product)`: добавляет продукт в каталог.
//Если продукт с таким идентификатором уже существует, выдается сообщение об
//ошибке, указывающее на то, что продукт с данным идентификатором уже есть в
//каталоге.
//- `deleteProduct(int productId)`: удаляет продукт из каталога по его
//идентификатору. Если продукт с таким идентификатором не найден, выдается
//сообщение об ошибке, указывающее на отсутствие продукта с таким идентификатором.
//- `findProduct(int productId)`: возвращает продукт по его идентификатору.
//Если продукт с таким идентификатором не найден, выдается сообщение об ошибке
//и метод возвращает `null`.
public class ProductCatalog {

    Map<Integer, Product> products = new HashMap<>();

    public void addProduct(int productId, Product product) {
        if (products.containsKey(productId)) {
            System.out.println("Product with this ID - " + productId + " already exists in the catalog.");
        } else {
            products.put(productId, product);

        }

    }


    public void deleteProduct(int productId) {
        if (!products.containsKey(productId)) {
            System.out.println("Product with this ID - "+ productId + " is not found in the catalog.");
        } else {
            products.remove(productId);
            System.out.println("The product " + productId + "is deleted");
        }

    }

    public Product findProduct(int productId) {
        if (products.containsKey(productId)) {
            System.out.println("Product with this ID - " + productId + " is found");
            return products.get(productId);
        } else {
            return null;
        }
    }

}
