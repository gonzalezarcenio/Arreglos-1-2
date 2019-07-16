
package ec.edu.ister.aplicativo;

import ec.edu.ister.arreglos.Operaciones;
import java.util.Scanner;

/**
 *Fecha martes 16 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : elementos impares
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int array[]=new int[100];
        int numero;
        
        System.out.println("Diguite diimension : ");
        numero=entrada.nextInt();
        
        for (int i = 0; i <numero; i++) {
            System.out.println("Diguite un numero");
            array[i]=entrada.nextInt();
        }
            
            Operaciones  obj1=new Operaciones(array, numero);
            obj1.elementosImapres(numero, array);
    }
    
}
