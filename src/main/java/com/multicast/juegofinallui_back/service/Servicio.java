package com.multicast.juegofinallui_back.service;


import com.multicast.juegofinallui_back.dto.ParticipanteDTO;
import com.multicast.juegofinallui_back.entity.Participante;
import com.multicast.juegofinallui_back.entity.Ubicacion;
import com.multicast.juegofinallui_back.repository.ParticipantesRepository;
import com.multicast.juegofinallui_back.repository.UbicacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class Servicio {
    private final UbicacionRepository  ubicacionRepository;
    private final ParticipantesRepository participantesRepository;

    public List<Ubicacion> getUbicacionesAleatorias(Integer nivel){
        return ubicacionRepository.getUbicacionesAleatoria(nivel);
    }

    public Ubicacion saveUbicacion(Ubicacion ubicacion){
        return ubicacionRepository.save(ubicacion);
    }

    public Participante saveParticipantes(ParticipanteDTO participanteDTO){
        List<Ubicacion> ubicaciones = ubicacionRepository.findAllById(participanteDTO.getIdUbicaciones());

        Participante participante = new Participante();
        participante.setNombre(participanteDTO.getNombre());
        participante.setPuntaje(participanteDTO.getPuntaje());

        participante.setUbicaciones(ubicaciones);

        return participantesRepository.save(participante);
    }

    public Participante saveParticipante(Participante participante){
        return participantesRepository.save(participante);
    }
}
