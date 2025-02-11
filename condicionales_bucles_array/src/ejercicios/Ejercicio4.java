package ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        /*Pide al usuario por teclado una frase y pasa sus caracteres
         a un array de caracteres. Puedes hacer con o sin métodos de String.
         */
        String result = pedirDatos();
        calculoArray(result);

    }static String pedirDatos(){
        Scanner kpr =new Scanner(System.in);
        String fraseU;
        System.out.println("Introduzca una frase o palabra que desee");
        fraseU = kpr.nextLine(); /// SI TIENE EAPACIOS SE PONE NEXTLINE , SI SOLO ES UNA PALABRA ES NEXT
        return fraseU;
    } static void calculoArray(String frase){
        char[] resultArray= new char[frase.length()];
        for(int i=0; i<frase.length(); i++) {
            resultArray[i]=frase.charAt(i);
            System.out.println(resultArray[i]);
        }
    }
}
