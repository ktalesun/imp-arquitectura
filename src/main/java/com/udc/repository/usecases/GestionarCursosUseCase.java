package com.udc.repository.usecases;

import com.udc.repository.model.Curso;
import com.udc.repository.model.gateway.CursoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GestionarCursosUseCase {
    private final CursoRepository cursoRepository;

    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
}
