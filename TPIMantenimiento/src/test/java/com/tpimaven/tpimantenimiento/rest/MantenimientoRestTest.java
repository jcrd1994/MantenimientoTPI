/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpimaven.tpimantenimiento.rest;

import java.net.URI;
import java.util.List;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import junit.framework.Assert;
import org.codehaus.jettison.json.JSONException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 *
 * @author degon
 */
public class MantenimientoRestTest {
    
    public MantenimientoRestTest() {
    }
    MantenimientoRest llamada;
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
    public void LLamadaaREST() throws JSONException {
        MantenimientoRest rest = mock(MantenimientoRest.class);
    
        ResponseBuilder respuesta = Response.status(Response.Status.CREATED);
        
        respuesta = Response.status(Response.Status.CREATED).entity("Se creo con exito el esquema!");
        List<List<String>> listajson = null;
        
        
        //when(rest.REST(listajson).resolve(str)).thenReturn(respuesta.build());
        
        String resultado = rest.REST(listajson).getClass().toString();
        
        System.out.println("tu resultado: " + resultado);
        
        
        assertEquals("EL esquema se creo", resultado);
    }

    /**
     * Test of REST method, of class MantenimientoRest.
     */
    @Test
    public void testREST() throws Exception {
        System.out.println("REST");
        List<List<String>> listajson = null;
        MantenimientoRest instance = new MantenimientoRest();
        URI expResult = null;
        URI result = instance.REST(listajson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
