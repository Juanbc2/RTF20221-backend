package com.udea.matricula.service;

import com.udea.matricula.dao.IEstudianteDAO;
import com.udea.matricula.model.Estudiante;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    @Autowired
    private IEstudianteDAO dao;

    public Estudiante save(Estudiante t) {
        return dao.save(t);
    }

    public Estudiante update(Estudiante t) {
        return dao.save(t);
    }

    public void delete(Estudiante t) {
        dao.delete(t);
    }

    public Iterable<Estudiante> list() {
        return dao.findAll();
    }

    public Optional<Estudiante> listId(long id) {
        return dao.findById(id);
    }
    
    public Optional<Estudiante> listDocument(Long document) {
        return dao.findByDocument(document);
    }

}
