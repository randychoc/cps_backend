package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.PaisModel;
import com.example.demo.services.PaisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paises")
public class PaisController {
    @Autowired
    PaisService paisService;

    @GetMapping()
    public ArrayList<PaisModel> obtenerPaises() {
        return paisService.obtenerPaises();
    }

    @PostMapping()
    public PaisModel guardarPais(@RequestBody PaisModel pais) {
        return this.paisService.guardarPais(pais);
    }
}
