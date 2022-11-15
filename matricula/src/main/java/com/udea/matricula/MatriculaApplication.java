package com.udea.matricula;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.matricula.dao.IEstudianteDAO;
import com.udea.matricula.dao.IGradoDAO;
import com.udea.matricula.model.Estudiante;
import com.udea.matricula.model.Grado;

 
@Service
public class MatriculaApplication {
    
 
    @Autowired
    private IEstudianteDAO dao;
  
    public Estudiante save(Estudiante t) {return dao.save(t);}
    public Estudiante update(Estudiante t) {return dao.save(t);}
    public void delete(Estudiante t) {dao.delete(t);}
    public Iterable<Estudiante> list() {return dao.findAll();}
    public Optional<Estudiante> listId(long id) {return dao.findById(id);}

		// @Autowired
		// private IGradoDAO daoGrado;
		
		// public Grado save(Grado t) {return daoGrado.save(t);}
		// public Grado update(Grado t) {return daoGrado.save(t);}
		// public void delete(Grado t) {daoGrado.delete(t);}
		// public Iterable<Grado> list() {return daoGrado.findAll();}
		// public Optional<Grado> listId(long id) {return daoGrado.findById(id);}
     
}



// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class MatriculaApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(MatriculaApplication.class, args);
// 	}

// }