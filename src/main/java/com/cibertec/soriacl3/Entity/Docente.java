package com.cibertec.soriacl3.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_docente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dni")
    private String dni;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(value = TemporalType.DATE)
    @Column(name = "fch_nacimiento")
    private Date fch_nacimiento;

    @Column(name = "sueldo")
    private double sueldo;

    @Column(name = "email")
    private String email;

    @Column(name = "sexo")
    private String sexo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;




}
