/* Karen Pineda Acevedo                                          TdeA
    Stiven Alexander Parra Hincapie                        2021
    Estructura de datos 
    Taller de vectores y matrices 
*/
package com.mycompany.punto1;

import java.util.*;

public class punto1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
         int suma = 0;
         int promedio = 0;

        System.out.println(" Buenas, cuantas veces quieres ingresar numeros? :");
        int a = leer.nextInt();
        
        int [] numeros = new int[a];
        
        for (int i = 0; i < numeros.length ; i++ ){
        
            System.out.println(" Ingrese numeros .");
            numeros[i] = leer.nextInt();
           
           suma =  suma + numeros[i];
           promedio = suma / a;
        }
        
        int menor, mayor;
        menor=mayor=numeros[0];
        
        for(int j =1; j < numeros.length; j++){
            
            if(numeros[j] > mayor){
                mayor = numeros[j];
                
            }if(numeros[j]< menor){
                menor = numeros[j];
            }
        
        }
        
        System.out.println("La suma de los numeros de los vectores es : " + suma );
        System.out.println("El promedio de los numeros de los vectores es :" + promedio);
        System.out.println("El numero mayor del vector es el numero :" + mayor);
        System.out.println("El numero menor del vector es el numero : " + menor);
    }
}
