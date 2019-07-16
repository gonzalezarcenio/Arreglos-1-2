/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.aplicativo;

import ec.edu.ister.arreglos.Operaciones;
import java.util.Scanner;

/**
 *Fecha martes 16 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : suma de todos los elementos
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,suma;
        int array[]= new int[100];
        
        System.out.println("Diguite dimension  :");
        numero=entrada.nextInt();
        
        for (int i = 0; i <numero; i++) {
            System.out.println("Diguite un numero :");
        array[i]=entrada.nextInt();
            
        }
        Operaciones obj1 = new Operaciones(array, numero);
        suma=obj1.sumarE(numero, array);
        obj1.imprimir(suma);
    }
    
}
