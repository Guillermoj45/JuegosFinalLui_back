package com.multicast.juegofinallui_back.repository;

import com.multicast.juegofinallui_back.entity.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantesRepository extends JpaRepository<Participante, Integer> {
}
