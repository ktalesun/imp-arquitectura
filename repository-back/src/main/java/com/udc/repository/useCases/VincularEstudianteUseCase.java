package com.udc.repository.useCases;

import com.udc.repository.model.Estudiante;
import com.udc.repository.model.gateway.EstudianteRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VincularEstudianteUseCase {
    private final EstudianteRepository estudianteRepository;

    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}
