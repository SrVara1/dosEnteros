/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Propietario
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
        //si es fin de semana
        if(finDeSemana){
            return true;
        }
        //si llega a fin de semana esque no es fin de semana
        if(numBellotas>=40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
  
 /**
  * 
  */
    
    public int multa(int velocidad, boolean birthday){
        //si es tu cumpleaños se le resta 5 a la velocidad
         if(birthday){
             velocidad = velocidad -5; //velocidad -=5
             
         }
         //si vas  a menos de 60
         if (velocidad <60){
             return 0;
         }
         //enrtre 61 y 80
         if (velocidad >60 && velocidad <=80){
             return 1;
         }
         //en cualquier otro valor de la velocidad devolvemos la multa grande
         return 2;
         

      
    }
    /*
    
    */
    
    public boolean muyVanidoso (int numero){
        if (numero % 11 < 2) { //si la division da como resto  da 0 o 1
            return true;
        } 
        return false;
    }
    
    
    
    public boolean movil (boolean matinal, boolean madre, boolean dormido){
        if(dormido){ // si esta dormido devuelve falso
            return false;
        }
        if (matinal && !madre){ // si es por la mañana y no es la madre, no contesta
            return false ;
        }

        return true;
    }
    
    
    public boolean a5 ( int a, int b, int c){
        if ( a-b == 10 || a-c ==10){ // si a menos b o a menos c da 10 es true
            return true;
        }
        if (b-a == 10|| b-c==10){ //si b menos a o b menos c da 10 es true
            return true;
        }
        if (c-a==10 || c-b==10){ //si c menos a o c menos b da 10 es true
            return true;
        }
      return false;  
    }
   
    public boolean dosEnteros (int numero, int numero2){
        
        if (numero/10==numero2/10 || numero % 10 == numero2 % 10){//comparamos los numeros
            return true;
        }
        if (numero/10==numero2 %10 || numero % 10 == numero2/10){//comparamos el primer digito del primer numero con el otro digito del otro  numero y viceversa
            return true;
        }
        return false;
    }
    
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto  de lam clase en la que esytamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava ();
       
        System.out.println("Ejercicio 01 ardillas:");
        System.out.println( ejercicio.fiestaArdillas(30, false));
        System.out.println( ejercicio.fiestaArdillas(50, false));
        System.out.println( ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio 02 multa:");
        System.out.println( ejercicio.multa(60, false));
        System.out.println( ejercicio.multa(65, false));
        System.out.println( ejercicio.multa(65, true));
       
        System.out.println("Ejercicio 03 muy Vanidoso:");
        System.out.println( ejercicio.muyVanidoso(22));
        System.out.println( ejercicio.muyVanidoso(23));
        System.out.println( ejercicio.muyVanidoso(24));
        
        System.out.println("Ejercicio 04 movil:");
        System.out.println( ejercicio.movil(false, false, false));
        System.out.println( ejercicio.movil(false, false, true));
        System.out.println( ejercicio.movil(true, false, false));
        
        System.out.println("Ejercicio 05 a5:");
        System.out.println( ejercicio.a5(1,7,11));
        System.out.println( ejercicio.a5(1,7,10));
        System.out.println( ejercicio.a5(11,1,7));
        
         System.out.println("Ejercicio 06 dos Enteros:");
        System.out.println( ejercicio.dosEnteros(12, 23));
        System.out.println( ejercicio.dosEnteros(12, 43));
        System.out.println( ejercicio.dosEnteros(12, 44));
    }
    
}
