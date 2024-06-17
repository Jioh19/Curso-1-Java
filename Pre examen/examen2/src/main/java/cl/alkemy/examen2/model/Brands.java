package cl.alkemy.examen2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brand_id;
    private String brand_name;
}
