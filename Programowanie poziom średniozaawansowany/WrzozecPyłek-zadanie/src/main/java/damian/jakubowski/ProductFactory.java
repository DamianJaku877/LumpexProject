package damian.jakubowski;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

    List<Product> products = new ArrayList<>();

    public ProductFactory(List<Product> products) {
        this.products = products;
    }

    public Product product(String name, float prize) {
        for (Product product : products) {
            if (product.name.equals(product) && product.prize == prize) {
                return product;
            }
        }
        Product product = new Product(name, prize);
        products.add(product);
        return product;
    }
}
