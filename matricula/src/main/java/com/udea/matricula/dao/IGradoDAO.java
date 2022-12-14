package com.udea.matricula.dao;
import java.util.Optional;
import com.udea.matricula.model.Grado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradoDAO extends CrudRepository<Grado, Long> {
    public Optional<Grado> getByGrade(String grade);

}
