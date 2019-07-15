
package ec.edu.ister.aplicativo;

import ec.edu.ister.arreglos.Operaciones;
import java.util.Scanner;

/**
 *Fecha lunes 14 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : elementos pares
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int array[]= new int[100];
         int num;
         
         System.out.print("Diguite dimension  : ");
         num=entrada.nextInt();
         
         for (int i = 0; i <num; i++) {
             System.out.print("Diguite un numero : ");
             array[i]=entrada.nextInt();
        }
         
         Operaciones obj1 = new Operaciones(array, num);
         obj1.numerosP(num, array);
    }
}
