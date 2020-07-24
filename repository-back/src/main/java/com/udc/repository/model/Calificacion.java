package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Calificacion {
    private Long id;
    private int valor;
    private String comentario;
}
