package com.example.springweb.servicios;

import com.example.springweb.modelos.Usuario;

import java.util.List;

public interface UsuarioServicio {
    List<Usuario> findAllUsuarios();
    Usuario findUsuario(int id);
    Usuario createUsuario();
    Usuario updateUsuario(int id);
    void deleteUsuario(int id);
}
