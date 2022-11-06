package com.ProyectoPrograWeb.domain;

import java.io.Serializable;
import javax.persistence.*;
/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
*/
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    Long idArticulo;
    private String descripcion;
    private double precio;
    private int existencias;
    private boolean activo;
    
    public Articulo() {
    }

    public Articulo(String descripcion, double precio, int existencias, boolean activo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }

 

  
  




}
