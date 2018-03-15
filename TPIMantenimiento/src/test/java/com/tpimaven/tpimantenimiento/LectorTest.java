/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpimaven.tpimantenimiento;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author degon
 */
public class LectorTest {
    
     @Rule
    public TemporaryFolder dirPrueba = new TemporaryFolder();

    @Test
    public void crearArchivosTemp() throws IOException {
        String path;
        File tempFile = dirPrueba.newFile("prueba.csv");
        File tempFolder = dirPrueba.newFolder("Folder_prueba");
        
        System.out.println(tempFile);
        System.out.println("Url Folder de prueba" + dirPrueba.getRoot().toString());
    }
    
    public LectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class Lector.
     */
    
    @Test
    public void testLeerArchivo() {
        try {
            System.out.println("leerArchivo");
            Lector instance = new Lector();
            File archivo1 = dirPrueba.newFile("Archivo1.csv");
            File archivo2 = dirPrueba.newFile("Archivo2.csv");     
            List<String> archivo = new ArrayList();
            archivo.add(archivo1.toString());
            archivo.add(archivo2.toString());
            instance.leerArchivo(archivo);
            // TODO review the generated test code and remove the default call to fail.
        } catch (IOException ex) {
            Logger.getLogger(LectorTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
        
    @Rule
    public TemporaryFolder carpeta = new TemporaryFolder();
    
    @Test
    public void testVerificarPath() throws IOException {
        System.out.println("verificarPath");
        File archivoTemp = carpeta.newFile("arhivoTemp.cvs");
        String path = archivoTemp.getPath();
        Lector instance = new Lector();
        boolean expResult = true;
        boolean result = instance.verificarArchivo(path);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificarPathDirectorio(){
        System.out.println("Verificar Directorio");
        String path = carpeta.getRoot().getPath();
        Lector instance = new Lector();
        boolean expResult = true;
        boolean result = instance.verificarDirectorio(path);
        assertEquals(expResult, result);
    }
    
}
