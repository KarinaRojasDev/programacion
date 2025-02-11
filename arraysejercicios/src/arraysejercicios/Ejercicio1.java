package arraysejercicios;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*Crea un array de 10 posiciones de números con valores pedidos por teclado.
         Muestra por consola el indice y el valor al que corresponde.
         Haz dos métodos, uno para rellenar valores y otro para mostrar.
         */
        Ejercicio1 operaciones = new Ejercicio1();
        int[] datosPedidos = operaciones.rellenarValores();
        operaciones.mostrarValores(datosPedidos);

    }
    private int[] rellenarValores (){
        int[] posiciones = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<posiciones.length;i++){
            System.out.println("Introduzca el valor "+(i+1));
            posiciones[i] = scanner.nextInt();
        }
        return posiciones;
    }
    private void mostrarValores(int[] posiciones){
        for(int i=0; i<posiciones.length; i++){
            System.out.println("el valor "+(i+1)+" su valor es "+posiciones[i]);
        }
    }
}
