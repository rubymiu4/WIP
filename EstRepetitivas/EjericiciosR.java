package EstRepetitivas;

import java.util.Scanner;

/**
 * EjerciciosR 
 */
public class EjericiciosR {

    public static void imprimirWhile_20() {
        int numInit=21;
        while (numInit<=21) {
            System.out.println(numInit);
            numInit=numInit+1;
        }  
    }  
   public static void imprimirDoWhile_20() {
       int numInit =21;
       do {
           System.out.println(numInit);
       } while (numInit<=20); 
   } 
   public static void imprimirForN1_20() {
       for (int numInit = 1; numInit<=20; numInit++) {
           System.out.println(numInit);  
       } 
   }
   public static void nombrevertical() {
       Scanner lt=new Scanner(System.in);
       System.out.println("Ingrese su nombre");
       String nombre=lt.next();
       for (int i= 0; i< nombre.length(); i++) {
           System.out.println(nombre.charAt(i));
       }
       
   }
  
    public static void main(String[] args) {

      /*System.out.println("Imprime While"); imprimirWhile_20(); 
      System.out.println("Imprime Do While"); imprimirDoWhile_20();
      System.out.println("Imprime For"); imprimirForN1_20();*/

      nombrevertical();

      
 

     }
    
}

 

