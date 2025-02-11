package ejercicios;
import java.util.Scanner;
public class Ejercicio3metodos {
    public static void main(String[] args) {
        /*3 Crea un array de una longitud de 5 valores. Pide los valores al usuario.
         Después pide un sexto valor y comprueba si ese sexto valor
         equivale a la suma del resto de elementos del array.
         */
        int[]datosPedidos = pedirDatos();
        obtenerResultado(datosPedidos);

    }
    static int[] pedirDatos(){
        Scanner scanner= new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<array.length; i++) {
            System.out.println("Introduce el valor "+(i+1));
            array[i]= scanner.nextInt();
        }return array;
    }
    static void obtenerResultado(int[] Valores){
        Scanner scanner =new Scanner(System.in);
        int sumaValores=0;
        for(int i=0; i<Valores.length; i++){
            sumaValores = sumaValores+ Valores[i];
        }
        System.out.println("Introduzca un sexto valor");
        int sextoValor = scanner.nextInt();
        if(sextoValor==sumaValores){
            System.out.println("El sexto valor es igual a la suma de los cinco valores");
        }
        else {
            System.out.println("El sexto valor no es igual a la suma de los cinco valores ingresados");
        }
    }
}
