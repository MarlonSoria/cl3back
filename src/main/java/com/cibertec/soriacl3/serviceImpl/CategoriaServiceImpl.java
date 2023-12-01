package com.cibertec.soriacl3.serviceImpl;

import com.cibertec.soriacl3.Entity.Categoria;
import com.cibertec.soriacl3.repository.CategoriaRepository;
import com.cibertec.soriacl3.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public List<Categoria> listarCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> listarCategoriaPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void guardar(Categoria categoria) {
        categoriaRepository.save(categoria);

    }

    @Override
    public void actualizar(Categoria categoria) {
        Categoria object = categoriaRepository.findById(categoria.getId_categoria()).get();
        if (object != null) {
            object.setNombrecate(categoria.getNombrecate());
            categoriaRepository.save(object);
        }

    }

    @Override
    public void eliminar(Integer id) {
        categoriaRepository.deleteById(id);

    }
}
