package com.udc.repository.adapter.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.udc.repository.model.Curso;
import com.udc.repository.model.Docente;
import com.udc.repository.model.gateway.CursoRepository;
import com.udc.repository.utils.AdapterOperation;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepositoryAdapter extends AdapterOperation<Curso, CursoData, Long, CursoDataRepository> implements CursoRepository {
    public CursoRepositoryAdapter(CursoDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, CursoRepositoryAdapter::toEntity);
    }

    public static Curso toEntity(CursoData data) {
        return Curso.builder()
                .nombre(data.getNombre())
                .periodo(data.getPeriodo())
                .ano(data.getAno())
                .id(data.getId())
                .docente(
                        Docente.builder()
                                .id(data.getDocente().getId())
                                .nombre(data.getDocente().getNombre())
                                .apellido(data.getDocente().getApellido())
                                .estado(data.getDocente().isEstado())
                                .build())
                .build();
    }
}
