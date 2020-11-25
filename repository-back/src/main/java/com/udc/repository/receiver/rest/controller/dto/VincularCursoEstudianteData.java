package com.udc.repository.receiver.rest.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VincularCursoEstudianteData {
    private Long idCurso;
    private Long idEstudiante;
}
