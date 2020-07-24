package com.udc.repository.receiver.rest.controller;

import com.udc.repository.model.Estudiante;
import com.udc.repository.receiver.rest.controller.dto.EstudianteData;
import com.udc.repository.useCases.VincularEstudianteUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    @Autowired
    private VincularEstudianteUseCase vincularEstudianteUseCase;
    @Autowired
    ObjectMapper mapper;

    @PostMapping("/estudiante")
    public EstudianteData crearEstudiante(@RequestBody EstudianteData estudianteData) {
        return mapper.map(vincularEstudianteUseCase
                        .crearEstudiante(mapper.mapBuilder(estudianteData, Estudiante.EstudianteBuilder.class).build()),
                EstudianteData.class);
    }
}
