package com.udc.repository.model.factories;

import com.udc.repository.model.Docente;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FabricaDocente extends FabricaUsuario {

    /*
     * El uso del método factory garantizará las validaciones de la información al momento de crear un objeto,
     * lanzará excepciones de negocio o construirá valores por defectos para algunos atributos según el caso.
     * */
    public Docente factory(Long id, String nombre, String apellido, String correo, String contrasena, boolean status,
                           String codigo) {
        return Docente
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
    public Docente superFactory(Long id, String nombre, String apellido, String correo, String contrasena, boolean status) {
        return Docente
                .builder()
                .id(id)
                .nombre(nombre)
                .apellido(apellido)
                .correo(correo)
                .contrasena(contrasena)
                .estado(status)
                .build();
    }

    @Override
    public Docente defaultFactory() {
        return Docente.builder().build();
    }
}
