/*
 * Clase intermedia que permite desacoplar la relación de agregación que puede existir entre Curso y Estudiante,
 * inicialmente se pensó en una relación de agregación entre Curso y Estudiante pero se decide usar la clase intermedia
 * CursoEstudiante para tener mas maniobra sobre la gestión de los estudiantes en un curso.
 * */

package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CursoEstudiante {
    private Long id;
    private Long idCurso;
    private Long idEstudiante;
}
