package com.multicast.juegofinallui_back.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParticipanteDTO {

    private String nombre;
    private List<Integer> idUbicaciones;
    private Double puntaje;
}
