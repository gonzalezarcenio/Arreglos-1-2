
package ec.ister.edu.arreglos;

/**
 *Fecha domingo 14 de julio del 2019
 *Instituto Tecnològico Superior Rumiñahui 
 *Nombre: Bryan Gonzalez
 *Enunciado : posicion de elemento mayor de un  vector
 *Materia : Programacion
 *Nivel : cuarto de  Sistemas  nocturno
 */
public class Operaciones {
    
     private int array[]= new int[100];
        private int num;

    public Operaciones(int array[],int num) {
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
     int mayor=0;  
        for (int i = 0; i <num; i++) {
         if(vector[i]>mayor){
              mayor=vector[i];
             
       }   
          }
            
        return mayor; 
    }
    public void imprimirM(int mayor){
        System.out.println("el mayor es  :"+mayor);
        
    } 
    public void imprimirP(int num,int array[],int mayor){
        
        for (int i = 0; i <num; i++) {
            
             if(mayor==array[i]){
                   System.out.println("La posicion del numero de mi mayor del  arreglo  es :"+"---<INDICE>"+i+"---<ELEMENTO>"+array[i]);
             }
        } 
    }
}
