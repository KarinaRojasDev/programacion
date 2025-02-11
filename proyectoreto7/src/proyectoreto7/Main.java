package proyectoreto7;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*Reto 7. Crear una aplicación de listado.
        Para ello el sistema deberá mostrar por consola de forma recursiva
        todas las carpetas, subcarpetas y ficheros de una ruta concreta
        (por ejemplo, la carpeta del directorio de tu perfil),
        nada más arrancar la aplicación.
        */
    public static void main(String[] args) {
        Main operacionesRealizadas = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la ruta absoluta del directorio que desea buscar: ");
        String rutaAbsoluta = scanner.nextLine();
        File directorio = new File(rutaAbsoluta);

        operacionesRealizadas.procesarDirectorios(directorio);

    } public void procesarDirectorios(File f) {

        File[] ficheros = f.listFiles();
        System.out.println(f.getAbsoluteFile());
        for(File directorio :ficheros) {
            System.out.println(directorio.getAbsoluteFile());
            if (directorio.isDirectory()) {
                procesarDirectorios(directorio);
            }
        }
    }
}
