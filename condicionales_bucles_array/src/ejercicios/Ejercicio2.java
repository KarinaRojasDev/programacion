package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*.      Hacer un que realice la serie fibonacci -> 1 1 2 3 5 8 13...n
      La sucesión de Fibonacci es una secuencia de números en la que,
      después del 0 y del 1, cada número de la serie se obtiene sumando los dos anteriores.
      De esta manera la secuencia sería:
      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1.597….
      (HAZ UNA VERSIÓN CON RECURSIVIDAD Y OTRA SIN RECURSIVIDAD)
        */
        int calculo=devolver();
        calculoDtos(calculo);

    } static void calculoDtos(int num) {
        int n1=0;
        int n2=1;
        int n3;
        for (int i=0; i<num; i++) {
            System.out.println(n1);
            n3=n1+n2;
            n2=n1;
            n1=n3;
        }
    }static int devolver() {
        Scanner kpr= new Scanner(System.in);
        System.out.println("Introduzca un número a calcular");
        int valor = kpr.nextInt();
        return valor;
    }

}
