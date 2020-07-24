package com.udc.repository.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
public class AvanceProyecto {
    private Long id;
    private ArrayList<String> entregables;
}
