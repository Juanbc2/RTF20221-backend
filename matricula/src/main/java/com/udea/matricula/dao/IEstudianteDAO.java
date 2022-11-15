package com.udea.matricula.dao;
 
import com.udea.matricula.model.Estudiante;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface IEstudianteDAO extends CrudRepository<Estudiante, Long> {

  Optional<Estudiante> findByDocument(Long document);
  
}

