package com.example.demo.repositories;

import com.example.demo.models.DescModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescRepository extends CrudRepository<DescModel, Integer> {

}
