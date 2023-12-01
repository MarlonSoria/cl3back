package com.cibertec.soriacl3.serviceImpl;

import com.cibertec.soriacl3.Entity.Docente;
import com.cibertec.soriacl3.repository.DocenteRepository;
import com.cibertec.soriacl3.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImpl implements DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> listarDocente() {
        return docenteRepository.findAll();
    }

    @Override
    public Optional<Docente> listarDocentePorId(Integer id) {
        return docenteRepository.findById(id);
    }

    @Override
    public void guardar(Docente docente) {
        docenteRepository.save(docente);

    }

    @Override
    public void actualizar(Docente docente) {
        Docente object = docenteRepository.findById(docente.getId_docente()).get();
        if (object != null) {
            object.setNombre(docente.getNombre());
            object.setDni(docente.getDni());
            object.setFch_nacimiento(docente.getFch_nacimiento());
            object.setSueldo(docente.getSueldo());
            object.setEmail(docente.getEmail());
            object.setSexo(docente.getSexo());
            //object.setId_docente(docente.getId_docente());
            docenteRepository.save(object);
        }

    }

    @Override
    public void eliminar(Integer id) {
    docenteRepository.deleteById(id);
    }
}
