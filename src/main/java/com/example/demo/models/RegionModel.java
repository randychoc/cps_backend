package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "regiones")
public class RegionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregion", unique = true, nullable = false)
    private Integer idRegion;

    private String region;

    @Column(name = "idpais")
    private Integer idPais;
    
    private Integer tarifa;
    
    // Setters and Getters
    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getTarifa() {
        return tarifa;
    }
}
