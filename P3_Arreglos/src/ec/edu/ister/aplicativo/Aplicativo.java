
package ec.edu.ister.aplicativo;

import ec.ister.edu.arreglos.Operaciones;
import java.util.Scanner;

/**
 Fecha domingo 14 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 *Nombre: Bryan Gonzalez
 *Enunciado : posicion de elemento mayor de un  vector
 *Materia : Programacion
 *Nivel : cuarto de  Sistemas  nocturno
 
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int array[]= new int[100];
         int num,mayor;
         
         System.out.print("Diguite dimension  : ");
         num=entrada.nextInt();
         
         for (int i = 0; i <num; i++) {
             System.out.print("Diguite un numero : ");
             array[i]=entrada.nextInt();
        }
         
         Operaciones obj1 = new Operaciones(array, num);
         mayor=obj1.elementoM(array, num);
         obj1.imprimirM(mayor);
         obj1.imprimirP(num, array, mayor);
         
         System.out.print("Diguite dimension  : ");
         num=entrada.nextInt();
         
         for (int i = 0; i <num; i++) {
             System.out.print("Diguite un numero : ");
             array[i]=entrada.nextInt();
        }
         
         Operaciones obj2 = new Operaciones(array, num);
         mayor=obj2.elementoM(array, num);
         obj2.imprimirM(mayor);
         obj2.imprimirP(num, array, mayor);
          
         
    }
}
