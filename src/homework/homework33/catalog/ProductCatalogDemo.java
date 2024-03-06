package homework33.catalog;

public class ProductCatalogDemo {

    public static void main(String[] args) {


        ProductCatalog catalog = new ProductCatalog();

        Product product1 = new Product("Dress", 123.49);
        Product product2 = new Product("Jacket", 565.99);
        Product product3 = new Product("Jeans", 275.49);
        Product product4 = new Product("Shirt", 199.49);
        Product product5 = new Product("Skirt", 99.99);

        catalog.addProduct(12354,product1);
        catalog.addProduct(57643,product2);
        catalog.addProduct(476429,product3);
        catalog.addProduct(98664,product4);
        catalog.addProduct(98756,product5);

        catalog.deleteProduct(476429);

        catalog.findProduct(12354);



    }
}