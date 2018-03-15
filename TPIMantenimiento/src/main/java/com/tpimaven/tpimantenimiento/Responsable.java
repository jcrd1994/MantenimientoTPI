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
public class Responsable {
    private int id_responsable;
    private String nombre;
    private String apellido;
    private String email;

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Responsable(int id_responsable, String nombre, String apellido, String email) {
        this.id_responsable = id_responsable;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Responsable() {
    }
}
