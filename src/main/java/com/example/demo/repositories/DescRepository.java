package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.DescModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescRepository extends CrudRepository<DescModel, Integer> {
    public abstract ArrayList<DescModel> findByIdDesc(Integer idDesc); 
}
