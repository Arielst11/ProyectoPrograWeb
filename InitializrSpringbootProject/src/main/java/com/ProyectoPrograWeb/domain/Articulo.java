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
    private Long idArticulo;
    private String descripcion;
    private double precio;
    private int existencias;
    private boolean activo;
    @Column(name = "imagen")
    private String imagen;
    
    public Articulo() {
    }

    public Articulo(String descripcion, double precio, int existencias, boolean activo, String imagenURL) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
        this.imagen = imagenURL;
    }

 /**
     * @return the idArticulo
     */
    public Long getIdArticulo() {
        return idArticulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

  
  




}
