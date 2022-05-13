package ActividadExamen;

import java.util.Scanner;

 /**
 * EjercicioARNMQ 
 */

 public class EjercicioUno {

     static Scanner leerTeclado=new Scanner(System.in);

     public static void pregunta1RNMQ() {
         //Definir Variables
         double n1, n2, n3, promedio;
         String nivel;
         //Datos de Entrada
         System.out.println("Examen de Conocimiento:");
          n1=leerTeclado.nextDouble();
         System.out.println("Entrevista Personal:");
          n2=leerTeclado.nextDouble();
         System.out.println("Test Psicologico:");
          n3=leerTeclado.nextDouble();
         //Proceso
          promedio=n1*0.40+n2*0.35+n3*0.25;
         if (promedio>=17 && promedio<=20) {
             nivel="Logro obtener vacante su nivel es Cuatro";} 
         else if (promedio<17 && promedio>=14) {
             nivel="Logro obtener vacante su nivel es Tres"; }
         else if (promedio<=14 && promedio>=11) {
             nivel="Logro obtener vacante su nivel es Dos";  }
         else {
             nivel="No alcanzo vacante su nivel es Uno"; }

        //Datos de Salida
          System.out.println(nivel);
        
     }
public static void main(String[]args) {
    pregunta1RNMQ();

}
 }