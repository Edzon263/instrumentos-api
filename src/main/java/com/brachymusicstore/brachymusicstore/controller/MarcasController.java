package com.brachymusicstore.brachymusicstore.controller;

import com.brachymusicstore.brachymusicstore.entity.Marca;
import com.brachymusicstore.brachymusicstore.repository.MarcaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcasController {
    private final MarcaRepository marcaRepository;

    public MarcasController(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @GetMapping
    public List<Marca> obtenerMarcas(){
        return this.marcaRepository.findAll();
    }

}
