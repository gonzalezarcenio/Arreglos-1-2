
package ec.edu.ister.arreglos;

/**
  
 *Instituto Tecnològico Superior Rumiñahui 
 *  Fecha sabado 13 de julio del 2019
 * Nombre: Bryan Gonzalez
 * Enunciado : Sacar el promedio de vectores
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Operaciones {
   private float array[]= new float [100];
   private float num;

    public Operaciones(float array[] ,float num) {
        this.array=array;
        this.num = num;
    }

    public float[] getArray() {
        return array;
    }

    public void setArray(float[] array) {
        this.array = array;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }
    
    
   
    public float promedioArreglo(float array[] , float num){
        float promedio,suma=0;
        for (int i = 0; i <num; i++) {
            suma=suma+array[i];
        }
         promedio=suma/num;
            return promedio;
    }
  
    public void imprimirArray(float promedio){
        System.out.println("El promedio es :"+promedio);
    }
}
