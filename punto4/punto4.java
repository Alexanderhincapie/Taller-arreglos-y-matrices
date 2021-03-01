/* Karen Pineda Acevedo                                          TdeA
    Stiven Alexander Parra Hincapie                        2021
    Estructura de datos 
    Taller de vectores y matrices 
*/
package com.mycompany.punto4;

 import java.util. *;

public class punto4 {
  
    public static void main(String[] args) {
     
         Scanner leer = new Scanner (System.in);
         
         System.out.println("Ingrese numero N :");
         int N = leer.nextInt();
         
         System.out.println("Ingrese numero M :");
         int M = leer.nextInt();
         
         double [][] dimensiones = new double[N][M];

         for( int i = 0; i < dimensiones.length; i++){
             for( int j = 0; j < dimensiones.length; j++){
                 System.out.println("Ingresa valores para llenar matriz :");
                 dimensiones[i][j] = leer.nextDouble();
             }
         }
         
         for( int i = 0; i < dimensiones.length; i++){
             for( int j = 0; j < dimensiones.length; j++){
                 System.out.println(" Valores de la matriz .");
                 System.out.println("  [  "  +  i  +  "  ]  "  +  "  [  "  +  j  +  "  ]  "  +  dimensiones[i][j]);
             }
         }
    }
}
