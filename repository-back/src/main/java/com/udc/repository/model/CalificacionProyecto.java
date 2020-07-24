package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalificacionProyecto {
    private Long id;
    private Long idProyecto;
    private Long idCalificacion;
}
