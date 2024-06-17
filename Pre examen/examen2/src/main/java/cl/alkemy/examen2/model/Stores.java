package cl.alkemy.examen2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="stores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int store_id;
    private String store_name;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String state;
    private String varchar;
}
