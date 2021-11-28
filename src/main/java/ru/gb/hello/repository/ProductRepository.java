package ru.gb.hello.repository;

import org.springframework.stereotype.Component;
import ru.gb.hello.entity.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    List<Product> products = new ArrayList<>();

    @PostConstruct
    private void init() {
        products = new ArrayList<>();
        products.add(new Product(0, "Chocolate", 200.0));
        products.add(new Product(1, "Milk", 100.0));
        products.add(new Product(2, "Eggs", 120.0));
        products.add(new Product(3, "Tea", 220.0));
        products.add(new Product(4, "Coffee", 500.0));
    }

    public Product addProduct (Product product){
        products.add(product);
        product.setId(products.size() - 1);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .cost(product.getCost())
                .build();
    }

    public Product editProduct(Product product){
        return products.set(product.getId(), product);
    }

    public Optional<Product> findById(int id) {
        if (id < products.size()){
            return Optional.of(products.get(id));
        } else {
            return Optional.empty();
        }
    }

    public Iterable<Product> findAll() {
        return new ArrayList<>(products);
    }

    public long count() {
        return products.size();
    }

    public void deleteById(int id){
        if (id < products.size()){
            products.remove(id);
        }
    }
}
