package com.cibertec.soriacl3.repository;

import com.cibertec.soriacl3.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
