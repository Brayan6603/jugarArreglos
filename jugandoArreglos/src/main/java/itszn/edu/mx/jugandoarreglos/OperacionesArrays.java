/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author domib
 */
public class OperacionesArrays {
    
    public float calcularSuma(float[] num){
        float suma=0f;
        //Recorrer el arreglo
        for(int i=0; i<num.length; i++){
            suma = suma + num[i];
        }
        return suma;
    }//calcularSuma end
    
    public float calcularPromedio(float[] num){
        float suma=0f;
        float promedio=0f;
        if(num.length > 0){
        //Recorrer el arreglo
        for(int i=0; i<num.length; i++){
            suma = suma + num[i];
        }
        promedio = suma/((float)num.length);
        }
        return promedio;
    }//calcularPromedio end
    
     public int calcularLimites(float[] num, int limite){
         
         int j = 0;
          for(int i=0; i<num.length; i++){
            if(num[i] > limite){
                j = j+1;
            }
        }
         
        return j;
    }//calcularLimites end
     
     public float[] calcularInvertidos(float[] num){
         float[] invertidos = new float[num.length];
         int j = 0;
          for(int i=num.length-1; i>=0; i--){
            invertidos[j] = num[i];
            j = j+1;
        }
         
        return invertidos;
    }//calcularInvertidos end
     
      public float[] calcularAbsolutos(float[] num){
         float[] absolutos = new float[num.length];
         
          for(int i=0; i<num.length; i++){
            absolutos[i] = Math.abs(num[i]);
        }
         
        return absolutos;
    }//calcularLimites end
}
