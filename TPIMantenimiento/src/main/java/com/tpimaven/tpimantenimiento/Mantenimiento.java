/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpimaven.tpimantenimiento;

/**
 *
 * @author degon
 */
public class Mantenimiento {
    private int id_mantenimiento;
    private int id_responsable;
    private String numero_inventario;
    private String numero_serie;
    private String marca;
    private String modelo;
    private String sistema_operativo;
    private boolean licencia;
    private String version;
    private String observaciones;

    public Mantenimiento() {
    }

    public int getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(int id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getNumero_inventario() {
        return numero_inventario;
    }

    public void setNumero_inventario(String numero_inventario) {
        this.numero_inventario = numero_inventario;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Mantenimiento(int id_mantenimiento, int id_responsable, String numero_inventario, String numero_serie, String marca, String modelo, String sistema_operativo, boolean licencia, String version, String observaciones) {
        this.id_mantenimiento = id_mantenimiento;
        this.id_responsable = id_responsable;
        this.numero_inventario = numero_inventario;
        this.numero_serie = numero_serie;
        this.marca = marca;
        this.modelo = modelo;
        this.sistema_operativo = sistema_operativo;
        this.licencia = licencia;
        this.version = version;
        this.observaciones = observaciones;
    }

    
}
