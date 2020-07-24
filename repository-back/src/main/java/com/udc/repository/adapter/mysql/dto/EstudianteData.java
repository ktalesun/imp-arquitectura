package com.udc.repository.adapter.mysql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteData {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private boolean estado;
    private String codigo;
}
