package com.udc.repository.useCases;

import com.udc.repository.model.Curso;
import com.udc.repository.model.CursoEstudiante;
import com.udc.repository.model.Estudiante;
import com.udc.repository.model.gateway.CursoEstudianteRepository;
import com.udc.repository.model.gateway.CursoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GestionarCursosUseCase {
    private final CursoRepository cursoRepository;
//    private final CursoEstudianteRepository cursoEstudianteRepository;

    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

//    public CursoEstudiante vincularEstudiante(Curso curso, Estudiante estudiante) {
//        return cursoEstudianteRepository.vincularEstudiante(curso, estudiante);
//    }

    public CursoEstudiante vincularEstudiante(Long curso, long estudiante) {
        return null;
    }
}
