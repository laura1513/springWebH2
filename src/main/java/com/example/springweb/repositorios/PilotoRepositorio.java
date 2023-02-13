package com.example.springweb.repositorios;

import com.example.springweb.modelos.Piloto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PilotoRepositorio extends MongoRepository<Piloto, String> {
    Piloto findByNombre(String nombre);
    List<Piloto> findByNombreContaining(String nombre);
    List<Piloto> findByEquipoOrderByNumero(String equipo);
}