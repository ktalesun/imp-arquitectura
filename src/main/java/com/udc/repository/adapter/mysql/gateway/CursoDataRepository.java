package com.udc.repository.adapter.mysql.gateway;

import com.udc.repository.adapter.mysql.dto.CursoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoDataRepository extends JpaRepository<CursoData, Long> {
}
