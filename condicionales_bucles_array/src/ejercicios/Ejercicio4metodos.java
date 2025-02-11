package ejercicios;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio4metodos {
    public static void main(String[] args) {
          /*Pide al usuario por teclado una frase y pasa sus caracteres
         a un array de caracteres. Puedes hacer con o sin métodos de String.
         */
        String frase = pedirDatos();
        obtenerResultado(frase);

    }
    static String pedirDatos(){
        String frase;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = scanner.nextLine();
        return frase;
    }
    static void obtenerResultado(String frase){
        char[] fraseObteniada= new char[frase.length()];
        for(int i=0; i<frase.length(); i++){
            fraseObteniada[i] = frase.charAt(i);
            System.out.println(fraseObteniada[i]);
        }
    }
}
