package com.cibertec.soriacl3.repository;

import com.cibertec.soriacl3.Entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Integer> {
}
