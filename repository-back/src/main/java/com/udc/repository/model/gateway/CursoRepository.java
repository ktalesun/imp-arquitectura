package com.udc.repository.model.gateway;

import com.udc.repository.model.Curso;
import org.springframework.stereotype.Repository;

public interface CursoRepository {
    Curso save(Curso curso);

    Curso findById(Long id);
}