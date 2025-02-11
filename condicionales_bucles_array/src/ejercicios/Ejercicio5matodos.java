package ejercicios;
import java.util.Scanner;
public class Ejercicio5matodos {
    public static void main(String[] args) {
           /*5. Realice un programa que solicite al usuario que
        piense un número entero entre el 1 y el 100.
        El programa debe tener guardado en una variable el número
        que tiene que adivinar el usuario, e indicarle al usuario
        si el número que digito es menor o mayor , así hasta que lo adivine.
         y por último mostrarle el número de intentos que le llevo.
         (HAZLO USANDO MÉTODOS)
         */


        int aleatorio = generarAleatorio();
         int numero = juego();
        calculoDatos(aleatorio,numero);
    }
    static int generarAleatorio(){
        int aleatorio=(int)(Math.random()*100+1);
        return aleatorio;
    }
    static int juego () {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Piensa un número entre el 1 y el 100");
        int numero= scanner.nextInt();
        return numero;
    }
    static void calculoDatos(int aleatorio,int numero) {
        Scanner scanner=new  Scanner(System.in);
        int cont=1;
        while(aleatorio != numero) {
            if(aleatorio>numero){
                System.out.println("El número que buscamos es mayor");
                numero= scanner.nextInt();
                cont++;

            }if(aleatorio<numero) {
                System.out.println("El número que buscamos es menor");
                numero= scanner.nextInt();
                cont++;
            }

        }
        System.out.println("Enhora buena has acertado mi número ");
        System.out.println("Número de intentos "+cont);
    }
}

