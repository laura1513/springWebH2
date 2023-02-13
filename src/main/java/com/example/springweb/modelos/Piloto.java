package com.example.springweb.modelos;


import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("pilotos")
public class Piloto implements Serializable {
    @Id
    private String id;
    @Field("driver")
    private String nombre;
    @Field("abbreviation")
    private String abreviatura;
    @Field("no")
    private int numero;
    @Field("team")
    private String equipo;
    @Field("country")
    private String pais;
    @Field("date_of_birth")
    private LocalDate fechaNacimiento;
}