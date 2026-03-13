package cl.duoc.ecommerce.repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import cl.duoc.ecommerce.model.ManHours;
import tools.jackson.databind.ObjectMapper;

@Repository
public class ProductRepository {

    public List<ManHours> findAll() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource("data.json");

        ManHours[] products = mapper.readValue(
                resource.getInputStream(),
                ManHours[].class
        );

        return Arrays.asList(products);
    }
}
