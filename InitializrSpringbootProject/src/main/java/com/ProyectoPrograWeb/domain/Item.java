/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoPrograWeb.domain;

import lombok.Data;

/**
 *
 * @author asanc
 */
@Data
public class Item extends Articulo{
private int cantidad;

    public Item() {
    }

    public Item(Articulo articulo) {
        super.setIdArticulo(articulo.getIdArticulo());
        super.setDescripcion(articulo.getDescripcion());
        super.setPrecio(articulo.getPrecio());
        super.setExistencias(articulo.getExistencias());
        super.setActivo(articulo.isActivo());
        super.setImagen(articulo.getImagen());
        this.cantidad = 0;
        
    }



}
