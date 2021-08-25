package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.DescModel;
import com.example.demo.services.DescService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/desc")
public class DescController {
    @Autowired
    DescService descService;

    @GetMapping()
    public ArrayList<DescModel> obtenerDesc() {
        return descService.obtenerDesc();
    }

    @PostMapping()
    public DescModel guardarDesc(@RequestBody DescModel desc) {
        return this.descService.guardarDesc(desc);
    }

    @GetMapping(path = "/{id}")
    public Optional<DescModel> obtenerDescPorId(@PathVariable("id") Integer id) {
        return this.descService.obtenerPorId(id);
    }

}
