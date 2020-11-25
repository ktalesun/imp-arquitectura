package com.udc.repository.model.gateway;

import com.udc.repository.model.Curso;
import com.udc.repository.model.CursoEstudiante;
import com.udc.repository.model.Estudiante;

public interface CursoEstudianteRepository {
    CursoEstudiante vincularEstudiante(Curso curso, Estudiante estudiante);
}
