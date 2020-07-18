package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class NotificacionUsuario {
    private Long id;
    private Long idUsuario;
    private Long idNotificacion;
    private Date fechaCreacion;
    private boolean visto;
}
