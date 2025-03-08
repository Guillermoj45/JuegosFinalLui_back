package com.multicast.juegofinallui_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "longitud")
    private Double longitud;

    @Column(name = "nivel")
    private Integer nivel;

    @ElementCollection
    @CollectionTable(name = "ubicaciones_imagenes", joinColumns = @JoinColumn(name = "ubicacion_id"))
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    @Column(name = "imagen")
    private List<String> imagenes;

}
