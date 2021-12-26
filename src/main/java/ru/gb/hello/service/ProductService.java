package ru.gb.hello.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.hello.entity.Product;
import ru.gb.hello.repository.ProductRepository;



@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public Product addProduct (Product product){
        return productRepository.addProduct(product);
    }

    public Product editProduct(Product product){
        return productRepository.editProduct(product);
    }

    public Product findById(int id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public long count() {
        return productRepository.count();
    }

    public void deleteById(int id){
        productRepository.deleteById(id);
    }


}
