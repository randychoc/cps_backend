package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.DescModel;
import com.example.demo.repositories.DescRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescService {
    @Autowired
    DescRepository descRepository;

    public ArrayList<DescModel> obtenerDesc() {
        return (ArrayList<DescModel>) descRepository.findAll();
    }

    public DescModel guardarDesc(DescModel desc) {
        return descRepository.save(desc);
    }

    public Optional<DescModel> obtenerPorId(Integer id) {
        return descRepository.findById(id);
    }
}
