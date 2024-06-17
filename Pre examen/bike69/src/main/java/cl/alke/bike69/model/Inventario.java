package cl.alke.bike69.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Inventario {
    private String store_name;
    private int product_id;
    private int quantity;
    private String product_name;
}
