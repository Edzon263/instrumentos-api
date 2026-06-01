package com.brachymusicstore.brachymusicstore.controller;

import com.brachymusicstore.brachymusicstore.entity.Instrumento;
import com.brachymusicstore.brachymusicstore.repository.InstrumentoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {
    private final InstrumentoRepository instrumentoRepository;

    public InstrumentoController(InstrumentoRepository instrumentoRepository) {
        this.instrumentoRepository = instrumentoRepository;
    }

    @GetMapping
    public List<Instrumento> getInstrumentos(){
        return this.instrumentoRepository.findAll();
    }

    @PostMapping
    public Instrumento insertInstrumento(@RequestBody Instrumento instrumento){
        return this.instrumentoRepository.save(instrumento);
    }

    @GetMapping("modelo/{modelo}")
    public Instrumento findByModelo(@PathVariable String modelo){
        return this.instrumentoRepository.findByModelo(modelo);
    }

    @PutMapping("instrumento/modificar")
    public Instrumento modifyInstrumento(@RequestBody Instrumento instrumento){
        return this.instrumentoRepository.save(instrumento);
    }

}
