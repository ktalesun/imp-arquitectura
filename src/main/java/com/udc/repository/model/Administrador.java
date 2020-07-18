package com.udc.repository.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Administrador extends Usuario {
    // Que cargo desempeña.
    private String cargo;
    // En que dependencia, departamento o area se encuentra vinculado.
    private String dependencia;

    @Builder
    public Administrador(Long id, String nombre, String apellido, String correo, String contrasena, boolean estado,
                         String cargo, String dependencia) {
        super(id, nombre, apellido, correo, contrasena, estado);
        this.cargo = cargo;
        this.dependencia = dependencia;
    }
}
