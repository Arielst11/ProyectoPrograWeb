package com.ProyectoPrograWeb.service;

import com.ProyectoPrograWeb.domain.Item;
import java.util.List;
import java.util.ArrayList;
public interface ItemService {
    
    //Los métodos para hacer un CRUD de la tabla item
    //Create Read Update Delete
    
    public List<Item> listaItems = new ArrayList<>();
    
    public List<Item> getItems();
    
    public Item getItem(Item item);
    
    public void save(Item item);
    
    public void delete(Item item);
    
    public void actualiza(Item item);
    
    public void facturar();
    
}
