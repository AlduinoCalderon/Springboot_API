package com.example.jpa.demojpa.service;
import java.util.List;
import java.util.Optional;
import com.example.jpa.demojpa.entity.Materia;

public interface MateriaService {
    List<Materia> findAll();
    Optional<Materia> findById(Integer id);
    Materia save(Materia materia);
    Optional<Materia> delete(Materia materia);
}
