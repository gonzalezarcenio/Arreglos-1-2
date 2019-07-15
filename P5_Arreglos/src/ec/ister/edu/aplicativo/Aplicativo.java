
package ec.ister.edu.aplicativo;

import ec.edu.ister.arreglos.Arreglos;
import java.util.Scanner;

/**
 *Fecha lunes 15 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : elemento mayor de un vector
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Aplicativo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         int array[]= new int[100];
         int num,menor;
         
         System.out.print("Diguite dimension  : ");
         num=entrada.nextInt();
         
         for (int i = 0; i <num; i++) {
             System.out.print("Diguite un numero : ");
             array[i]=entrada.nextInt();
        }
         
         Arreglos obj1 = new Arreglos(array, num);
         menor=obj1.elementoM(array, num);
         obj1.imprimirV(menor);
         obj1.imprimirP(num, array, menor);
        
         
         
       
          

    }
    
}
