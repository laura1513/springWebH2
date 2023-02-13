package com.example.springweb.servicios;

import com.example.springweb.modelos.Piloto;
import com.example.springweb.repositorios.PilotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class PilotoServicioImpl implements PilotoServicio {
    @Autowired
    private PilotoRepositorio pilotoRepositorio;


    @Override
    public List<Piloto> findAllPilotos() {
        return pilotoRepositorio.findAll();
    }
}
