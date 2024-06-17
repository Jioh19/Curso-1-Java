package cl.alke.bike69.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;


@Getter
@Setter
@ToString
public class Info {
    private String store;
    private String category;
    private String brand;
}
