package com.udc.repository.adapter.mysql;

import com.udc.repository.adapter.mysql.dto.EstudianteData;
import com.udc.repository.adapter.mysql.gateway.EstudianteDataRepository;
import com.udc.repository.model.Estudiante;
import com.udc.repository.model.gateway.EstudianteRepository;
import com.udc.repository.utils.AdapterOperation;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepositoryAdapter extends AdapterOperation<Estudiante, EstudianteData, Long, EstudianteDataRepository>
        implements EstudianteRepository {

    public EstudianteRepositoryAdapter(EstudianteDataRepository estudianteDataRepository, ObjectMapper mapper) {
        super(estudianteDataRepository, mapper, EstudianteRepositoryAdapter::toEntity);
    }

    public static Estudiante toEntity(EstudianteData data) {
        return Estudiante.builder()
                .id(data.getId())
                .nombre(data.getNombre())
                .apellido(data.getApellido())
                .correo(data.getCorreo())
                .contrasena(data.getContrasena())
                .codigo(data.getCodigo())
                .estado(data.isEstado())
                .build();
    }
}
