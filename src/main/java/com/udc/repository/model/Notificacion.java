package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notificacion {
    private Long id;
    private String titulo;
    private String contenido;
}
