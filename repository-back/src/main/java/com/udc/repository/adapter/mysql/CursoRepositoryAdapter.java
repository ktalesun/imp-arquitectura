package com.udc.repository.adapter.mysql;

import com.udc.repository.adapter.mysql.dto.CursoData;
import com.udc.repository.adapter.mysql.gateway.CursoDataRepository;
import com.udc.repository.model.Curso;
import com.udc.repository.model.Docente;
import com.udc.repository.model.gateway.CursoRepository;
import com.udc.repository.utils.AdapterOperation;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepositoryAdapter extends AdapterOperation<Curso, CursoData, Long, CursoDataRepository> implements CursoRepository {
    private static ObjectMapper mapper;

    public CursoRepositoryAdapter(CursoDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, CursoRepositoryAdapter::toEntity);
        this.mapper = mapper;
    }

    public static Curso toEntity(CursoData data) {
        return Curso.builder()
                .nombre(data.getNombre())
                .periodo(data.getPeriodo())
                .ano(data.getAno())
                .id(data.getId())
                .docente(mapper.mapBuilder(data.getDocente(), Docente.DocenteBuilder.class).build())
                .build();
    }

    @Override
    public Curso findById(Long id) {
        return null;
    }
}
