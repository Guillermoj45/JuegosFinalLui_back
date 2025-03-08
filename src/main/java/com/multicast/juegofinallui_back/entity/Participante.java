package com.multicast.juegofinallui_back.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Participante {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToMany
    private List<Ubicacion> ubicaciones;

    @Column(name = "puntaje")
    private Double puntaje;

}
