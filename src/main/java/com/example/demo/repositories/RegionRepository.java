package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.RegionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<RegionModel, Integer> {
    public abstract ArrayList<RegionModel> findByIdPais(Integer idPais); 
}
