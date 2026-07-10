package ac.java.crud.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_producto")
   private Long id;

   private String titulo;

   private Double precio;

   private Integer stock;
}
