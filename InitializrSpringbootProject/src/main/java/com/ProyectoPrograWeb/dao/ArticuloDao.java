package com.ProyectoPrograWeb.dao;

import com.ProyectoPrograWeb.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloDao 
        extends JpaRepository<Articulo, Long>{
    
}
