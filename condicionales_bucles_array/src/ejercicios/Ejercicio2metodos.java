package ejercicios;
import java.util.Scanner;
public class Ejercicio2metodos {
    public static void main(String[] args) {
        /*.      Hacer un que realice la serie fibonacci -> 1 1 2 3 5 8 13...n
      La sucesión de Fibonacci es una secuencia de números en la que,
      después del 0 y del 1, cada número de la serie se obtiene sumando los dos anteriores.
      De esta manera la secuencia sería:
      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1.597….
      (HAZ UNA VERSIÓN CON RECURSIVIDAD Y OTRA SIN RECURSIVIDAD)
        */
        int datosPedidos = pedirDatos();
        datosFibonacci(datosPedidos);

    }
    static void datosFibonacci(int numero){
        int x=0;
        int y=1;
        int z;
        for(int i=1; i<numero; i++){
            System.out.println(x);
            z=x+y;
            y=x;
            x=z;
        }

    }
    static int pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo Fibonacci: introduzca el valor de la secuencia que desea hallar ");
        int serie = scanner.nextInt();
        return serie;
    }
}
