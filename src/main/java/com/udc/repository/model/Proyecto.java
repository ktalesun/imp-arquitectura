package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Proyecto {
    private Long id;
    private String titulo;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private String description;
}
