package arraysejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // 5) Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
        // Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta,
        // se añadira a una cadena que se mostrara al final,
        // se dejará de insertar cuando se introduzca un -1.
        //
        // Por ejemplo, si escribo los siguientes numeros
        // 0 //Añadira la ‘A’
        // 5 //Añadira la ‘F’
        // 25 //Añadira la ‘Z’
        // 50 //Error, inserte otro numero
        // -1 //fin
        //
        // Cadena resultante: AFZ

        //String[] caracteres = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        Scanner scanner =new Scanner(System.in);
        char[] caracteres = new char[26];

        for(int i=0; i<caracteres.length; i++){
            caracteres[i] = (char)('A'+i);
            System.out.println("Introduce un número ");
            int posicion = scanner.nextInt();
            String cadena =" ";
            //System.out.println("Por favor, ingrese las posiciones del array (0-25). Ingrese -1 para finalizar:");

            while ((posicion = scanner.nextInt()) != -1) {
                if (posicion >= 0 && posicion < 26) {
                    cadena += caracteres[posicion]; // Concatenar el carácter al final de la cadena
                } else {
                    System.out.println("Error: Por favor, ingrese un número entre 0 y 25.");
                }
            }

            System.out.println("resultado de la cadena: " + cadena);
        }
    }
}
