package arraysejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
        Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
        Puedes hacer con o sin métodos de String.
         */

        pedirDatos();
    }
    static void pedirDatos(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = scanner.nextLine();

        char[] caracteres = new char[frase.length()];
        for(int i=0;i<frase.length();i++){
            caracteres[i] = frase.charAt(i);
            System.out.println(caracteres[i]);
        }
    }
}