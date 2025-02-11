package ejercicios;

import java.util.Scanner;

public class Bombillas {
    public static void main(String[] args) {
        //4. Hay 2 bombillas apagadas(b1 y b2).
        // Introducir por teclado valores válidos
        // para el día del mes y el mes.
        // Si día del mes y el mes es par encender b1.
        // Si día o el mes es impar encender b2.
        // USAR VARIABLES DE TIPO BOOLEAN
        Scanner kpr = new Scanner(System.in);
        boolean b1 = true;
        boolean b2= false;
        int dia;
        int mes;
        System.out.println("Introduzca un valor para el dia");
        dia= kpr.nextInt();
        System.out.println("Introduzca un valor para el mes");
        mes= kpr.nextInt();
        if(dia % 2 == 0 && mes % 2 == 0) {
            System.out.println(b1+" ");
        } else {
            System.out.println(b2+" ");
        }
    }
}
