package com.udc.repository.model.factories;

import com.udc.repository.model.Estudiante;
import com.udc.repository.model.Usuario;

public class FabricaEstudiante extends FabricaUsuario {

    public Estudiante factory(Long id, String nombre, String apellido, String correo, String contrasena, boolean status,
                              String codigo) {
        return Estudiante
                .builder()
                .id(id)
                .nombre(nombre)
                .apellido(apellido)
                .correo(correo)
                .contrasena(contrasena)
                .estado(status)
                .codigo(codigo)
                .build();
    }

    @Override
    public Usuario superFactory(Long id, String nombre, String apellido, String correo, String contrasena, boolean status) {
        return Estudiante.builder().build();
    }

    @Override
    public Usuario defaultFactory() {
        return Estudiante.builder().build();
    }
}
