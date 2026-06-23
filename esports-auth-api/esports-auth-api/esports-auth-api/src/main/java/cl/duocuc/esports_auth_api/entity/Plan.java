package cl.duocuc.esports_auth_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "planes")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // Ej: "Socio Oro", "Socio Plata"
}