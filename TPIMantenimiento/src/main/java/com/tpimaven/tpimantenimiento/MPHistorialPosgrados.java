/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpimaven.tpimantenimiento;

/**
 *
 * @author LENOVO
 */
public class MPHistorialPosgrados {
    
    String Fecha;
    String TipoMantenimiento;
    String Hardware;
    String Software;

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoMantenimiento() {
        return TipoMantenimiento;
    }

    public void setTipoMantenimiento(String TipoMantenimiento) {
        this.TipoMantenimiento = TipoMantenimiento;
    }

    public String getHardware() {
        return Hardware;
    }

    public void setHardware(String Hardware) {
        this.Hardware = Hardware;
    }

    public String getSoftware() {
        return Software;
    }

    public void setSoftware(String Software) {
        this.Software = Software;
    }

    public MPHistorialPosgrados() {
    }
    
}
