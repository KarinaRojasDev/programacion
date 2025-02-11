package ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        /*6.Realiza una aplicación con diseño modular, mediante la cual se permita realizar
        las siguientes operaciones

         1.     Calcular potencia.*******    :)
         2.     Calcular raíz cuadrada.******   :)
         3.     Calcular factorial. (con recursividad)
         -          Cada una de las opciones ejecutará un método por el cual deberá devolver
         el dato correspondiente a la operación solicitada.
         -          Los datos serán pedidos por consola y pasados a los métodos,
         utilizando tantos como sean necesarios.
         -          Tanto el punto 1 como en el 2 se debe utilizar métodos de la librería Math
         - 4   Haz un punto cuatro que sea para salir del bucle,
         ya que el menú se va a ir repitiendo una y otra vez.
         */
        System.out.println("Ejecución iniciada");
        int calculo=pedirDatos();     //trabajar con calculo
        int resultado = calculoP(calculo);
        System.out.println("\nEl resultado obtenido del número introducido es "+resultado);
        int resultadoR= calculoR(calculo);
        System.out.println("El resultado obtenido de la raiz cuadrada es "+resultadoR);
        int resultadoF=calculoF(calculo);
        System.out.println("El resultado obtenido de la factorial es "+ resultadoF);

    } static int pedirDatos(){
        int base;
        Scanner kpr= new Scanner(System.in);
        System.out.println("Introduzca el valor que desea calcular ");
        base= kpr.nextInt();
        return base;
    }
    static int calculoP(int base) {
        Scanner kpr = new Scanner(System.in);
        int resultado;
        System.out.println("A que potencia quieres elevar este número "+base);
        int potencia= kpr.nextInt();
        resultado =(int)Math.pow(base,potencia);
        return resultado;

    }static int calculoR(int raizC) {
        int resultRaizC;
        resultRaizC = (int)Math.sqrt(raizC);
        return resultRaizC;

    } static int calculoF(int f) {
        int resultadoF=1;
        for(int i=1; i<=f; i++) {
            resultadoF=resultadoF*(i);
        }return resultadoF;
    }
}
