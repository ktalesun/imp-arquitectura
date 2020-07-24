package com.udc.repository.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Lineamiento {
    private Long id;
    private String objetivo;
    private String criterioAceptacion;
}
