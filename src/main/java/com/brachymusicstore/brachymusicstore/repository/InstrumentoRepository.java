package com.brachymusicstore.brachymusicstore.repository;

import com.brachymusicstore.brachymusicstore.entity.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentoRepository extends JpaRepository <Instrumento, Long> {
    public Instrumento findByModelo(String modelo);
}
