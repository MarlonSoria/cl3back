package com.cibertec.soriacl3.controller;

import com.cibertec.soriacl3.Entity.Categoria;
import com.cibertec.soriacl3.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categorias")
    public List<Categoria> listaCategorias(){
        return categoriaService.listarCategoria();
    }

    @GetMapping("/categorias/{id}")
    public Optional<Categoria> listaCategoriaPorId(@PathVariable Integer id){
        return categoriaService.listarCategoriaPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarCategoria(@RequestBody Categoria categoria) {
        categoriaService.guardar(categoria);
    }

    @PutMapping("/actualizar")
    public void actualizarCategoria(@RequestBody Categoria categoria) {
        categoriaService.actualizar(categoria);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCategoria(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }


}
