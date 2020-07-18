package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalificacionAvance {
    private Long id;
    private Long idAvance;
    private Long idcalificacion;
}
