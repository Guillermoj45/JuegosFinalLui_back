package com.multicast.juegofinallui_back.repository;

import com.multicast.juegofinallui_back.entity.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Integer> {
    @Query(value = """
            SELECT u.*
            from ubicacion u
            where u.nivel = :nivel
            ORDER BY random()
            limit 3
            """,
            nativeQuery = true)
    public List<Ubicacion> getUbicacionesAleatoria(Integer nivel);
}
