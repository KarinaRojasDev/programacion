package arraysejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         Crea un array de números donde le indicamos por teclado el tamaño del array,
         rellenaremos el array con números aleatorios entre 0 y 9,
         al final muestra por pantalla el valor de cada posición
         y la suma de todos los valores.
         Haz un método para rellenar el array
         (que tenga como parámetros los números entre los que tenga que generar),
          para mostrar el contenido y la suma del array
          y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
         */
        Ejercicio2 operaciones = new Ejercicio2();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Cuantos numeros desea calcular");
        int tamanoArray = scanner.nextInt();
        int[] tamano = new int[tamanoArray];

        int[] datos = operaciones.obtenerDatos(tamano);
        operaciones.obtenerResultados(datos);
    }
    private int[] obtenerDatos(int[] tamano){
        int suma =0;
        for(int i=0;i<tamano.length; i++){
            tamano[i] = (int)(Math.random()*10)+1;
            suma += tamano[i];
        }

        System.out.println("La suma de los elementos "+suma);
        return tamano;
    }
    private void obtenerResultados(int[] valores){
        for(int i=0;i<valores.length;i++){
            System.out.println("El elemento "+(i+1)+" tiene un valor de "+valores[i]);
        }
    }
}
