package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RegionModel;
import com.example.demo.services.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/regiones")
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping()
    public ArrayList<RegionModel> obtenerRegiones() {
        return regionService.obtenerRegiones();
    }

    @PostMapping()
    public RegionModel guardarRegion(@RequestBody RegionModel region) {
        return this.regionService.guardarRegion(region);
    }

    @GetMapping(path = "/{id}")
    public Optional<RegionModel> obtenerRegionPorId(@PathVariable("id") Integer id) {
        return this.regionService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<RegionModel> obtenerUsuarioPorPais(@RequestParam("idPais") Integer idPais) {
        return this.regionService.obtenerPorPais(idPais);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id) {
        boolean ok = this.regionService.eliminarRegion(id);
        if (ok) {
            return "Se eliminó la Region con id " + id;
        } else {
            return "No pudo eliminar la Region con id " + id;
        }
    }
}
