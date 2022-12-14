package com.udea.matricula.service;

import com.udea.matricula.dao.IGradoDAO;
import com.udea.matricula.model.Grado;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradoService {

    @Autowired
    private IGradoDAO dao;

    public Grado save(Grado t) {
        return dao.save(t);
    }

    public Grado update(Grado t) {
        return dao.save(t);
    }

    public void delete(Grado t) {
        dao.delete(t);
    }

    public Iterable<Grado> list() {
        return dao.findAll();
    }

    public Optional<Grado> listId(long id) {
        return dao.findById(id);
    }

    public Optional<Grado> getByGrade(String grade){
        return dao.getByGrade(grade);
    }

    public void refreshAll(List<Grado> grados) {
        dao.deleteAll();
        dao.saveAll(grados);
      }
}