package com.cibertec.soriacl3.service;

import com.cibertec.soriacl3.Entity.Docente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DocenteService {

    public List<Docente> listarDocente();

    public Optional<Docente> listarDocentePorId(Integer id);

    public void guardar(Docente docente);

    public void actualizar(Docente docente);

    public void eliminar(Integer id);



}
