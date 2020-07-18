package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Docente {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private boolean estado;
}
