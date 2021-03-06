package com.udc.repository.receiver.rest.controller;

import com.udc.repository.adapter.mysql.dto.CursoData;
import com.udc.repository.adapter.mysql.dto.DocenteData;
import com.udc.repository.model.factories.FabricaDocente;
import com.udc.repository.model.factories.ModelFactory;
import com.udc.repository.receiver.rest.controller.dto.CursoEstudianteData;
import com.udc.repository.receiver.rest.controller.dto.VincularCursoEstudianteData;
import com.udc.repository.useCases.GestionarCursosUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    FabricaDocente fabricaDocente;
    @Autowired
    GestionarCursosUseCase gestionarCursosUseCase;
    @Autowired
    ObjectMapper mapper;

    @PostMapping("/curso")
    public CursoData createCurso(@RequestBody CursoData cursoData) {
        DocenteData docenteData = cursoData.getDocente();
        return mapper.map(gestionarCursosUseCase.crearCurso(
                ModelFactory.fabricarCurso(
                        cursoData.getNombre(),
                        cursoData.getAno(),
                        cursoData.getPeriodo(),
                        fabricaDocente.factory(
                                null,
                                docenteData.getNombre(),
                                docenteData.getApellido(),
                                docenteData.getCorreo(),
                                docenteData.getContrasena(),
                                docenteData.isEstado(),
                                docenteData.getCodigo()
                        )
                )),
                CursoData.class);
    }

    @PostMapping("/curso/:idCurso/vincular/:idEstudiante")
    public CursoEstudianteData vincularEstudiante(@RequestBody VincularCursoEstudianteData cursoEstudiante) {
        return mapper.map(
                gestionarCursosUseCase.vincularEstudiante(cursoEstudiante.getIdCurso(), cursoEstudiante.getIdEstudiante()),
                CursoEstudianteData.class);
    }

    // Get All Notes
    @GetMapping("/course")
    public List<CursoData> getAllNotes() {
        return null;//gestionarCursosUseCase.findAll();
    }
}
