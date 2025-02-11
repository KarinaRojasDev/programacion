package ejercicios;
import java.util.Scanner;
public class Ejercicio1metodos {
    public static void main(String[] args){
         /*.En una clase de 5 alumnos se han realizado tres exámenes y se requiere
        determinar el número de:

        a) Alumnos que aprobaron todos los exámenes.

        b) Alumnos que aprobaron al menos un examen.

        c) Alumnos que aprobaron únicamente el último examen.

       Realice un programa que permita la lectura de los datos y el cálculo de las
       estadísticas.
       */

        int[] datosObtenidos = obtenerNotas();
        mostrarResultado(datosObtenidos);


    } static int[] obtenerNotas(){
        Scanner scanner= new Scanner(System.in);
        int[] alumnos= new int[6];
        int examen1=0,examen2=0,examen3=0;
        int contA=0;
        int contB=0;
        int contC=0;
        for(int i=1; i<alumnos.length; i++){
            System.out.println("Alumno "+(i)+" introduzca su nota del primer examen");
            examen1 = scanner.nextInt();
            System.out.println("Alumno "+(i)+" introduzca su nota del segundo examen");
            examen2= scanner.nextInt();
            System.out.println("Alumno "+(i)+" introduzca su nota del tercer examen");
            examen3= scanner.nextInt();

            if(examen1>=5 && examen2>=5 && examen3>=5) {
                contA++;
            }if (examen1 >=5 || examen2>=5 || examen3>=5) {
                contB++;
            }if (examen1<5 && examen2<5 && examen3>=5) {
                contC++;
            }
        }return new int[] {contA,contB,contC};
    }
    static void mostrarResultado(int[] contadores){

        System.out.println("Los alumnos han aprobado todos los examenes "+contadores[0]);
        System.out.println("Los alumnos han aprobado al menos un examen "+contadores[1]);
        System.out.println("Los alumnos han aprobado solo el tercer examen "+contadores[2]);
    }
}
