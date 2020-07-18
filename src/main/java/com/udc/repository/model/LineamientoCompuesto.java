package com.udc.repository.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class LineamientoCompuesto extends Lineamiento {

    private ArrayList<Lineamiento> lineamientos;

    @Builder
    LineamientoCompuesto(Long id, String objetivo, String criterioAceptacion, ArrayList<Lineamiento> lineamientos) {
        super(id, objetivo, criterioAceptacion);
        this.lineamientos = lineamientos;
    }
}
