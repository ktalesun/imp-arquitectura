package com.udc.repository;


import com.udc.repository.model.gateway.CursoRepository;
import com.udc.repository.usecases.GestionarCursosUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public GestionarCursosUseCase gestionarCursosUseCase(CursoRepository cursoRepository) {
        return new GestionarCursosUseCase(cursoRepository);
    }
}
