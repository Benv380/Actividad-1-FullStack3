package cl.duoc.ecommerce.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ecommerce.model.ManHours;
import cl.duoc.ecommerce.service.ProductService;


@RestController

public class ProductController {
    
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/productos")
    public List<ManHours> getProducts() throws IOException {
        return productService.getAllProducts();
    }

}
