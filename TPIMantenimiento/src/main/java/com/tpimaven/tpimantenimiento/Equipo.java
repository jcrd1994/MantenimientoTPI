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
public class Equipo {
     private String numero_serie;
    private String numero_inventario;
    private int id_modelo;
    private int id_marca;
    private int sistema_operativo;

    public Equipo() {
    }

    public Equipo(String numero_serie, String numero_inventario, int id_modelo, int id_marca, int sistema_operativo) {
        this.numero_serie = numero_serie;
        this.numero_inventario = numero_inventario;
        this.id_modelo = id_modelo;
        this.id_marca = id_marca;
        this.sistema_operativo = sistema_operativo;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getNumero_inventario() {
        return numero_inventario;
    }

    public void setNumero_inventario(String numero_inventario) {
        this.numero_inventario = numero_inventario;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(int sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    
}
