package com.example.springweb.servicios;

import com.example.springweb.modelos.Piloto;

import java.util.List;

public interface PilotoServicio {
    List<Piloto> findAllPilotos();
}
