/* Karen Pineda Acevedo                                          TdeA
    Stiven Alexander Parra Hincapie                        2021
    Estructura de datos 
    Taller de vectores y matrices 
*/
package com.mycompany.punto3;

import java.util.*;

public class punto3 {

    public static void main(String[] args) {
     
         Scanner leer = new Scanner (System.in);
        
           int [] vect1 = new int[3];
           int [] vect2 = new int[3];
           int []vect3 = new int [3];
         
         for (int i = 0; i < vect1.length; i++){
             System.out.println("Ingrese numeros vector 1 .");
             vect1[i] = leer.nextInt();
         }
          for (int j = 0; j < vect2.length; j++){
             System.out.println("Ingrese numeros vector 2 .");
             vect2[j] = leer.nextInt();
          }
          
           for(int i = 0; i < 3; i++){
              vect3[0] = (vect1[1] * vect2[2] - vect2[1]*vect1[2] );
              vect3[1] = (vect1[0] * vect2[2] - vect2[0]*vect1[2] );
              vect3[2] = (vect1[0] * vect2[1] - vect2[0]*vect1[1] );
          }
           
           System.out.println("\nResultados vector .");
           for(int i = 0; i < 3; i++){
                System.out.println("["+vect3[i]+"]  ");
           }
   }
}
