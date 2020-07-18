package com.udc.repository.model.factories;

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

    public static Docente fabricarDocente() {
        return Docente
                .builder()
                .build();
    }
}
