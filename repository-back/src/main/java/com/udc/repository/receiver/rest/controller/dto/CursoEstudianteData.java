package com.udc.repository.receiver.rest.controller.dto;

import com.udc.repository.adapter.mysql.dto.CursoData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoEstudianteData {
    private CursoData curso;
    private EstudianteData estudiante;
}
