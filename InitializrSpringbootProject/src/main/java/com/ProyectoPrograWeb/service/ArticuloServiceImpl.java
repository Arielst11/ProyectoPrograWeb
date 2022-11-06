package com.ProyectoPrograWeb.service;

import com.ProyectoPrograWeb.dao.ArticuloDao;
import com.ProyectoPrograWeb.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloDao articuloDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos(boolean activos) {
    var lista = (List<Articulo>)articuloDao.findAll();
    
    if (activos){
        lista.removeIf(e -> !e.isActivo()); // e es todo elemento de la lista y lo va a remover si no esta activo
    }
    return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    @Transactional
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }
    
}
