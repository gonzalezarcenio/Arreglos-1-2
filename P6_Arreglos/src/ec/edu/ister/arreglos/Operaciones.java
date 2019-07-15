
package ec.edu.ister.arreglos;

/**
 *Fecha lunes 15 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : elementos pares
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Operaciones {
    int array[]= new int[100];
    int numero;

    public Operaciones(int array[] ,int numero) {
        this.array=array;
        this.numero = numero;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void numerosP (int numero ,int array[]){
        for (int i = 0; i <numero; i++) {
            if(array[i]%2==0){
                
                System.out.println("es par "+array[i]); 
            }
        }
    }
    
    
}
