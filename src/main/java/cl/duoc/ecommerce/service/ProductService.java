package cl.duoc.ecommerce.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.ecommerce.model.ManHours;
import cl.duoc.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository product;

    public ProductService(ProductRepository product) {
        this.product = product;
    }
    

    public List<ManHours> getAllProducts() throws IOException {
        return product.findAll();
    }


    public void addProduct(ManHours newProduct) {
        product.save(newProduct);
    }
    

}


