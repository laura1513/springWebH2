package com.example.springweb.controladores;

import com.example.springweb.modelos.Usuario;
import com.example.springweb.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @RequestMapping(value ="/")
    public String findAll(Model model) {
        List<Usuario> usuarios = usuarioServicio.findAllUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
