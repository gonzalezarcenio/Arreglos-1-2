
package ec.ister.aplicativo;

import ec.edu.ister.arreglos.Operaciones;
import java.util.Scanner;

/**
 *Fecha domingo 14 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 *Nombre: Bryan Gonzalez
 *Enunciado : Elemento menor de un vector
 *Materia : Programacion
 *Nivel : cuarto de  Sistemas  nocturno
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
         
         Operaciones obj1 = new Operaciones(array, num);
         menor=obj1.elementoM(array, num);
         obj1.imprimirV(menor);
         
         System.out.print("Diguite dimension  : ");
         num=entrada.nextInt();
         
         for (int i = 0; i <num; i++) {
             System.out.print("Diguite un numero : ");
             array[i]=entrada.nextInt();
        }
         
         Operaciones obj2 = new Operaciones(array, num);
         menor=obj2.elementoM(array, num);
         obj2.imprimirV(menor);
       
       
    }
    
    
    
    
    
}
