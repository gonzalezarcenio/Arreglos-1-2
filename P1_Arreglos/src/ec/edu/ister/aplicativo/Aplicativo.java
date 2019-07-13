
package ec.edu.ister.aplicativo;

import ec.edu.ister.arreglos.Operaciones;
import java.util.Scanner;

/**
 *Fecha sabado 13 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : Sacar el promedio de vectores
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float array[]= new float [100];
        float num,promedio;
        
        System.out.print("Diguitedimension :");
        num=entrada.nextFloat();
        
        for (int i = 0; i <num; i++) {
            System.out.print("Diguite un numero :");
        array[i]=entrada.nextFloat();
        }
        
        Operaciones obj1 = new Operaciones(array,num);
        
        promedio=obj1.promedioArreglo(array, num);
        obj1.imprimirArray(promedio);
    }
    
}
