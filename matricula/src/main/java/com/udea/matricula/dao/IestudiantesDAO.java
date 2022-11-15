package com.udea.matricula.dao;
import java.util.Optional;
import com.udea.matricula.model.estudiantes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IestudiantesDAO extends CrudRepository<estudiantes, Long> {
    public Optional<estudiantes> getByPid(Long pid);
}
