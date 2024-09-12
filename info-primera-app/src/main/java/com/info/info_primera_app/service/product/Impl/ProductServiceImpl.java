package com.info.info_primera_app.service.product.Impl;

import com.info.info_primera_app.entity.Product;
import com.info.info_primera_app.repository.product.ProductRepository;
import com.info.info_primera_app.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public void addProduct(Product product) {
        product.setIdProduct(UUID.randomUUID());
        productRepository.addProduct(product);
    }

    @Override
    public void deleteProduct(String uuid) {
        productRepository.deleteProduct(UUID.fromString(uuid));
    }

    @Override
    public void updateProduct(String uuid, Product product) {
        productRepository.updateProduct(UUID.fromString(uuid), product);
    }
}
