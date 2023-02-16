package com.example.springweb.servicios;

import com.example.springweb.modelos.Usuario;
import com.example.springweb.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;


    @Override
    public List<Usuario> findAllUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarioRepositorio.findAll().forEach(usuarios :: add);
        return usuarios;
    }

    @Override
    public Usuario findUsuario(int id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public Usuario createUsuario() {
        return null;
    }

    @Override
    public Usuario updateUsuario(int id) {
        return null;
    }

    @Override
    public void deleteUsuario(int id) {

    }
}
