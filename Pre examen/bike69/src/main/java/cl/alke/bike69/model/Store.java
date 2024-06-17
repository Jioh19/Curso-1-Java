package cl.alke.bike69.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int store_id;
    private String store_name;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String state;
    private String zip_code;


}
