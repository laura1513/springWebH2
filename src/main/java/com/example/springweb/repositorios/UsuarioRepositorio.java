package com.example.springweb.repositorios;

import com.example.springweb.modelos.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

}