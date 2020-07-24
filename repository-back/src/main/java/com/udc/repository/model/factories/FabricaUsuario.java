package com.udc.repository.model.factories;

import com.udc.repository.model.Usuario;

public abstract class FabricaUsuario {
    public abstract Usuario superFactory(Long id, String nombre, String apellido, String correo, String contrasena,
                                         boolean status);

    public abstract Usuario defaultFactory();
}
