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
    public List<Usuario> findAllUsuarios() {return usuarioRepositorio.findAll();}

    @Override
    public Usuario findUsuario(int id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void deleteUsuario(int id) {
        usuarioRepositorio.deleteById(id);
    }
}
