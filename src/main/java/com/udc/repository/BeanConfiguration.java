package com.udc.repository;


import com.udc.repository.model.factories.FabricaDocente;
import com.udc.repository.model.factories.FabricaEstudiante;
import com.udc.repository.model.gateway.CursoRepository;
import com.udc.repository.usecases.GestionarCursosUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public GestionarCursosUseCase gestionarCursosUseCase(CursoRepository cursoRepository) {
        return new GestionarCursosUseCase(cursoRepository);
    }

    @Bean
    public FabricaDocente fabricaDocente() {
        return new FabricaDocente();
    }

    @Bean
    public FabricaEstudiante fabricaEstudiante() {
        return new FabricaEstudiante();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapperImp();
    }
}
