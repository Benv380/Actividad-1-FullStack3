package cl.duoc.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ManHours {
    private int hours;
    private String productName;
    private String workerName;
    private String description;
    private int price;
}
