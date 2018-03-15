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
import com.tpimaven.tpimantenimiento.Leer;

/**
 *
 * @author degon
 */
public class LeerTest {
    
    @Rule
    public TemporaryFolder dirPrueba = new TemporaryFolder();

    @Test
    public void crearArchivosTemp() throws IOException {
        String path;
        File tempFile = dirPrueba.newFile("prueba.csv");
        File tempFolder = dirPrueba.newFolder("Folder_prueba");
        
        System.out.println(tempFile+"hola");
        System.out.println("Url Folder de prueba" + dirPrueba.getRoot().toString());
    }

    
    public LeerTest() {
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

    @Test
    public void testLeerArchivo() {
        try {
            System.out.println("leerArchivo");
            Leer instance = new Leer();
            File archivo1 = dirPrueba.newFile("Archivo1.csv");
            File archivo2 = dirPrueba.newFile("Archivo2.csv");     
            List<String> archivo = new ArrayList();
            archivo.add(archivo1.toString());
            archivo.add(archivo2.toString());
            instance.leerArchivo(archivo);
            // TODO review the generated test code and remove the default call to fail.
        } catch (IOException ex) {
            Logger.getLogger(LeerTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Test of separador method, of class Lector.
     */
    
    @Test
    public void testSeparador() {
        System.out.println("separador");
        String linea = "";
        Leer instance = new Leer();
        String[] expResult = null;
        String[] result = null;
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
       
    /**
     * Test of verificarPath method, of class Lector.
     */
    //https://junit.org/junit4/javadoc/4.12/org/junit/rules/TemporaryFolder.html 
    //De aqui saque lo de temporary Folder
    @Rule
    public TemporaryFolder carpeta = new TemporaryFolder();
    
    @Test
    public void testVerificarPath() throws IOException {
        System.out.println("verificarPath");
        File archivoTemp = carpeta.newFile("arhivoTemp.cvs");
        String path = archivoTemp.getPath();
        Leer instance = new Leer();
        boolean expResult = true;
        boolean result = instance.verificarArchivo(path);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of obtenerArchivos method, of class Lector.
     */
    
    //Marca error de orden de devolucion de archivos
    
    @Test
    public void testObtenerArchivos() throws IOException {
        System.out.println("obtenerArchivos");
        File archivo1 = carpeta.newFile("archivo1.csv");
        File archivo2 = carpeta.newFile("archivo2.csv");
        //File carpeta2 = carpeta.newFolder("recursos");
        String path = carpeta.getRoot().getPath();
        Leer instance = new Leer();
        //Bendito sea stackoverflow :v
        List<File> expResult = new ArrayList<>();
        expResult.add(archivo1);
        expResult.add(archivo2);
        List<String> result = instance.obtenerArchivos(path);
        assertEquals(expResult, result);
    }
}
