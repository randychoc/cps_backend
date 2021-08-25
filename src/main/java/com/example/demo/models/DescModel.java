package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "descuentos")
public class DescModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddesc", unique = true, nullable = false)
    private Integer idDesc;

    @Column(name = "tipocliente")
    private String tipoCliente;
    private Integer descuento;

    public void setIdDesc(Integer idDesc) {
        this.idDesc = idDesc;
    }

    public Integer getIdDesc() {
        return idDesc;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Integer getDescuento() {
        return descuento;
    }
}
