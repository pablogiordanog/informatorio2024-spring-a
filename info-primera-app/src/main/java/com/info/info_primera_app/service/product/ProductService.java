package com.info.info_primera_app.service.product;

import com.info.info_primera_app.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(String uuid);
    void updateProduct(String uuid, Product product);
}
