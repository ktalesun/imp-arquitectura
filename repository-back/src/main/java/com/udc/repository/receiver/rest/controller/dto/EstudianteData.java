package com.udc.repository.receiver.rest.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteData {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private boolean estado;
    private String codigo;
}
