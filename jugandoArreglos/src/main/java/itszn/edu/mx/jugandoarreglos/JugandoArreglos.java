/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itszn.edu.mx.jugandoarreglos;
import java.util.Arrays;

/**
 *
 * @author domib
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArrays op = new OperacionesArrays();
        float[] pesos = {12f, 45f, 3.5f};
        float sum=op.calcularSuma(pesos);
        System.out.println("Las suma es "+sum);
        
        OperacionesArrays op1 = new OperacionesArrays();
        float promedio=op1.calcularPromedio(pesos);
        System.out.println("El promedio es "+promedio);
        
        OperacionesArrays op2 = new OperacionesArrays();
        float[] numeros = {12f, 45f, 3.5f, 1.4f};
        int cantidad=op2.calcularLimites(numeros, 5);
        System.out.println("La cantidad de números que exeden es "+cantidad);
        
        OperacionesArrays op3 = new OperacionesArrays();
        float[] numerosNoInvertidos = {2f, 1f, 9f, 6f};
        float[] numerosInvertidos=op3.calcularInvertidos(numerosNoInvertidos);
        System.out.println("Números invertidos "+Arrays.toString(numerosInvertidos));
        
        OperacionesArrays op4 = new OperacionesArrays();
        float[] numerosNoAbsolutos = { 2f, -3f, -4f, 5f};
        float[] numerosAbsolutos=op4.calcularAbsolutos(numerosNoAbsolutos);
        System.out.println("Números absolutos "+Arrays.toString(numerosAbsolutos));
    }
}
