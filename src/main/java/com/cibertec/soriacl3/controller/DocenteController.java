package com.cibertec.soriacl3.controller;

import com.cibertec.soriacl3.Entity.Docente;
import com.cibertec.soriacl3.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/docente")
public class DocenteController {

@Autowired
private DocenteService docenteService;

@GetMapping("/docentes")
    public List<Docente> listaDocentes(){
return docenteService.listarDocente();
}

    @GetMapping("/docentes/{id}")
    public Optional<Docente> listaClientePorId(@PathVariable Integer id){
        return docenteService.listarDocentePorId(id);
    }

    @PostMapping("/guardar")
    public void guardarDocente(@RequestBody Docente docente) {
        docenteService.guardar(docente);
    }

    @PutMapping("/actualizar")
    public void actualizarDocente(@RequestBody Docente docente) {
        docenteService.actualizar(docente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarDocente(@PathVariable Integer id) {
        docenteService.eliminar(id);
    }



}
