package com.udc.repository.receiver.rest.controller;

import com.udc.repository.adapter.dto.CursoData;
import com.udc.repository.adapter.dto.DocenteData;
import com.udc.repository.model.Curso;
import com.udc.repository.model.Docente;
import com.udc.repository.model.factories.ModelFactory;
import com.udc.repository.model.gateway.DocenteRepository;
import com.udc.repository.usecases.GestionarCursosUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    GestionarCursosUseCase gestionarCursosUseCase;
    @Autowired
    DocenteRepository docenteRepository;

    @PostMapping("/course")
    public CursoData createNote(@RequestBody CursoData cursoData) {
        return toData(
                gestionarCursosUseCase.crearCurso(
                        ModelFactory.fabricarCurso(
                                cursoData.getNombre(),
                                cursoData.getAno(),
                                cursoData.getPeriodo(),
                                ModelFactory.fabricarDocente()
                        )
                )
        );
    }

    // Get All Notes
    @GetMapping("/course")
    public List<CursoData> getAllNotes() {
        return null;//gestionarCursosUseCase.findAll();
    }

    private CursoData toData(Curso curso) {
        Docente docente = curso.getDocente();
        DocenteData docenteData = new DocenteData(
                docente.getId(),
                docente.getNombre(),
                docente.getApellido(),
                docente.getCorreo(),
                docente.getContrasena(),
                docente.isEstado());
        return new CursoData(curso.getId(), curso.getNombre(), curso.getPeriodo(), curso.getAno(), docenteData);
    }
}
