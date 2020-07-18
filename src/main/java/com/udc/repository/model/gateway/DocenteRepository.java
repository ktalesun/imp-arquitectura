package com.udc.repository.model.gateway;

import com.udc.repository.adapter.dto.DocenteData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<DocenteData, Long> {
}