package com.info.info_primera_app.controller;

import com.info.info_primera_app.entity.Product;
import com.info.info_primera_app.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/api/v1/products")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/api/v1/products")
    public Product addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return product;
    }

    @DeleteMapping("/api/v1/products/{idProducto}")
    public void deleteProduct(@PathVariable("idProducto") String idProducto){
        productService.deleteProduct(idProducto);
    }

    @PutMapping("/api/v1/products/{idProducto}")
    public void updateProduct(@PathVariable("idProducto") String idProducto, @RequestBody Product product){
        productService.updateProduct(idProducto, product);
    }

}
