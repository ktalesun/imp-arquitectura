package com.udc.repository.adapter.mysql.gateway;

import com.udc.repository.adapter.mysql.dto.EstudianteData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteDataRepository extends JpaRepository<EstudianteData, Long> {
}
