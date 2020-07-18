/*
 *
 * */

package com.udc.repository.model.factories;

import com.udc.repository.model.Administrador;
import com.udc.repository.model.Curso;
import com.udc.repository.model.Docente;

public class ModelFactory {
    public static Curso fabricarCurso(String nombre, String ano, String periodo, Docente docente) {
        return Curso
                .builder()
                .nombre(nombre)
                .ano(ano)
                .periodo(periodo)
                .docente(docente)
                .build();
    }

    public static Administrador fabricarAdministrador(Long id, String nombre, String apellido, String correo,
                                                      String contrasena, boolean status, String cargo, String dependencia) {
        return Administrador
                .builder()
                .id(id)
                .nombre(nombre)
                .apellido(apellido)
                .correo(correo)
                .contrasena(contrasena)
                .estado(status)
                .cargo(cargo)
                .dependencia(dependencia)
                .build();
    }
}
