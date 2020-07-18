package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ObjetivoCompletado {
    private Long id;
    private Long idLineamiento;
    private Long idAvanceProyecto;
}
