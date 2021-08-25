package com.example.demo.repositories;

import com.example.demo.models.PaisModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<PaisModel, Integer> {

}