package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        /*5. Realice un programa que solicite al usuario que
        piense un número entero entre el 1 y el 100.
        El programa debe tener guardado en una variable el número
        que tiene que adivinar el usuario, e indicarle al usuario
        si el número que digito es menor o mayor , así hasta que lo adivine.
         y por último mostrarle el número de intentos que le llevo.
         (HAZLO USANDO MÉTODOS)
         */
        int calculo =aleatorio();
        int dato=pedirDatos();
        calculoDatos(calculo,dato);

    } static int aleatorio(){
        int aleatorio;
        aleatorio = (int) (Math.random()*100+1);
        return aleatorio;
    }
    static int pedirDatos() {
        int num;
        Scanner kpr= new Scanner(System.in);
        System.out.println("Piense un número y escribalo ");
        num = kpr.nextInt();
        return num;
    }
    static void calculoDatos(int numA, int num){
        Scanner kpr=new Scanner(System.in);
        int cont=1;
        while(numA!=num){
            if(numA<num) {
                System.out.print("El número buscado es menor ");
                num= kpr.nextInt();
                cont++;
            }
            if(numA>num) {
                System.out.println("El número buscado es mayor ");
                num= kpr.nextInt();
                cont++;
            }
        }
        System.out.println("El número introducido es correcto ");
        System.out.println("número de veces introducido "+cont);
    }
}
