package com.udea.matricula.controller;
 
import com.udea.matricula.exception.ModelNotFoundException;
import com.udea.matricula.model.estudiantes;
import com.udea.matricula.service.estudiantesService;
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
@RequestMapping("/matricula")
@CrossOrigin("*")
@Api(value="Students Management System", description="Operations pertaining to student in estudiantes Management System")
public class estudiantesController {
    
    
@Autowired
estudiantesService estudiantesService;
 
@ApiOperation(value = "Add a estudiantes")
@PostMapping("/save")
public long save(@ApiParam(value = "estudiante object store in database table", required = true) @RequestBody estudiantes estudiantes){
estudiantesService.save(estudiantes);
return estudiantes.getIdEstudiantes();
}
 
@ApiOperation(value = "View a list of available estudiantess", response = List.class) 
@ApiResponses(value = {
@ApiResponse(code = 200, message = "Successfully retrieved list"),
    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
})     
@GetMapping("/listAll")
public Iterable<estudiantes> listAllestudiantess(){return estudiantesService.list();}
 
@ApiOperation(value = "Get a estudiantes by Id")
@GetMapping("/list/{id}")
public estudiantes listestudiantesById(@ApiParam(value = "estudiante id from which estudiante object will retrieve", required = true) @PathVariable("id") int id){
Optional<estudiantes> estudiantes= estudiantesService.listId(id);
if(estudiantes.isPresent()){
   return estudiantes.get();
}
 
throw new ModelNotFoundException("ID de estudiante invalido");
}
}
