package ejerciciosficheros;
import java.io.*;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        /*Escribir una función que pida un número entero entre 1 y 10,
         lea el fichero tabla-n.txt con la tabla de multiplicar de ese número,
         done n es el número introducido, y la muestre por pantalla.
         Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.
         */

        int datosPedidos = pedirDatos();
        obtenerResultados(datosPedidos);

    }
    static int pedirDatos(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número de la tabla que desea leer");
        n = scanner.nextInt();
        return n;
    }
    static void obtenerResultados(int n) {
        File fichero = new File("tabla-"+n+".txt");
        BufferedReader lecturaFichero = null;
        try{
            lecturaFichero = new BufferedReader(new FileReader(fichero));
            String lectura;
            while ((lectura=lecturaFichero.readLine())!=null){               //cuidadp con el while siempre {
                System.out.println(lectura);
            }
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no existe "+fichero);
        }catch(IOException ex){
            ex.printStackTrace();
        }finally {
            if(lecturaFichero !=null){
                try{
                    lecturaFichero.close();
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
