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
    
    
    
    public boolean movil (boolean dormido, boolean matinal, boolean madre){
        if(dormido){
            return false;
        }
        if (matinal && madre){
            return true ;
        }
        if (!dormido && !matinal && !madre){
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
    }
    
}
