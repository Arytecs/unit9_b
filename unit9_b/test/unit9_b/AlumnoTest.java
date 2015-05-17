/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9_b;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Araceli Teruel
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }

    /**
     * Test of validaNif method, of class Alumno.
     */
    @Test()
    public void testValidaNif() {
        Alumno al=new Alumno();
        boolean expected, actual;
        expected=false;
        actual=al.validaNif("4866");
        assertEquals(expected, actual);
        
        expected=false;
        actual=al.validaNif("a48667898");
        assertEquals(expected, actual);
        
        expected=false;
        actual=al.validaNif("48667898I");
        assertEquals(expected, actual);
        
        expected=true;
        actual=al.validaNif("48667898J");
        assertEquals(expected, actual);
    }

    /**
     * Test of calculaTasaMatricula method, of class Alumno.
     */
    @Test
    public void testCalculaTasaMatricula() {
        Alumno al=new Alumno();
        float expected, actual;
        actual=al.calculaTasaMatricula(12, false, true);
        expected=2000.00f;
        assertEquals(expected, actual, 0);
        
        actual=al.calculaTasaMatricula(15, true, true);
        expected=250.00f;
        assertEquals(expected, actual, 0);
        
        actual=al.calculaTasaMatricula(15, false, false);
        expected=500.00f;
        assertEquals(expected, actual, 0);
        
        actual=al.calculaTasaMatricula(70, false, true);
        expected=250.00f;
        assertEquals(expected, actual, 0);
        
        actual=al.calculaTasaMatricula(55, true, true);
        expected=150.00f;
        assertEquals(expected, actual, 0);
    }
    
}
