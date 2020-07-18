package com.udc.repository.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "docente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocenteData {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String correo;
    @NotBlank
    private String contrasena;
    @NotBlank
    private boolean estado;
    @NotBlank
    private String codigo;
}
