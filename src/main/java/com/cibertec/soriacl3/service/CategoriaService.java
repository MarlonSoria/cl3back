package com.cibertec.soriacl3.service;

import com.cibertec.soriacl3.Entity.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoriaService {

    public List<Categoria> listarCategoria();

    public Optional<Categoria> listarCategoriaPorId(Integer id);

    public void guardar(Categoria categoria);

    public void actualizar(Categoria categoria);

    public void eliminar(Integer id);

}
