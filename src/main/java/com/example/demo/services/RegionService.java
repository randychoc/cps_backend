package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RegionModel;
import com.example.demo.repositories.RegionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    public ArrayList<RegionModel> obtenerRegiones() {
        return (ArrayList<RegionModel>) regionRepository.findAll();
    }

    public RegionModel guardarRegion(RegionModel region) {
        return regionRepository.save(region);
    }

    public Optional<RegionModel> obtenerPorId(Integer id) {
        return regionRepository.findById(id);
    }

    public ArrayList<RegionModel> obtenerPorPais(Integer idPais) {
        return regionRepository.findByIdPais(idPais);
    }

    public boolean eliminarRegion(Integer idRegion) {
        try {
            regionRepository.deleteById(idRegion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
