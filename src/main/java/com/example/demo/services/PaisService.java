package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.PaisModel;
import com.example.demo.repositories.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public ArrayList<PaisModel> obtenerPaises() {
        return (ArrayList<PaisModel>) paisRepository.findAll();
    }

    public PaisModel guardarPais(PaisModel pais) {
        return paisRepository.save(pais);
    }
}
