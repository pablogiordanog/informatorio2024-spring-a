package com.info.info_primera_app.repository.product;

import com.info.info_primera_app.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {

    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(UUID id);
    void updateProduct(UUID id, Product product);

}
