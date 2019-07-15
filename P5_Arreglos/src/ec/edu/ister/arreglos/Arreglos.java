
package ec.edu.ister.arreglos;

/**
 *Fecha lunes 15 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 * Nombre: Bryan Gonzalez
 * Enunciado : elemento mayor de un vector
 * Materia : Programacion
 * Nivel : cuarto de  Sistemas  nocturno
 */
public class Arreglos {
   private int array[]= new int[100];
        private int num;

    public Arreglos(int array[],int num) {
        this.array=array;
        this.num = num;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int elementoM(int vector[],int num){
     int menor=array[0];  
        for (int i = 0; i <num; i++) {
         if(vector[i]<menor){
              menor=vector[i];
       }   
          }
            
        return menor; 
    }
    public void imprimirV(int menor){
        System.out.println("elemento menor es : "+menor);
        
    }
    
    public void imprimirP(int num,int array[],int menor){
        
        for (int i = 0; i <num; i++) {
            
             if(menor==array[i]){
                   System.out.println("La posicion del numero de mi menor del  arreglo  es :"+"---<INDICE>"+i+"---<ELEMENTO>"+array[i]);
             }
        } 
    }
}


