package com.info.info_primera_app.repository.product.impl;

import com.info.info_primera_app.entity.Product;
import com.info.info_primera_app.repository.product.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    public List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return this.products;
        /*return List.of(new Product(UUID.randomUUID(),"Laptop", 999.99),
                new Product(UUID.randomUUID(),"Smartphone", 192.20),
                new Product(UUID.randomUUID(),"Tablet", 10.22),
                new Product(UUID.randomUUID(),"Keyboart", 234.45),
                new Product(UUID.randomUUID(),"Webcam", 500.81),
                new Product(UUID.randomUUID(),"USB Flash Drive", 4812.29),
                new Product(UUID.randomUUID(),"Project", 80.92),
                new Product(UUID.randomUUID(),"Game Console", 100.00),
                new Product(UUID.randomUUID(),"Camara", 345.22),
                new Product(UUID.randomUUID(),"Smart TV", 21.15));
         */
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void deleteProduct(UUID id) {
        Optional<Product> producto = this.products.stream()
                .filter(product -> product.getIdProduct().equals(id))
                .findFirst();

        if(producto.isPresent()){
            products.remove(producto.get());
        }
    }

    @Override
    public void updateProduct(UUID id, Product product) {
        Optional<Product> producto = this.products.stream()
                .filter(productFound -> productFound.getIdProduct().equals(id))
                .findFirst();

        if(producto.isPresent()){
            producto.get().setName(product.getName());
            producto.get().setPrice(product.getPrice());
        }
    }
}
