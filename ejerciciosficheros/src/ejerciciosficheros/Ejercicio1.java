package ejerciciosficheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Ejercicio1 {
    public static void main(String[] args) {
        /*Escribir una función que pida un número entero entre 1 y 10
        y guarde en un fichero con el nombre tabla-n.txt la tabla de
        multiplicar de ese número, done n es el número introducido.
         */

        int datosPedidos = pedirDatos();
        File ficheroCreado = crearFichero(datosPedidos);
        mostrarResultados(datosPedidos,ficheroCreado);

    }static int pedirDatos(){
        int n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduzca el número que deses multiplicar");
        n= scanner.nextInt();
        return n;
    }
    static File crearFichero(int n){
        File f = new File("tabla-"+n+".txt");
        if(!f.exists()){
            try{
                f.createNewFile();
                System.out.println("Fichero creado");
            }catch(IOException ex){
                throw new RuntimeException(ex);
            }
        }else {
            System.out.println("Error en la creación del fichero");
        }return f;
    }
    static void mostrarResultados(int n, File f){
        BufferedWriter bw = null;
        try{
            bw =new BufferedWriter(new FileWriter(f,false));
            for(int i=1; i<=10;i++){
                bw.write(n+"*"+i+"="+(n*i));
                bw.newLine();
            }
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }finally {
            if(bw !=null){
                try{
                    bw.close();
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
