package com.alura.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByActivoTrue(Pageable paginacion);
    Optional<Topico> findByTituloAndMensaje(String titulo, String mensaje);//agregado para verificar que no existan duplicados

}
