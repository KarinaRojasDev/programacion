package ejercicios;
import java.util.Scanner;
public class Ejercicio6metodos {
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

        int[] datosPedidos = pedirDatosPotencia();
        int potencia = calculoPotencia(datosPedidos);
        int datosRaiz = pedirDatosRaiz();
        int raiz = calculoRaiz(datosRaiz);
        int factorial = factorial(datosRaiz);
        mostrarResultados(potencia,raiz,factorial);

    }
    static int[] pedirDatosPotencia() {
        Scanner scanner =new Scanner (System.in);
        System.out.println("introduzca la base");
        int base= scanner.nextInt();
        System.out.println("por que cantidad quiere multiplicar la base");
        int exponente= scanner.nextInt();
        return new int[]{base,exponente};
    }
    static int calculoPotencia(int[] datos){
        int potencia= (int)Math.pow(datos[0],datos[1]);
        return potencia;
    }
    static int pedirDatosRaiz(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el valor de la raiz que desea calcular");
        int raiz = scanner.nextInt();
        return raiz;
    }
    static int calculoRaiz(int datos){
        int raiz= (int)Math.sqrt(datos);
        return raiz;
    }
    static int factorial(int numero){
        //caso base

        int resultado;
        if(numero==1){
            resultado=1;
        }
        //caso recursivo

        else{
            resultado = numero*factorial(numero-1);
        }
        return resultado;
    }
    static void mostrarResultados(int potencia, int raiz, int factorial ){
        System.out.println("El resultado obtenido de la potencia es: "+potencia);
        System.out.println("El valor de la raiz cuadrada es: "+raiz);
        System.out.println("El resultado del factorial es: "+factorial);
    }
}
