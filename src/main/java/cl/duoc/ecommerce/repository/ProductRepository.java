package cl.duoc.ecommerce.repository;

import java.io.IOException;
import java.util.ArrayList;
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

    public void save(ManHours newProduct) {

        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource("data.json");

        try {
            ManHours[] products = mapper.readValue(
                    resource.getInputStream(),
                    ManHours[].class
            );

            List<ManHours> productList = new ArrayList<>(Arrays.asList(products));
            productList.add(newProduct);

            mapper.writeValue(resource.getFile(), productList);
        } catch (IOException e) {
        }

    }
    

}
