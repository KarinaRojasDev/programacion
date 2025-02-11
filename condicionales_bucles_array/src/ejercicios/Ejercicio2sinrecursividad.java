package ejercicios;

import java.util.Scanner;

public class Ejercicio2sinrecursividad {
    public static void main(String[] args) {
         /*.      Hacer un que realice la serie fibonacci -> 1 1 2 3 5 8 13...n
      La sucesión de Fibonacci es una secuencia de números en la que,
      después del 0 y del 1, cada número de la serie se obtiene sumando los dos anteriores.
      De esta manera la secuencia sería:
      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1.597….
      (HAZ UNA VERSIÓN CON RECURSIVIDAD Y OTRA SIN RECURSIVIDAD)
        */
        int num=15;
        calculoDatos(num);

    } static void calculoDatos ( int n){
        int num=0;
        int num1=1;
        int num3;
        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num3=num+num1;
            num=num1;
            num1=num3;
        }
    }
}

