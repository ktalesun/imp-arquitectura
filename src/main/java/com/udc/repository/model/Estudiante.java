package com.udc.repository.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Estudiante extends Usuario {
    private String codigo;

    @Builder
    public Estudiante(Long id, String nombre, String apellido, String correo, String contrasena, boolean estado, String codigo) {
        super(id, nombre, apellido, correo, contrasena, estado);
        this.codigo = codigo;
    }
}
