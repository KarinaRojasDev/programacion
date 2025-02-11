package ejerciciosficheros;
import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Escribir una función que pida dos números n y m entre 1 y 10,
        lea el fichero tabla-n.txt con la tabla de multiplicar de ese número,
        y muestre por pantalla la línea m del fichero.
        Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.
         */

        int[] datosPedidos = pedirDatos();
        lecturaFichero(datosPedidos[0],datosPedidos[1]);
    }
    static int[] pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer número entre el 1 y el 10");
        int tabla= scanner.nextInt();
        System.out.println("Introduzca el segundo número entre el 1 y el 10");
        int linea=scanner.nextInt();
        return new int []{tabla,linea};
    }
    static void lecturaFichero(int n,int linea){
        File fichero= new File("tabla-"+n+".txt");
        BufferedReader lectura =null;
        try{
            lectura =new BufferedReader(new FileReader(fichero));
            String lecturaFichero;
            int cont=1;
            while((lecturaFichero=lectura.readLine())!=null){
                if(cont==linea){
                    System.out.println(lecturaFichero);
                }
                cont++;              //el contador va fuera del if sino no cuenta
            }
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no existe "+fichero);
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }finally {
            if(lectura!=null){
                try{
                    lectura.close();
                }catch(IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
