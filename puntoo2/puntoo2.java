/* Karen Pineda Acevedo                                          TdeA
    Stiven Alexander Parra Hincapie                        2021
    Estructura de datos 
    Taller de vectores y matrices 
*/
package com.mycompany.puntoo2;

import java.util.*;

public class puntoo2 {
 
    public static void main(String[] args) {
   
        Scanner leer = new Scanner (System.in);
           int escalar = 0;
        
        int [] vect1 = new int [4];
        int [] vect2 = new int [4];
        int [] vect3 = new int [4];
        
           for (int i = 0; i < vect1.length ; i++ ){
        
           System.out.println(" Ingrese numeros vector 1 .");
           vect1[i] = leer.nextInt();
           }
                
          for (int j = 0; j < vect2.length ; j++ ){
        
            System.out.println(" Ingrese numeros vector 2 .");
            vect2[j] = leer.nextInt();
            
          }
          
          System.out.println(" Datos del vector 1. ");
          for( int i = 0; i < 4; i++){
              System.out.println("["+vect1[i]+"]  ");
          }
          
         System.out.println(" Datos del vector 2. ");
          for( int j = 0; j < 4; j++){
              System.out.println("["+vect2[j]+"]  ");
          } 
          for ( int i = 0; i < 4; i++){
               vect3[i] = vect1[i] * vect2[i];
        }
          System.out.println("\nResultados de la multiplicacion guardadas en el vector .");
          for( int i = 0; i <4; i++){
              System.out.println("["+vect3[i]+"]  ");
          }
          
          for(int i = 0; i <4; i++){
              escalar = escalar + vect3[i];
          }
          
          System.out.println("\nLa suma de los resultados es :");
          for( int i = 0; i < 1; i++){
              System.out.println(+ escalar +" ");
          }
    }
}
