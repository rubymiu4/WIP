package EstRepetitivas;

import java.util.Scanner;

/**
 * EjercicioVarios
 */
public class EjercicioVarios {
    static Scanner leerT=new Scanner(System.in);

    public static int factorialN(int numero) {
        int resultado=1;
        if (numero>1) {
            for (int i = 1; i <= numero; i++) {
                resultado=resultado*i;
            } 
            }
        return resultado;

        
    }
    public static void main(String[] args) {
        System.out.println("Ingrese un numero:");
        int num=leerT.nextInt();
        System.out.println(factorialN(num));
     }
}
