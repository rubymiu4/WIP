import java.util.Scanner;

public class EjercicioCondMult {

public void profesor() {
 System.out.println("Enseñar");   
}

public void estudiante() {
System.out.println("Aprender o Estudiar");    
}

public static void maquinaPC() {
 System.out.println("Procesa informacion");   
}

public static void proyector() {
 System.out.println("Proyecta imagenes");    
}

 public static void main(String[] args) {
    EjercicioCondMult obj=new EjercicioCondMult();
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese el numero de algoritmo:\n1=profesor\n2=estudiante"+
    "\n3=maquinaPC\n4=proyector");
    int opcionMet=lt.nextInt();
    

    switch (opcionMet) {
        case 1:obj.profesor();break;
        case 2:obj.estudiante();break;
        case 3:maquinaPC();break;
        case 4:proyector();break;
        default: System.err.println("Esa opcion no existe");break;
    }
 }   
}
