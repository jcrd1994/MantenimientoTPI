/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpimaven.tpimantenimiento;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author degon
 */
public class Leer {
    private static final Leer instancia = new Leer();
    
    public static Leer getInstance(){
        return instancia;
    }
     
    
    
    //Esto ya no sera necesario si se ocupa el JFileChooser porque el ya valida si existe
     public boolean verificarArchivo(final String path){
        if(path != null && !path.trim().isEmpty()){
            //Verifica que el path sea un archivo y tenga permisos de lectura
            return (Paths.get(path).toFile().isFile() && Paths.get(path).toFile().canRead());
        }
        
        return false;
    }
    
    public List<String> obtenerArchivos(final String path){
        List<String> listaArchivos = new ArrayList<>();
        if(verificarArchivo(path)){
            listaArchivos.add(path);
        }else{
            try {           
            Files.walk(Paths.get(path)).filter(a -> a.toFile().getName().endsWith(".csv")).forEach(p -> listaArchivos.add(p.toString()));
            listaArchivos.forEach(System.out::println);
   
            } catch (IOException ex) {
                Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        return listaArchivos;
    }
    
    public void leerArchivo(List<String> listaArchivos){
        List<List> cadena = new ArrayList(); //aqui se almacenan los objetos separados por comas de cada linea que contenga el archivo
        listaArchivos.forEach(l -> {
            try {
                Stream<String> stream = Files.lines(Paths.get(l)).skip(1); //se obtiene el flujo de datos y se realiza un salto de linea
                stream.forEach(a -> cadena.add(separador(a)));
            } catch (IOException ex) {
                Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        cadena.forEach(a -> a.forEach(System.out::println));
    }
    
    public List<String> separador(String linea){
        String[] separado = linea.split(","); // separa la linea por comas
        List<String> listaSeparado = new ArrayList<>(Arrays.asList(separado));//se convierte a una lista 
        System.out.println(listaSeparado);
        
        return listaSeparado; 
    }
    
    public List<List<String>> parser(final String path, final boolean saltarLinea, final String separador) throws IOException{
        List<List<String>> listado=new ArrayList<>();  //Algo asi como que una lista multidimensional     
        if (verificarArchivo(path)) { //llamamos al metodo validar que creamos
            try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines.skip(saltarLinea?1:0).filter(l->l.contains(separador)).
                    forEach(s -> {
                String[] separado = s.split(separador);   
                listado.add(Arrays.asList(separado));
                    });
            return listado;
            }
        }
        
        return null;
    }

}
