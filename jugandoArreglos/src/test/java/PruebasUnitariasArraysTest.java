/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.OperacionesArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author domib
 */
public class PruebasUnitariasArraysTest {
    
    public PruebasUnitariasArraysTest() {
    }

    /**
     *
    @throws Exception
     */
    
    private OperacionesArrays opa;
    @BeforeEach
    public void setUp() {
        opa = new OperacionesArrays();
    }
    
   
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
        float[] entrada = {10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada = null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
     public void pruebaPromedio1(){
        float[] entrada = {9f,10f,8f};
        float salidaEsperada=9f;
        
        float salidaReal=opa.calcularPromedio(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
     
   @Test
     public void pruebaPromedio2(){
        float[] entrada = {30f,23f,22f,20f,18f,19f};
        float salidaEsperada=22f;
        
        float salidaReal=opa.calcularPromedio(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    } 
   
   @Test
     public void pruebaLimites1(){
        int limite = 6;
        float[] entrada = {9f,5f,10f,8f,2f};
        int salidaEsperada=3;
        
        int salidaReal=opa.calcularLimites(entrada,limite);
        
        assertEquals(salidaEsperada,salidaReal);
    }
     
    @Test
     public void pruebaLimites2(){
        int limite = 20;
        float[] entrada = {10f,15f,8f,4f};
        int salidaEsperada=0;
        
        int salidaReal=opa.calcularLimites(entrada,limite);
        
        assertEquals(salidaEsperada,salidaReal);
    }
     
   @Test
     public void pruebaInvertidos1(){
        float[] entrada = {2f,1f,9f,6f};
        float[] salidaEsperada={6f,9f,1f,2f};
        
        float[] salidaReal=opa.calcularInvertidos(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal);
    } 
     
   @Test
     public void pruebaInvertidos2(){
        float[] entrada = {5f,11f,20f,25f};
        float[] salidaEsperada={25f,20f,11f,5f};
        
        float[] salidaReal=opa.calcularInvertidos(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal);
    } 
     
   @Test
     public void pruebaAbsolutos1(){
        float[] entrada = {2f,-1f,9f,-6f};
        float[] salidaEsperada={2f,1f,9f,6f};
        
        float[] salidaReal=opa.calcularAbsolutos(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal);
    } 
     
   @Test
     public void pruebaAbsolutos2(){
        float[] entrada = {-1f,-2f,-3f,-4f,-5f,-6f,-7f,-8f,-9f,-10f};
        float[] salidaEsperada= {1f,2f,3f,4f,5f,6f,7f,8f,9f,10f};
        
        float[] salidaReal=opa.calcularAbsolutos(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal);
    } 
}
