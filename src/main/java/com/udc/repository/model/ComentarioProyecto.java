package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ComentarioProyecto {
    private Long id;
    private Long idUsuario;
    private Long idProyecto;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private String comentario;
}
