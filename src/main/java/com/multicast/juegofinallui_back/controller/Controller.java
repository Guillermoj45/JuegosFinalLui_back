package com.multicast.juegofinallui_back.controller;

import com.multicast.juegofinallui_back.dto.ParticipanteDTO;
import com.multicast.juegofinallui_back.entity.Participante;
import com.multicast.juegofinallui_back.entity.Ubicacion;
import com.multicast.juegofinallui_back.service.Servicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class Controller {

    private final Servicio servicio;

    @GetMapping("/ubicaciones/{nivel}")
    public List<Ubicacion> getUbicaciones(@PathVariable Integer nivel){
        return servicio.getUbicacionesAleatorias(nivel);
    }

    @PostMapping("/ubicacion")
    public Ubicacion saveUbicacion(@RequestBody Ubicacion ubicacion){
        return servicio.saveUbicacion(ubicacion);
    }

    @GetMapping("/resumen/{id}")
    public Participante getResumen(@PathVariable Integer id){
        return servicio.getResumen(id);
    }

    @PostMapping("/participante")
    public Participante saveParticipante(@RequestBody ParticipanteDTO participanteDTO){
        return servicio.saveParticipantes(participanteDTO);
    }

}
