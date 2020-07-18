package com.udc.repository.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class LineamientoSimple extends Lineamiento {
    @Builder
    LineamientoSimple(Long id, String objetivo, String criterioAceptacion) {
        super(id, objetivo, criterioAceptacion);
    }
}
