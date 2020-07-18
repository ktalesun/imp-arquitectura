package com.udc.repository.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "curso")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoData {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String periodo;
    @NotBlank
    private String ano;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "DOCENTE_ID")
    private DocenteData docente;
}
