package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "paises")
public class PaisModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpais", unique = true, nullable = false)
    private Integer idPais;

    private String pais;

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

}
