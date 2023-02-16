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

    @RequestMapping(value ="/usuarios")
    public String index(Model model) {
        return "redirect:/";
    }

    @GetMapping(value = "/usuarios/nuevo")
    public String nuevoUser(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "createUser";
    }

    @PostMapping(value = "/usuarios")
    public String guardarUser(@ModelAttribute("usuario") Usuario usuario) {
        usuarioServicio.createUsuario(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping(value = "/usuarios/{id}")
    public String updateUser(@PathVariable int id, Model model) {
        Usuario usuario = usuarioServicio.findUsuario(id);
        model.addAttribute("usuario", usuario);
        return "updateUser";
    }

    @PostMapping(value = "/usuarios/{id}")
    public String actualizarUser(@PathVariable int id, @ModelAttribute("usuario") Usuario usuario) {
        Usuario exist = usuarioServicio.findUsuario(id);

        exist.setId((long) id);
        exist.setNombre(usuario.getNombre());
        exist.setPassword(usuario.getPassword());

        usuarioServicio.updateUsuario(exist);
        return "redirect:/usuarios";
    }

    @RequestMapping(value ="/usuarios/delete/{id}")
    public String deleteUser(@PathVariable int id, Model model) {
        usuarioServicio.deleteUsuario(id);
        return "redirect:/usuarios";
    }
}
