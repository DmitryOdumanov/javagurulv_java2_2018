package lv.javaguru.java2.db;

import lv.javaguru.java2.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryDatabase implements Database {
    private List<Product> products = new ArrayList<>();
    @Override
    public void addProduct(Product product){
        products.add(product);
    };
    @Override
    public Optional<Product> findProductByTitle(String title){
    return products.stream()
       .filter(p -> p.getTitle().equals(title))
       .findFirst();
    }
    @Override
    public boolean deleteProduct(Product product){
        return products.remove(product);
    }
    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
