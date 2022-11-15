package com.udea.matricula.controller;

import com.udea.matricula.exception.ModelNotFoundException;
import com.udea.matricula.model.Grado;
import com.udea.matricula.service.GradoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/grado")
@CrossOrigin("*")
@Api(value = "Students Management System", description = "Operations pertaining to student in Grado Management System")
public class GradoController {

  @Autowired
  GradoService GradoService;

  @ApiOperation(value = "Add a Grado")
  @PostMapping("/save")
  public long save(
      @ApiParam(value = "estudiante object store in database table", required = true) @RequestBody Grado Grado) {
    GradoService.save(Grado);
    return Grado.getIdGrado();
  }

  @ApiOperation(value = "View a list of available Grados", response = List.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @GetMapping("/listAll")
  public Iterable<Grado> listAllGrados() {
    return GradoService.list();
  }

  @ApiOperation(value = "Ver Grado por id", response = Grado.class)
  @GetMapping("/list/{id}")
  public Optional<Grado> listId(@ApiParam(value = "Id del Grado", required = true) @PathVariable("id") Long id) {
    if (GradoService.listId(id).isPresent()) {
      return GradoService.listId(id);
    } else {
      throw new ModelNotFoundException("No se ha encontrado el Grado con id: " + id);
    }
  }

  @GetMapping("/sumGrade/{grado}")
  public void sumGrade(@ApiParam(value = "sumar 1 a la ocupación", required = true) @RequestBody String grado) {
    List<Grado> antiguos = (List<Grado>) GradoService.list();
    for (Grado Grado : antiguos) {
      if (Grado.getOcupacion() < Grado.getCupos() && Grado.getGrade().equals(grado)) {
        int oldOcupacion = Grado.getOcupacion();
        int newOcupacion = oldOcupacion + 1;
        Grado.setOcupacion(newOcupacion);
        break;
      }
    }
  }

}