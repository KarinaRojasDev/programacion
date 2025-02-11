package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {        //EXAMEN EJERCICIO
    public static void main(String[] args) {
        /*3 Crea un array de una longitud de 5 valores. Pide los valores al usuario.
         Después pide un sexto valor y comprueba si ese sexto valor
         equivale a la suma del resto de elementos del array.
         */
        Scanner kpr=new Scanner(System.in);
        int[] array= new int[5];
        int num,num1;
        int suma=0;
        for(int i=1; i<=array.length; i++) {
            System.out.println("Introduzca el número "+(i));
            num = kpr.nextInt();
            suma= num+i;
            suma ++;
        }
        System.out.println("Ahora introduzca el valor 6 ");
        num1 = kpr.nextInt();
        for(int j=1; j<=5; j++){
            if(suma==num1) {
                System.out.println("El sexto valor si equivale a la suma del restro de los elementos");
                break;
            }else {
                System.out.println("El sexto valor no equivale a la suma del resto de los elementos");
            }
        }
    }
}
