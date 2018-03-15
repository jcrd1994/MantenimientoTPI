/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpimaven.tpimantenimiento.rest;

import java.net.URI;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONException;

/**
 *
 * @author LENOVO
 */
public class MantenimientoRest {
    
    Client usuario;
    WebTarget ruta;
    
        private final static String URL_RESOURCE = "http://localhost:80/MantenimientoTPI";
        
        public MantenimientoRest(){
        //contructor del usuario y el path
        this.usuario = ClientBuilder.newClient();
        this.ruta = usuario.target(URL_RESOURCE);
        }
    
        
        public URI REST(List<List<String>> listajson) throws JSONException{
            for (List<String> lista : listajson){
                for (String string : lista){
                
                //si no hay lista o si hay pero esta vacia
                if (lista!=null && string.trim().isEmpty()){
                    JsonObject json = Json.createObjectBuilder().add("MantenimientoTPI", string.trim().toUpperCase()).build();
                    Response answer = ruta.path("mantenimiento").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.json(json));
                    
                    if (answer != null && answer.getStatus()== Response.Status.CREATED.getStatusCode()){
                    return answer.getLocation();
                }
                
                }
                
                }
            }
            
            
             return null;
        }
       
}
