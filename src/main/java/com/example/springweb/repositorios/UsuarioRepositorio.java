package com.example.springweb.repositorios;

import com.example.springweb.modelos.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;


public interface UsuarioRepositorio extends ListCrudRepository<Usuario, Integer> {

}