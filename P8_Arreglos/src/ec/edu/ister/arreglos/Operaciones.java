/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.arreglos;

/**
 *Fecha martes 16 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : suma de todos los elementos
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Operaciones {
    private  int numero;
    private int array[]= new int[100];

    public Operaciones(int array[],int numero) {
        this.array=array;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    
    public int sumarE(int numero,int array[]){
        int suma=0;
        for (int i = 0; i <numero; i++) {
            suma=suma+array[i];
        }
        
        return suma;
    }
    
    public void imprimir(int suma){
        System.out.println("La suma es : "+suma);
    }
}
