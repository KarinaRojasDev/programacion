package ejercicios;
import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;
import javax.management.MBeanAttributeInfo;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*.En una clase de 5 alumnos se han realizado tres exámenes y se requiere
        determinar el número de:

        a) Alumnos que aprobaron todos los exámenes.

        b) Alumnos que aprobaron al menos un examen.

        c) Alumnos que aprobaron únicamente el último examen.

       Realice un programa que permita la lectura de los datos y el cálculo de las
       estadísticas.
       */
        Scanner kpr = new Scanner(System.in);
        int[] alumno = new int[5];
        int examen1, examen2 , examen3;
        int contTodos = 0, uno = 0, ultimo = 0;
        for (int i = 1; i <= alumno.length; i++) {
            System.out.println("Alumno " + i + " introduzca sus notas");
            examen1 = kpr.nextInt();
            System.out.println("Alumno " + i + " introduzca sus notas");
            examen2 = kpr.nextInt();
            System.out.println("Alumno " + i + " introduzca sus notas");
            examen3 = kpr.nextInt();
            if (examen1 > 5 && examen2 >= 5 && examen3 > 5) {
                contTodos++;
            }
            if (examen1 < 5 || examen2 < 5 || examen3 < 5) {
                uno++;
            }
            if (examen3 >= 5 && examen1 < 5 && examen2 < 5) {
                ultimo++;
            }
        }
        System.out.println("Todos los alumnos han aprobado todos los "+ contTodos+" examenes");
        System.out.println("Todos los alumnos han aprobado al menos "+uno+" examenes");
        System.out.println("Al menos todos los alumnos han aprobado el último examen "+ ultimo);
    }

}


