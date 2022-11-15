package com.udea.matricula.service;

import com.udea.matricula.dao.IestudiantesDAO;
import com.udea.matricula.model.estudiantes;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estudiantesService {

    @Autowired
    private IestudiantesDAO dao;

    public estudiantes save(estudiantes t) {
        return dao.save(t);
    }

    public estudiantes update(estudiantes t) {
        return dao.save(t);
    }

    public void delete(estudiantes t) {
        dao.delete(t);
    }

    public Iterable<estudiantes> list() {
        return dao.findAll();
    }

    public Optional<estudiantes> listId(long id) {
        return dao.findById(id);
    }

}
