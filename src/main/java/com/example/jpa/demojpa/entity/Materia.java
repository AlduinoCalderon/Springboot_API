package com.example.jpa.demojpa.entity;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreMateria;
    private Integer estadoMateria;
    private Integer semestreMateria;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public Integer getEstadoMateria() {
        return estadoMateria;
    }
    public void setEstadoMateria(Integer estadoMateria) {
        this.estadoMateria = estadoMateria;
    }
    public Integer getSemestreMateria() {
        return semestreMateria;
    }
    public void setSemestreMateria(Integer semestreMateria) {
        this.semestreMateria = semestreMateria;
    }
    

}
