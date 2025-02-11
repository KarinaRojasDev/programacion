package proyectoreto6;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) {


        /*Reto 6. Realiza una aplicación de adivinación. Para ello se deberán seguir la
         siguiente secuencia de acciones:
         a. El sistema generará un número aleatorio (entre 0 y 20)
         b. Seguidamente el sistema irá pidiendo números al usuario de forma
         recurrente hasta que coincida con el aleatorio generado
         c. En cada número introducido, en caso de no coincidir mostrará el mensaje
         "Lo siento, inténtalo de nuevo". Cuando coincida el número introducido
         con el que introduce el usuario deberá mostrar el mensaje "Enhorabuena,
         has acertado el número en 5 intentos".
         d. Cuando se adivine el número se deberá escribir en un fichero llamado
         juego.txt el nombre del usuario y el número de intentos realizados con el
         siguiente formato: nombre, intentos (Borja,6)
         */

        String nombre= obtenerNombre();
        int numeroAleatorio=obtenerNumeroAleatorio();
        int numeroIngresado=obtenerNumeroIngresado();
        int contadorIntentos =validarResultado(numeroAleatorio,numeroIngresado);
        String frase= crearFrase(contadorIntentos,nombre);
        crearFichero();
        escribir(frase);


    }

    static int obtenerNumeroAleatorio() {
        int number;
        number = (int) ((Math.random() * 21) + 1);
        return number;
    }
    static String obtenerNombre() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre ");
        name = scanner.next();
        return name;
    }
    static int obtenerNumeroIngresado(){
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("introduzca un numero entre el 0 y el 20");
        number= scanner.nextInt();
        return number;
    }
    static int validarResultado(int numAleatorio, int numIngresado){
        Scanner scanner=new Scanner(System.in);
        int cont=1;
        while(numAleatorio!=numIngresado){
            System.out.println("Lo siento intentelo de nuevo");
            numIngresado= scanner.nextInt();
            cont++;
        }
        System.out.println("Enhorabuena, has acertado el número en "+cont+" intentos ");
        return cont;
    }
    static File crearFichero () {  //quitarlo
        File fichero;
        fichero = new File ("juego.txt");
        if(!fichero.exists()) {
            try{
                fichero.createNewFile();
            } catch (IOException ex) {
                System.out.print("Error "+ex);
            }
        }return fichero;
    }
    static void escribir (String frase) {              //buferedWriter FileWriter

        try {
            FileWriter escritura = new FileWriter(("C:\\Programación DAM\\proyectoreto6"));
            for (int i=0; i<frase.length();i++) {
                escritura.write(frase.charAt(i));
            }

        } catch (IOException ex) {
            System.out.print("Error "+ex);
        }

    }
    static String crearFrase(int contador,String nombre){
        String frase;
        frase = nombre+", "+contador;
        return frase;
    }
}

