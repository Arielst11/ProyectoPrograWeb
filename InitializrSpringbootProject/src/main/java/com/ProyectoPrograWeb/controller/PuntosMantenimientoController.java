package com.ProyectoPrograWeb.controller;

import com.ProyectoPrograWeb.dao.ArticuloDao;
import com.ProyectoPrograWeb.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PuntosMantenimientoController {
    
 
    
    @GetMapping("/ubicaciones/puntosmantenimiento")
    public String inicio(Model model) {

        return "/ubicaciones/puntosmantenimiento";
    }
}